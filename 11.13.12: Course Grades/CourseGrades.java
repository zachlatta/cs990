import java.text.DecimalFormat;


public class CourseGrades
{
	private GradedActivity[] grades = new GradedActivity[4];
	
	public CourseGrades()
	{
		
	}
	
	public void setLab(int index, GradedActivity lab)
	{
		grades[index] = lab;
	}
	
	public void setPassFailExam(int index, PassFailExam passFailExam)
	{
		grades[index] = passFailExam;
  	}
	
	public void setEssay(int index, GradedActivity essay)
	{
		grades[index] = essay;
	}
	
	public void setFinalExam(int index, FinalExam finalExam)
	{
		grades[index] = finalExam;
	}
	
	public String toString()
	{
		StringBuffer stringBuffer = new StringBuffer();
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		int index = 0;
		double percentage;
		String grade = "\0";
		
		for(GradedActivity assignment : grades)
		{
			percentage = assignment.getPercentage();
			
			if(percentage < 60)
			{
				grade = "F";
			}
			else if(percentage < 63)
			{
				grade = "D-";
			}
			else if(percentage < 67)
			{
				grade = "D";
			}
			else if(percentage < 70)
			{
				grade = "D+";
			}
			else if(percentage < 73)
			{
				grade = "C-";
			}
			else if(percentage < 77)
			{
				grade = "C";
			}
			else if(percentage < 80)
			{
				grade = "C+";
			}
			else if(percentage < 83)
			{
				grade = "B-";
			}
			else if(percentage < 87)
			{
				grade = "B";
			}
			else if(percentage < 90)
			{
				grade = "B+";
			}
			else if(percentage < 93)
			{
				grade = "A-";
			}
			else if(percentage < 100)
			{
				grade = "A";
			}
			
			stringBuffer.append("grades[" + index + "]" + System.getProperty("line.separator") +
					"---------" + System.getProperty("line.separator") +
					"score: " + assignment.getScore() + "/" + assignment.getMaxScore() + System.getProperty("line.separator") +
					"percentage: " + decimalFormat.format(percentage) + "%" + System.getProperty("line.separator") +
					"grade: " + grade + System.getProperty("line.separator") + System.getProperty("line.separator"));
			
			index++;
		}
		
		return stringBuffer.toString();
	}
}
