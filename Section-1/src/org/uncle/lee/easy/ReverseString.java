package org.uncle.lee.easy;

public class ReverseString {
	public String reverseString(String s) {
		char[] chars = s.toCharArray();
		int charsLength = chars.length;

		char[] newChars = new char[charsLength];

		for (int i = 0; i < charsLength; i++) {
			newChars[i] = chars[charsLength - 1 - i];
		}

		return new String(newChars);
	}
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(new ReverseString().reverseString(str));
	}
}
