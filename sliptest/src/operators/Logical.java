package operators;
import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>1&&b>1){
	System.out.println("%%%%");
	}
	if(a>1||b>1){
	System.out.println("$$$$");
	}
	if(!(a>1&&b>1)){
	System.out.println("####");
	}
	sc.close();
	}
	}



