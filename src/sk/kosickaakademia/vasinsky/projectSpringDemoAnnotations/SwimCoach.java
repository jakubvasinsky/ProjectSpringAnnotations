package sk.kosickaakademia.vasinsky.projectSpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;
@Value("${foo.team}")
    private String team;


    public FortuneService fortuneService;
    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1km as a warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }


}
