package sk.kosickaakademia.vasinsky.projectSpringDemoAnnotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] data= {
"Array content 0",
"Array content 1",
"Array content 2"
    };
    private Random myRandom = new Random();




    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
