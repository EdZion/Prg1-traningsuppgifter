/*
Övning 5.1 i boken
2019-10-10
Programmerare Alexander Holmström
*/
import javax.swing.*;
public class Uppgift_5_1{
	public static void main (String [] args){
			String s = JOptionPane.showInputDialog("n?");
			int n = Integer.parseInt (s);
			int summa = 0;
			int k = 1;
			while (k <= n){
				summa = summa + k*k;
				k = k +1;
			}
			JOptionPane.showMessageDialog(null,"Summan blir" + summa);
	}
}