package com.api.apple;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.apple.StringEx;

/**
 * @author DeepikaJammula
 * This test is to validate "Given a String and a Character, remove all instances of the Character in the String"
 *
 */
public class StringTest {
	
	/**
	 * PositiveTest
	 * Input string with multiple words
	 */
	@Test
	public void stringTest_1(){
		String inputString = "Hello World";
		char replaceChar = 'l';
		String expectedString = "Heo Word";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	
	/**
	 * PositiveTest
	 * Replace char is "space"
	 */
	@Test
	public void stringTest_2(){
		String inputString = "Hello World";
		char replaceChar = ' ';
		String expectedString = "HelloWorld";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	
	/**
	 * PositiveTest
	 * Input string with one words
	 */
	@Test
	public void stringTest_3(){
		String inputString = "World";
		char replaceChar = 'o';
		String expectedString = "Wrld";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	
	/**
	 * NegativeTest
	 * Replace char doesn't exist in input String
	 */
	@Test
	public void stringTest_4(){
		String inputString = "Hello World";
		char replaceChar = 'x';
		String expectedString = "Hello World";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	/**
	 * NegativeTest
	 * Input string "space"
	 */
	@Test
	public void stringTest_5(){
		String inputString = " ";
		char replaceChar = 'x';
		String expectedString = " ";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	/**
	 * PositiveTest
	 * Removing number
	 */
	@Test
	public void stringTest_6(){
		String inputString = "Hello12 World123";
		char replaceChar = '2';
		String expectedString = "Hello1 World13";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	/**
	 * PositiveTest
	 * Removing special characters
	 */
	@Test
	public void stringTest_7(){
		String inputString = "Hello@**@World";
		char replaceChar = '@';
		String expectedString = "Hello**World";
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}
	/**
	 * NegativeTest
	 * Input String is null
	 */
	@Test
	public void stringTest_8(){
		String inputString = null;
		char replaceChar = 'u';
		String expectedString = null;
		
		Assert.assertEquals(expectedString, StringEx.removeChar(inputString, replaceChar));
		Assert.assertEquals(expectedString, StringEx.removeChar2(inputString, replaceChar));
		
	}

}
