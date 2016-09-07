import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionAnswersTest {

	@Test
	public void test() {
		//assertEquals(9, Largest.largest(new int[] {7,8,9}));
		QuestionAnswers.put("where am i?", "here");
		QuestionAnswers.put("who is darth vader?", "anakin");
		QuestionAnswers.put("example", "example?");
		QuestionAnswers.put("when is my birthday?" , "today");
		QuestionAnswers.put("whats my favorite color?", "gold");
		
		assertEquals(true, QuestionAnswers.testAnswer("where am i?", "here"));
		assertEquals(false, QuestionAnswers.testAnswer("where am i?", "idk"));
		//assertEquals(true, QuestionAnswers.testAnswer("where am i?", "idk"));
		
	}

}
