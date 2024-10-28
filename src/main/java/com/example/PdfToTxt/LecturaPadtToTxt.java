package com.example.PdfToTxt;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import com.example.PdfToTxt.io.PDFConverter;
import com.example.PdfToTxt.io.Writter;
import com.example.PdfToTxt.utils.Formate;

public class LecturaPadtToTxt {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(LecturaPadtToTxt.class, args);
		
		// Declare variables with the necesary parameters
		String pathLectura = "src/main/resources/WhatisLoremIpsum.pdf";
		String pathEscritura = "src/main/resources/GeneratedDoc.txt";
		String targetVowel = "[Aa]";
		String finalVowel = "@";
		
		// Initialize the objects we need
		PDFConverter pdfConverter = new PDFConverter();
		Writter writter = new Writter();
		Formate changeVowels = new Formate();
		
		// Parse the PDF document to a String text
		String originalText = pdfConverter.parsePDF(pathLectura);
		
		// We proccess the text with the correct method
		String formatedtext = changeVowels.changeVowels(originalText, targetVowel, finalVowel);
		
		// We writte the text in a txt format
		writter.writteText(formatedtext, pathEscritura);
		

	}

}
