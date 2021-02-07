package com.techelevator;

public class HomeworkAssignment {
		// Instance variables
		private int earnedMarks;
		private int possibleMarks;
		private String submitterName;
		
		// Getters and Setters
		public int getEarnedMarks() {
			return earnedMarks;
		}
		public void setEarnedMarks(int earnedMarks) {
			this.earnedMarks = earnedMarks;
		}
		public int getPossibleMarks() {
			return possibleMarks;
		}
		public String getSubmitterName() {
			return submitterName;
		}
		public String getLetterGrade() {
			double earnedDouble = (double) (earnedMarks);
			double possibleDouble = (double) (possibleMarks);
			double percentCorrect = (earnedDouble / possibleDouble) * 100.00;
			if(percentCorrect >= 90) {
				return "A";
			} else if(percentCorrect >= 80) {
				return "B";
			} else if(percentCorrect >= 70) {
				return "C";
			} else if(percentCorrect >= 60) {
				return "D";
			} else {
				return "F";
			}
			
		}
		
		// Constructor
		public HomeworkAssignment(int possibleMarks, String submitterName) {
			this.possibleMarks = possibleMarks;
			this.submitterName = submitterName;
		}
}
