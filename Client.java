package HW701;

public class Client {
	public static void main(String[] args) {
		
		TeamGroup OlympicsTeams=new TeamGroup("Olympics Teams", 100, 100);;
		TeamGroup AsiaTeam=new TeamGroup("Asia Team", 25,25);
		TeamComponent AfricaTeam=new Team("Africa Team", 25,25);
		TeamGroup EuropeTeam=new TeamGroup("Europe Team", 25,25);
		TeamComponent SouthAmericaTeam=new Team("South America Team", 25,25);
		TeamGroup ChinaTeam=new TeamGroup("China Team", 15,20);
		TeamComponent AfghanistanTeam=new Team("Afghanistan Team", 10,5);
		TeamGroup ChinaWomensTeam=new TeamGroup("China-Women", 13,15);
		TeamComponent Taekwando=new Team("Women´s Taekwando", 5, 8);
		TeamComponent Waterpolo=new Team("Women´s Waterpolo", 5, 2);
		TeamComponent ArtisticGymnastics=new Team("Women´s Artistic Gymnastics", 3, 5);
		TeamGroup ChinaMensTeam=new TeamGroup("China-Men", 2,5);
		TeamComponent Shooting=new Team("Men´s Shooting", 2, 5);
		TeamGroup GermanyTeam=new TeamGroup("Germany Team", 18,20);
		TeamGroup GermanyWomensTeam=new TeamGroup("Germany-Women", 9,11);
		TeamGroup GermanyMensTeam=new TeamGroup("Germany-Men", 9,9);
		TeamComponent Cycling=new Team("Women´s Cycling", 5, 6);
		TeamComponent Tennis=new Team("Women´s Tennis", 4, 5);
		TeamComponent TableTennis=new Team("Men´s Table Tennis", 4, 7);
		TeamComponent Football=new Team("Men´s Football", 5, 2);
		
		
		OlympicsTeams.add(AsiaTeam);
		AsiaTeam.add(ChinaTeam);
		AsiaTeam.add(AfghanistanTeam);
		ChinaTeam.add(ChinaWomensTeam);
		ChinaTeam.add(ChinaMensTeam);
		ChinaWomensTeam.add(Taekwando);
		ChinaWomensTeam.add(Waterpolo);
		ChinaWomensTeam.add(ArtisticGymnastics);
		ChinaMensTeam.add(Shooting);
		
		OlympicsTeams.add(EuropeTeam);
		EuropeTeam.add(GermanyTeam);
		GermanyTeam.add(GermanyWomensTeam);
		GermanyWomensTeam.add(Cycling);
		GermanyWomensTeam.add(Tennis);
		GermanyTeam.add(GermanyMensTeam);
		GermanyMensTeam.add(TableTennis);
		GermanyMensTeam.add(Football);
		
		OlympicsTeams.add(AfricaTeam);
		OlympicsTeams.add(SouthAmericaTeam);


		GermanyMensTeam.getNameAndNumberOfAthletes();
		GermanyTeam.getNameAndNumberOfMedals();
		AsiaTeam.getNameAndNumberOfMedals();
		OlympicsTeams.getNameAndNumberOfAthletes();
		
	}
}
