import java.util.Scanner;


public class CourseGradesDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		CourseGrades courseGrades = new CourseGrades();
		GradedActivity lab;
		PassFailExam passFailExam;
		GradedActivity essay;
		FinalExam finalExam;
		int score, maxScore;
		
		System.out.print("Please enter the score given on the lab: ");
		score = keyboard.nextInt();
		System.out.print("Please enter the highest score possible on the lab: ");
		maxScore = keyboard.nextInt();
		lab = new GradedActivity(score, maxScore);
		
		System.out.print("\nPlease enter the number of questions correct on the pass/fail exam: ");
		score = keyboard.nextInt();
		passFailExam = new PassFailExam(score);
		
		System.out.print("\nPlease enter the score given on the essay: ");
		score = keyboard.nextInt();
		System.out.print("Please enter the highest score possible on the essay: ");
		maxScore = keyboard.nextInt();
		essay = new GradedActivity(score, maxScore);
		
		System.out.print("\nPlease enter the questions correct on the final exam: ");
		score = keyboard.nextInt();
		finalExam = new FinalExam(score);
		
		
		courseGrades.setLab(0, lab);
		courseGrades.setPassFailExam(1, passFailExam);
		courseGrades.setEssay(2, essay);
		courseGrades.setFinalExam(3, finalExam);
		
		System.out.println("\n" + courseGrades.toString());
		System.out.println("Average score: " + courseGrades.getAverage() + "%");
		System.out.println("Highest score: " + courseGrades.getHighest().getPercentage() + "%");
		System.out.println("Lowest score: " + courseGrades.getLowest().getPercentage() + "%");
	}
}
