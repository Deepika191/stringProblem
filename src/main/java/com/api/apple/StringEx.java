package com.api.apple;

/**
 * @author DeepikaJammula
 * Program : Given a String and a Character, remove all instances of the Character in the String
 *
 */
public class StringEx {

	
	//Iterate through the String, one character at a time
	public static String removeChar(String str,char c){

		if(str==null)
			return null;
		StringBuilder str1= new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=c){
				str1.append(arr[i]);
			}
		}
		return str1.toString();
	}

	//Find a method in the String class that can solve this in one line
	public static String removeChar2(String str,char c){
		if(str==null)
			return null;
		//converting a char to String and using String predefined Method
		String replacedString=str.replaceAll(String.valueOf(c), "");
		return replacedString;

	}

}
