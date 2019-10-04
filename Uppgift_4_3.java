/*
Övning 4.2 i boken
2019-10-04
Programmerare Alexander Holmström
*/
import javax.swing.*;
public class Uppgift_4_3{
	public static void main (String [] args){
		
		String S =JOptionPane.showInputDialog(null,"Skirv dina poäng"); 
		int poäng = Integer.parseInt(S);
		String betyg;
			if (poäng >= 25){
				betyg= "E";
			} else if (poäng >= 30){
				betyg = "D";
			}  else if (poäng >= 35){
				betyg = "C";
			} else if (poäng >= 40){
				betyg = "B";
			} else if (poäng >= 45){
				betyg = "A";
			} else {
				betyg = "F";
			}
			JOptionPane.showMessageDialog(null, "Du fick betyget" + betyg);
	}
}
		
		

