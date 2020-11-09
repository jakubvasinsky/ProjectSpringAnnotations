package sk.kosickaakademia.vasinsky.projectSpringDemoAnnotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("randomFortuneService")
private FortuneService fortuneService;

public TennisCoach(){/*prazdny konstruktor */ System.out.println(">> Inside TennisCoach constructor <<");};


@PostConstruct
public void DoMyStartupStuff(){
    System.out.println(">>TennisCoach: Inside the DoMyStartupStuff<<");
}
@PreDestroy
    public void DoMyCleanupStuff(){
        System.out.println(">>TennisCoach: Inside the DoMyCleanupStuff<<");
    }


/*
@Autowired
public TennisCoach(FortuneService theFortuneService){
    fortuneService = theFortuneService;
}*/
 /*
@Autowired
    public void setFortuneService(FortuneService theFortuneService) {
    System.out.println(">> Inside TennisCoach setter <<");
       fortuneService = theFortuneService;
    }*/



    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
