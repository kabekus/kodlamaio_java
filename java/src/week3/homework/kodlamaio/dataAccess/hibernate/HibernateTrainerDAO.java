package week3.homework.kodlamaio.dataAccess.hibernate;

import week3.homework.kodlamaio.dataAccess.TrainerDAO;
import week3.homework.kodlamaio.entities.Course;
import week3.homework.kodlamaio.entities.Trainer;

public class HibernateTrainerDAO implements TrainerDAO {
    @Override
    public void add(Trainer trainer) {
        System.out.println(trainer.getTrainerName()+" Hibernate ile veritabanına eklendi");
    }
}
