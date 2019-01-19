package SpringDemo;

public class CricketCoach implements Coach{

    private  FortuneService fortuneService;

    // add new fields for emailAddress and team
    private  String emailAddress;
    private String team;

    // Create a no-arg constructor
    public CricketCoach() {
        System.out.println("CriceketCoach: inside no-arg constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CriceketCoach: inside setter method - setEmailAdress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CriceketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // Our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CriceketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practie fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
