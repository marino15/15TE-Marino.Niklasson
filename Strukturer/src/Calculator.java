import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		
		Scanner liamochludwig = new Scanner (System.in);
		double firstNum, secondNum;
		String symbol;
		
			System.out.println("Ge mig numret nuuu!");
		firstNum = liamochludwig.nextDouble();
			System.out.println("ANDRA NUMRET NUUUU JAG BLIR ARG");
		secondNum = liamochludwig.nextDouble();

		Scanner op = new Scanner(System.in);
			System.out.println("bror vilken symbol?");
				symbol = op.next();
			
		switch (symbol) {
		
		case "+":
			System.out.println("Ditt resultat blir " +(firstNum + secondNum));
			break;
		
		case "-":
			System.out.println("Ditt resultat blir " +(firstNum - secondNum));
			break;
			
		case "*":
			System.out.println("Ditt resultat blir " +(firstNum * secondNum));
			break;
			
		case "/":
			System.out.println("Ditt resultat blir " +(firstNum / secondNum));
			break;
			
		default:
			System.out.println("�r du helt dum i huvudet eller?");
		}
		
	}
}
