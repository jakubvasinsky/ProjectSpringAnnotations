package sk.kosickaakademia.vasinsky.projectSpringDemoAnnotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
private FortuneService fortuneService;

public TennisCoach(){/*prazdny konstruktor */ System.out.println(">> Inside TennisCoach constructor <<");};

/*
@Autowired
public TennisCoach(FortuneService theFortuneService){
    fortuneService = theFortuneService;
}*/
@Autowired
    public void setFortuneService(FortuneService theFortuneService) {
    System.out.println(">> Inside TennisCoach setter <<");
       fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
