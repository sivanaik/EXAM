package encapsulation;

public  class D {
	private String studentName;
	private int studentAge;
	private int  studentRank;
	public String getStudentName(){
		return studentName;
}
	public int getStudentAge(){
		return studentAge;

}
	public int getStudentRank(){
		return studentRank;
}
	public void setStudentName(String studentName){
		this.studentName=studentName;
}
	public void setStudentAge(int studentAge){
		this.studentAge=studentAge;
	}
	public void setStudentRank(int studentRank){
		this.studentRank=studentRank;
}
}
