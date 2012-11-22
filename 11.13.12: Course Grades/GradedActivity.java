
public class GradedActivity
{
	private int score;
	private int maxScore;
	
	/**
	 * Accepts the score and the maximum score for an activity. Sets
	 * member fields accordingly.
	 * 
	 * @param score The score given on the activity.
	 * @param maxScore The maximum score for the activity.
	 */
	public GradedActivity(int score, int maxScore)
	{
		setScore(score);
		setMaxScore(maxScore);
	}

	public int getMaxScore()
	{
		return maxScore;
	}

	/**
	 * Returns the percentage on the activity.
	 * 
	 * @return The percentage on the activity.
	 */
	public double getPercentage()
	{
		/*
		 * Not sure why I had to break this into multiple statements. It would return 0 if I
		 * did all of the math in a single statement. Probably some sort of type conversion
		 * error.
		 */
		
		double percentage = getScore();
		percentage /= getMaxScore();
		percentage *= 100;
		
		return percentage;
	}

	public int getScore()
	{
		return score;
	}
	
	public void setMaxScore(int maxScore)
	{
		this.maxScore = maxScore;
	}

	public void setScore(int score)
	{
		this.score = score;
	}
}
