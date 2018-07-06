package lesson_10;

public class Main_10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		int student_score;
		String student_name;
		
		String students_name;
	
		Grade student1 = new Grade("ˆÉ“¡",60);
		Grade student2 = new Grade("—é–Ø",88);
		Grade student3 = new Grade("²“¡",40);
		Grade student4 = new Grade("’†R",74);
		Grade student5 = new Grade("’r“c",95);
		Grade student6 = new Grade("’rR",80);


		students_name = student1.getName();
		student1.setResult(60);
		result = student1.getResult();
		

		
		student_name = student2.getName();
		student2.setResult(88);
		result = student2.getResult();
		
		
		System.out.println(student_name + ":" + result);
		
	}

}
