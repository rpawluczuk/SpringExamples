package SpringDemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        Random generator = new Random();
        int i = generator.nextInt(3);
        String randomFortune;
        String[] randomFrotunesArray = new String[3];
        randomFrotunesArray[0] = "Sorry but today you are out of luck";
        randomFrotunesArray[1] = "Today you have a little luck";
        randomFrotunesArray[2] = "I feel that you can win in lotto today!";
        randomFortune = randomFrotunesArray[i];
        return randomFortune;
    }
}
