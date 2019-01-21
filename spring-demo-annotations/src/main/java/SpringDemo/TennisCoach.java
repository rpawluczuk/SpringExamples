package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define a default constructor

    public TennisCoach() {
        System.out.println(">> TenisCouch indisde default constructor");
    }


    // define my init method
//    @PostConstruct
    public void doMyStartupMethod(){
        System.out.println(">> TennisCoach - inside the init method");
    }

    // define my destroy method
//    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach - inside the destroy method");
    }

    /*
    // define a method
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> TenisCouch indisde setter method");
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
