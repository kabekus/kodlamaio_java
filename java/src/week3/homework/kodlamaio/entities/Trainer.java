package week3.homework.kodlamaio.entities;

public class Trainer {
    private int id;
    private String trainerName;
    public Trainer(int id, String trainerName) {
        this.id = id;
        this.trainerName = trainerName;

    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

}
