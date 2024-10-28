package com.example.PdfToTxt.utils;

public class Formate {

	public String changeVowels(String text, String vowelToChange, String newVowel) {
	String formatedText = "";
	
	formatedText = text.replaceAll(vowelToChange, newVowel);
	
	return formatedText;
	}
}
