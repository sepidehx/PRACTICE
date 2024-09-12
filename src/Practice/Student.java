package Practice;

public class Student {

	/*
	 Create a class Student that will have a method getGrade. Your
method should accept the score of a student and return a grade:

score > 90 - A

score > 80 - B

score > 70 - C

score > 50 - D

anything else - F
	 */
	
	public String getGrade(int score) {
		String grade="";
		if(score>90)
		{
			grade="A";
		}else if(score>=80)
		{
			grade="B";
		}else if(score>=70)
		{
			grade="C";
		}else if(score>=50)
		{
			grade="D";
		}else if(score<50)
		{
			grade="F";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		String grade= s.getGrade(80);
		System.out.println(grade);
	}
	
	
}
