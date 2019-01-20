package SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // load strings from randomFortune.properties file
    @Value("${fortune1}")
    private String fortune1;

    @Value("${fortune2}")
    private String fortune2;

    @Value("${fortune3}")
    private String fortune3;

    // display the array with fortunes
    public void createArray() {
        String[] array = {fortune1, fortune2, fortune3};
        Arrays.toString(array);
    }

    // create a random number generator
    Random generator = new Random();

    @Override
    public String getFortune() {
        // create an array of Strings
        String[] array = {fortune1, fortune2, fortune3};
        // pick a random string from the array
        int index = generator.nextInt(array.length);
        return array[index];
    }
}
