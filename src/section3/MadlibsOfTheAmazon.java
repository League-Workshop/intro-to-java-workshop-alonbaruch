package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
	String Sweat= JOptionPane.showInputDialog(null, "enter an adjective");
	
		// Get the user to enter a type of liquid
	String liquid=	JOptionPane.showInputDialog(null,"enter a liquid");
		// Get the user to enter a body part
		String bodyPart =JOptionPane.showInputDialog(null,"enter a body part");
		// Get the user to enter a verb
	String verb= JOptionPane.showInputDialog(null,"enter a verb");
		// Get the user to enter a place
	String place =	JOptionPane.showInputDialog(null,"enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		
		  JOptionPane.showMessageDialog(null,"Piranhas are more "+ Sweat + "during the day, so cross the river at "
		 + "night. Piranhas are attracted to fresh "+liquid+" and will most"
		 + "likely take a bite out of your "+bodyPart+" if you "+verb+". Whatever"
		 + "you do, if you have an open wound, try to find another way to get"
		 + "back to the "+place+". Good luck!");
		 
		 

		 
		

	}
}

