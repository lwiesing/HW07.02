package HW701;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamGroup implements TeamComponent{
	private String teamName;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	List<TeamComponent> teams = new ArrayList<>();
	
	public TeamGroup(String pteamName, int pnumberOfAthletes, int pnumberOfGoldMedals) {
		teamName=pteamName;
		numberOfAthletes=pnumberOfAthletes;
		numberOfGoldMedals=pnumberOfGoldMedals;
	}
	
	@Override
	public void add(TeamComponent C) {
		// TODO Auto-generated method stub
		teams.add(C);
	}

	@Override
	public void remove(TeamComponent C) {
		// TODO Auto-generated method stub
		teams.remove(C);
	}


	@Override
	public void getNameAndNumberOfAthletes() {
		// TODO Auto-generated method stub
		System.out.println(getTeamName());
		for(TeamComponent T: teams) {
			System.out.println("Team: "+ T.getTeamName()+ ", Number of Athletes: "+ T.getNumberOfAthletes());
			}
		}
	
	
	@Override
	public void getNameAndNumberOfMedals() {
		// TODO Auto-generated method stub
		System.out.println(getTeamName());
		for(TeamComponent T: teams) {
				System.out.println("Team: "+ T.getTeamName()+ ", Number of Gold Medals: "+ T.getNumberOfGoldMedals());
			}
		}

	
	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}


	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}


	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}


	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}

	

	
}
