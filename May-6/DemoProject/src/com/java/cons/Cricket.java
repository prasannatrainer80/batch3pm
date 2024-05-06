package com.java.cons;

public class Cricket {

	static int score;
	
	public void increment(int x) {
		score=score+x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.increment(12);
		sb.increment(7);
		ext.increment(19);
		
		System.out.println("Total Score   " +Cricket.score);
	}
}
