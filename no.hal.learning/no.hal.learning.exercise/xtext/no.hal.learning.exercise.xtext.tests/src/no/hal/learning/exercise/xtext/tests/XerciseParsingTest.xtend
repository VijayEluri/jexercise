/*
 * generated by Xtext 2.9.1
 */
package no.hal.learning.exercise.xtext.tests

import com.google.inject.Inject
import no.hal.learning.exercise.Exercise
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import no.hal.learning.exercise.Answer
import no.hal.learning.exercise.ExercisePart
import no.hal.learning.exercise.Task
import no.hal.learning.exercise.SimpleAnswer
import no.hal.learning.exercise.StringAnswer
import no.hal.learning.exercise.OptionsAnswer
import no.hal.learning.exercise.Option

@RunWith(XtextRunner)
@InjectWith(XerciseInjectorProvider)
class XerciseParsingTest{

	@Inject
	ParseHelper<Exercise> parser;

 	def Answer parseAnswer(String answerSource) {
		val quiz = parser.parse('''exercise "?" «answerSource»''')
    	checkAnswer(quiz)
 	}
 	
 	def Answer checkAnswer(Exercise exercise) {
 		Assert.assertEquals(1, exercise.parts.size)
	   	Assert.assertTrue(exercise.parts.head instanceof ExercisePart)
	   	val tasks = (exercise.parts.head as ExercisePart).tasks
	   	Assert.assertEquals(1, tasks.size)
	   	val task = tasks.head as Task
 		return task.a
 	}
	
	def assertTrue(double value) {
		Assert.assertEquals(1.0, value, 0.0)
	}
	
	def <T> SimpleAnswer<T> checkSimpleAnswer(Answer a, T value, T correct) {
	   	Assert.assertTrue(a instanceof SimpleAnswer<?>)
	   	val sa = a as SimpleAnswer<T>
	   	Assert.assertEquals(value, (a as SimpleAnswer<T>).value)
	   	assertTrue(sa.accept(correct ?: value))
	   	sa
 	}

	@Test
	def void parseStringQuestionDefault() {
		val a = parseAnswer('''"Hallvard"''')
	   	checkSimpleAnswer(a, "Hallvard", null)
	   	val sa = a as StringAnswer
	   	Assert.assertFalse(sa.ignoreCase)
	   	Assert.assertFalse(sa.regexp)
 	}
	
	@Test
	def void parseStringQuestionIgnoreCase() {
		val a = parseAnswer('''"Hallvard"~''')
	   	checkSimpleAnswer(a, "Hallvard", "hallvard")
	   	val sa = a as StringAnswer
	   	Assert.assertTrue(sa.ignoreCase)
	   	Assert.assertFalse(sa.regexp)
	   	Assert.assertEquals("Hallvard", sa.value)
 	}
	
	@Test
	def void parseStringQuestionRegex() {
		val a = parseAnswer('''/"Hal(l?)vard"/''')
	   	checkSimpleAnswer(a, "Hal(l?)vard", "Halvard")
	   	val sa = a as StringAnswer
	   	Assert.assertFalse(sa.ignoreCase)
	   	Assert.assertTrue(sa.regexp)
 	}
	
	@Test
	def void parseStringQuestionRegexIgnoreCase() {
		val a = parseAnswer('''/"Hal(l?)vard"/~''')
	   	checkSimpleAnswer(a, "Hal(l?)vard", "halvard")
	   	val sa = a as StringAnswer
	   	Assert.assertTrue(sa.ignoreCase)
	   	Assert.assertTrue(sa.regexp)
 	}
	
	@Test
	def void parseIntegerQuestion() {
		val a = parseAnswer('''2''')
	   	checkSimpleAnswer(a, 2.0, null)
 	}
	
	@Test
	def void parseDoubleQuestion() {
		val a = parseAnswer('''2.3''')
	   	checkSimpleAnswer(a, 2.3, null)
 	}

	@Test
	def void parseDoubleWithMarginQuestion() {
		val a = parseAnswer('''2.3 +- 0.5''')
	   	checkSimpleAnswer(a, 2.3, 1.8)
	   	checkSimpleAnswer(a, 2.3, 2.3)
	   	checkSimpleAnswer(a, 2.3, 2.8)
 	}
	
	@Test
	def void parseTrueQuestion() {
		val a = parseAnswer('''true''')
	   	checkSimpleAnswer(a, true, null)
 	}	
	@Test
	def void parseYesQuestion() {
		val a = parseAnswer('''yes''')
	   	checkSimpleAnswer(a, true, null)
 	}
	
	@Test
	def void parseFalseQuestion() {
		val a = parseAnswer('''false''')
	   	checkSimpleAnswer(a, null, false)
 	}
	@Test
	def void parseNoQuestion() {
		val a = parseAnswer('''no''')
	   	checkSimpleAnswer(a, null, false)
 	}
 	
 	def OptionsAnswer checkOptionsAnswer(OptionsAnswer answer, Pair<Object, Boolean>... answers) {
 		var pos = 0
 		val correctOptionNums = <Integer>newArrayList() 
 		val correctOptions = <Object>newArrayList() 
 		for (Option option : answer.options) {
 			val pair = answers.get(pos)
 			Assert.assertEquals(pair.value, option.correct)
			if (option.correct) {
				correctOptionNums.add(pos)
				correctOptions.add(pair.key)
			}
 			pos++
 		}
		assertTrue(answer.accept(correctOptionNums))
 		answer
 	}

	@Test
	def void parseSingleOptionsAnswer() {
		val a1 = parseAnswer('''() "en" (x) "to" () "tre"''') as OptionsAnswer
		checkOptionsAnswer(a1, "en" -> false, "to" -> true , "tre" -> false)
		val a2 = parseAnswer('''() "en" (x) "to" () "tre" #''') as OptionsAnswer
		checkOptionsAnswer(a2, "en" -> false, "to" -> true , "tre" -> false)
 	}

	@Test
	def void parseMultiOptionsAnswer() {
		val a1 = parseAnswer('''[x] "en" [] "to" [x] "tre"''') as OptionsAnswer
		checkOptionsAnswer(a1, "en" -> true, "to" -> false, "tre" -> true)
		val a2 = parseAnswer('''[x] "en" [] "to" [x] "tre" #''') as OptionsAnswer
		checkOptionsAnswer(a2, "en" -> true, "to" -> false, "tre" -> true)
 	}
}
