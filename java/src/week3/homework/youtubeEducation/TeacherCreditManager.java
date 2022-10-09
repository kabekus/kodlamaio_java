package week3.homework.youtubeEducation;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı");
    }

}
