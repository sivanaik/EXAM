package singleinheritence;

public class F extends G {
	public void read(int x){
		System.out.println("bujja");
		
	}
	public static void main(String[] args) {
		G ref=new F();
		ref.siva();
	}

}
