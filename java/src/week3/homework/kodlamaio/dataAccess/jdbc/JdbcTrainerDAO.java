package week3.homework.kodlamaio.dataAccess.jdbc;

import week3.homework.kodlamaio.dataAccess.TrainerDAO;
import week3.homework.kodlamaio.entities.Trainer;

public class JdbcTrainerDAO implements TrainerDAO {
    @Override
    public void add(Trainer trainer) {
        System.out.println(trainer.getTrainerName()+" JDBC ile veritabanına eklendi");
    }
}
