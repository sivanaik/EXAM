package palindrome;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
	int num,x,sum=0,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	num= sc.nextInt();

	x=num;
	while(num>0){
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
	}

	if(x==sum){
	System.out.println("palindrome");
	}
	else{
	System.out.println("not palindrome");
	}
	sc.close();

	}
	}




