package iloveyouboss;

import static org.junit.Assert.*;

import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void answersArithmeticMeanOfTwoNumbersTest() {
		ScoreCollection coll = new ScoreCollection();
		coll.add(() -> 5);
		coll.add(() -> 7);
		
		int actualResult = coll.arithmeticMean();
		
		assertThat(actualResult, equalTo(6));
		
	}
}
