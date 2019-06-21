package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int number = 0; 
		
		// 2.  Ask the user a question 
		String a = JOptionPane.showInputDialog(null,"What is 789*10");
		// 3.  Use an if statement to check if their answer is correct
		if ("7890".equals(a)) { number += 1;}
			
		
		// 4.  if the user's answer was correct, add one to their score 
	
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String b = JOptionPane.showInputDialog(null,"X=12 Y=2 X*(Y*Y)=");
		if("48".equals(b)) { number += 2;}
		// 6.  After all the questions have been asked, print the user's score 
		String d = JOptionPane.showInputDialog(null,"x=12 z=2 y=5 x*((y*y)*(z*z))=");
		if ("480".equals(d)) { number += 3;}

System.out.println(number);
	}
}
