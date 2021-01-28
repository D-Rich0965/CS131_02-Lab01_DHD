
public class Lab1Application {


public static void main(String args[]){
	Rectangle myRectangle = new Rectangle(5,7);
	DateManipulator myDate = new DateManipulator();
	myRectangle.calculateArea();
	DistanceCalculator.calculateDistance(4, 4, 10, 13);
	myDate.isLeapYear(1892);
	int sum = BasicMath.add(7,24);
	int difference  = BasicMath.subtract(5,3);
	int product = BasicMath.multiply(12,10);
	double quotient = BasicMath.divide(3,7);
	System.out.println("The sum of 7 and 24 is "+ sum);
	System.out.println("The difference between 5 and 3 is "+ difference);
	System.out.println("The product of 12 and 10 is "+ product);
	System.out.println("the quotient of 3 and 7 is " + quotient);
}	
}
