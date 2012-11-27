
public class FinalExam extends GradedActivity
{
	private static final int MAX_QUESTIONS = 50;
	
	/**
	 * Accepts the number of questions correct on the final
	 * exam. Calls the GradedActivity constructor with the
	 * questions correct and the maximum number of questions.
	 * 
	 * @param questionsCorrect The number of correct answers.
	 */
	public FinalExam(int questionsCorrect)
	{
		super(questionsCorrect, MAX_QUESTIONS);
	}
}
