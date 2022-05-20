package week1.day2.homeAssignment;

public class MyCalculator {
	
	//calling methods from other class here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculators myCal = new Calculators();
		int Add = myCal.performAdd(5, 6, 4);
		System.out.println("The answer of addition is: " +Add);
		int Subtract = myCal.performSubtract(5, 3);
		System.out.println("The answer of subtraction is: "+Subtract);
		double Mul = myCal.performMul(125.25, 258.36);
		System.out.println("The answer of multiplication is :" +Mul);
		float Divide = myCal.performDivide(15.45f, 3.15f);
		System.out.println("The answer of division is:" +Divide);	
		

	}

}
