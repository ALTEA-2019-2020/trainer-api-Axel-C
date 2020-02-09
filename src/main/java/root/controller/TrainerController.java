package root.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import root.bo.Trainer;
import root.service.TrainerService;

@RestController
@RequestMapping(value="/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping(value="/")
    Iterable<Trainer> getAllTrainers(){
        return trainerService.getAllTrainers();
    }

    @GetMapping(value = "/{name}")
    Trainer getTrainer(@PathVariable("name") String name){
        return trainerService.getTrainer(name);
    }

}
