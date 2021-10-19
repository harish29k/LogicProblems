package logicalproblems;
/*
 * Fibonacci series is a special type of series in which the next term is the sum of the
     previous two terms.
 */
public class Fibonoci {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, range = 8;
		System.out.println("the fobonacy series is :");
		System.out.println(+num1);
		System.out.println(+num2);

		for (int i = 1; i <= range; i++) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println("" + num3);
		}
	}

}
