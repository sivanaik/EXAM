package abstraction;

public class A extends B {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("rrrrr");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	public static void run() {
		System.out.println("###");
	
	}

	/**@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}*/
	public static void main(String[] args) {
		A r=new A();
		r.read();
		r.write();
	//	r.walk();
	//	r.run();
	}


}
