package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class CalisthenicCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Give me 100 pushup in 10 minutes";
    }
}
