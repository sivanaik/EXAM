package polymorphism;

public class Overloading {
	public void addition(){
		
	}
	public void addition(int a){
		System.out.println("r");

}
	public void addition(int a, int b){
		System.out.println("a+b");
	}
	public void addition(int a, float b){
		System.out.println("a/b");
		
	}
	public static void main(String[] args) {
		Overloading siva=new Overloading();
		siva.addition(1000,5f);
	}
}
		
