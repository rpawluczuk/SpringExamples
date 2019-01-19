package SpringDemo;

public class CalisthenicCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Give me 100 push ups";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
