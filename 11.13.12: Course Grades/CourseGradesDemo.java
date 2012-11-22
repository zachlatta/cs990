
public class CourseGradesDemo
{
	public static void main(String[] args)
	{
		CourseGrades courseGrades = new CourseGrades();
		GradedActivity lab = new GradedActivity(23, 25);
		PassFailExam passFailExam = new PassFailExam(6);
		GradedActivity essay = new GradedActivity(68, 75);
		FinalExam finalExam = new FinalExam(48);
		
		courseGrades.setLab(0, lab);
		courseGrades.setPassFailExam(1, passFailExam);
		courseGrades.setEssay(2, essay);
		courseGrades.setFinalExam(3, finalExam);
		System.out.println(courseGrades.toString());
	}
}
