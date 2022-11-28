package HW701;

public interface TeamComponent {
	
	public void add(TeamComponent C);
	public void remove(TeamComponent C);
	public String getTeamName();
	public int getNumberOfAthletes();
	public int getNumberOfGoldMedals();
	void getNameAndNumberOfMedals();
	void getNameAndNumberOfAthletes();
}
