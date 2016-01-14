import javax.swing.JButton;

public class Application {

	public static void main(String[] args) {

		stringMethod();
		
		comparePrimitives();
		
		compareReference();
		
		explicitConversion();

		guessAnimal();

		instanceOfComparison();
		
		truncate();
		
	}
	

	public static void truncate() {
		int smallNumber = 10;
		double largeNumber = 3000000000.0456789;
		smallNumber = (int) largeNumber; //LargeNumber will be truncated - the extra decimal places get '"taken off" resulting in the loss of 4 bytes worh of precision.
		System.out.println(smallNumber);
		addSeperator();
	}

	public static void instanceOfComparison () {
		String s = new String("foo");
		if (s instanceof String) {
		System.out.println("s is a String");
		}
		addSeperator();
	}	
	
	public static void guessAnimal() {
		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLength = 1.630;

		if (weight >= 500) { 
			animal = "elephant"; }

		if (colorWaveLength > 1.621) { 
			animal = "gray " + animal; }

		if (sex <= 'f') {
			animal = "female " + animal; }

		System.out.println("The animal is a " + animal);
		addSeperator();
	}
	
	public static void explicitConversion() {
		int height = 8;
		double mass = 2450.23456;
		double result =  (double) height + (int) mass; 
		System.out.println("Result: " + result);
		addSeperator();
	}
	
	public static void compareReference() {
		JButton a = new JButton("Exit");
		JButton b = new JButton("Exit");
		JButton c = a;
		System.out.println("Is reference a == b? " + (a == b));
		System.out.println("Is reference a == c? " + (a == c));
		addSeperator();
	}
	
	public static void stringMethod(){
		Application b1 = new Application();
		Application b2 = new Application();
		Application b3 = b1;

		String s1 = "Bob";
		String s2 = "Bob";
		String s3 = "bob";

		System.out.println(b1.equals(b2)); 
		System.out.println(b1.equals(b3)); 
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3)); 
		addSeperator();
	}

	public static void comparePrimitives() {
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		System.out.println("5 != 6? " + (5 != 6));
		System.out.println("5.0 == 5L? " + (5.0 == 5L));
		System.out.println("true == false? " + (true == false));
		addSeperator();
	}
	
	public static void addSeperator(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

}
