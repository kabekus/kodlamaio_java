package week3.homework.kodlamaio.business;

import week3.homework.kodlamaio.core.logging.Logger;
import week3.homework.kodlamaio.dataAccess.TrainerDAO;
import week3.homework.kodlamaio.entities.Trainer;
import java.util.List;

public class TrainerManager {
    private TrainerDAO trainerDAO;
    private Logger[] loggers;
    private List<Trainer> trainers;

    public TrainerManager(TrainerDAO trainerDAO, Logger[] loggers, List<Trainer> trainers) {
        this.trainerDAO = trainerDAO;
        this.loggers = loggers;
        this.trainers = trainers;
    }

    public void add(Trainer trainer){
        for (Trainer trainerOrder : trainers){
            System.out.println(trainerOrder.getTrainerName()+" Adlı öğretmen eklendi.");
        }
    }
}
