package root.service.impl;

import root.bo.Trainer;
import root.repository.TrainerRepository;
import root.service.TrainerService;

import java.util.Optional;

public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        Optional<Trainer> trainer = trainerRepository.findById(name);
        return null;
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
        return trainer ;
    }
}
