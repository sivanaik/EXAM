package operators;
import java.util.Scanner;
public class Arithamatic {
	

	public static void main(String args[]) {
	int a, b, sum, sub, mul, div, mod;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of a");
	a = sc.nextInt();
	System.out.println("enter the value of b");
	b = sc.nextInt();
	sc.close();
	sum = a + b;
	System.out.println("the addition of a and b will be :" + sum);
	sub = a - b;
	System.out.println("the substraction of two numbers will be:" + sub);
	mul = a * b;
	System.out.println("the multiplication of two numbers will be:" + mul);
	div = a / b;
	System.out.println("the division of a and b is:" + div);
	mod = a % b;
	System.out.println("the modulous of a and b: " + mod);
	}
	}




