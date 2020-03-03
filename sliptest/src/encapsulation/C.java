package encapsulation;

public class C {
	public static void main(String[] args) {
		D siva=new D();
		
		siva.setStudentName("bujja");
		siva.setStudentAge(21);
		siva.setStudentRank(100);
		System.out.println(siva.getStudentName());
		System.out.println(siva.getStudentAge());
		System.out.println(siva.getStudentRank());
		
		
		
	}

}
