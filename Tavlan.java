import javax.swing.*;
public class Tavlan {
	public static void main (String [] args){
		int fee;
		int age = 19;
		if (age <= 6){
			fee = 0;
		} else if (age <= 20){
				fee = 10;
		} else if (age <=26){
			fee = 15;
		} else if (age <=65){
			fee = 20;
		} else {
			fee = 15;
		}
		
		int month = 10;
		int days;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30
				break;
			case 2:
				days = 28;
				break;
			}	 
	}
}
public class Tavlan {
	public static void main (String [] args){
		for(int i = 0 ; i <14 ; i++){
			System.out.println("Hello World")
		}
	}	
}

public class Tavlan {
	public static void main (String [] args){
		int i=0;
		while(i<14){
			System.out.println("Hello World")
		}
			i ++;
	}
}