package SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("SpringDemo")
//@PropertySource("sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService newFortuneService(){
        return new NewFortuneService();
    }

    // define bean for our swim coach AND inject depenedncy
    @Bean
    public Coach calisthenicCoach(){
        return new CalisthenicCoach(newFortuneService());
    }
}
