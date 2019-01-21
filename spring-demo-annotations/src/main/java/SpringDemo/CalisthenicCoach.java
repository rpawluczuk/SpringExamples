package SpringDemo;


public class CalisthenicCoach implements Coach {

    private FortuneService fortuneService;

    public CalisthenicCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Give me 100 pushup in 10 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
