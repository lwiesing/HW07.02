package HW701;


public class Team implements TeamComponent{
	private String teamName;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	public Team(String pteamName, int pnumberOfAthletes, int pnumberOfGoldMedals) {
		teamName=pteamName;
		numberOfAthletes=pnumberOfAthletes;
		numberOfGoldMedals=pnumberOfGoldMedals;
	}
	
	@Override
	public void add(TeamComponent C) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(TeamComponent C) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void getNameAndNumberOfAthletes() {
		// TODO Auto-generated method stub
		System.out.println("Team: "+ getTeamName()+ ", Number of Athlets: "+ getNumberOfAthletes());
	}
	
	public void getNameAndNumberOfMedals() {
		// TODO Auto-generated method stub
		System.out.println("Team: "+ getTeamName()+ ", Number of Gold Medals: "+ getNumberOfGoldMedals());
		
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}

	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}

	public String getTeamName() {
		return teamName;
	}
	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}

	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}
	
	

}
