package b.calculatorView;

import java.util.Scanner;

import a.CalculatorModel;

public class CalculatorUI {

	private Scanner scan = new Scanner(System.in);
	private boolean quit;
	CalculatorModel calculator = new CalculatorModel();

	public static void main(String[] args) {
		CalculatorUI ui = new CalculatorUI();
		ui.start();
	}

	private void start() {
		while (!quit) {
			showMenue();
			System.out.println("Please enter your choice");
			String command = scan.nextLine();
			double value = 0;
			switch (command) {
			case "+":
				System.out.println("Enter number to add");
				value = Double.parseDouble(scan.nextLine());
				calculator.add(value);
				System.out.println(value + "wes added");
				break;
			case "-":
				System.out.println("Enter number to sub");
				value = Double.parseDouble(scan.nextLine());
				calculator.sub(value);
				System.out.println(value + "wes subed");
				break;
			case "*":
				System.out.println("Enter number to multiply");
				value = Double.parseDouble(scan.nextLine());
				calculator.multiply(value);
				System.out.println(value + "wes multiplied");
				break;
			case "/":
				System.out.println("Enter number to divide");
				value = Double.parseDouble(scan.nextLine());
				calculator.div(value);
				System.out.println(value + "wes divided");
				break;
			case "r":
				calculator.reset();
				System.out.println("Reset. Value is " + value);
				break;
			case "q":
				System.out.println("Closeing connection");
				System.out.println("Quit");
				quit = true;
				break;
			default:
				break;
			}
		}
	}

	private void showMenue() {
		System.out.println("\tcalculator menue");
		System.out.println("\tadd........... +");
		System.out.println("\tsub........... -");
		System.out.println("\tmultiply........... *");
		System.out.println("\tdiv........... /");
		System.out.println("\td equals........... =");
		System.out.println("\treset........... r");
		System.out.println("\tquit........... q");
	}

}
