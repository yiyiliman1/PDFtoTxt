package com.example.PdfToTxt.models;

public class Lines {
	
	private String line;
		
		public String getLine() {
			return line;
		}
	
		public void setLine(String line) {
			this.line = line;
		}
	
		@Override
		public String toString() {
			return "Line " + line;
		}
}
