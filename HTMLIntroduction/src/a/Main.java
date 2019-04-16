package a;

public class Main {

	public static void main(String[] args) {
		CalculatorModel cm = new CalculatorModel();
		System.out.println("result = " + cm.getResult());

		cm.add(5);
		System.out.println("result = " + cm.getResult());

		cm.sub(2);
		System.out.println("result = " + cm.getResult());

		cm.multiply(4);
		System.out.println("result = " + cm.getResult());

		cm.div(3);
		System.out.println("result = " + cm.getResult());

		cm.reset();
		System.out.println("result = " + cm.getResult());

	}

}
