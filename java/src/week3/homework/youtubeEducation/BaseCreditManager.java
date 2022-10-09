package week3.homework.youtubeEducation;

public abstract class BaseCreditManager implements ICreditManager{
   public abstract void calculate();

   public  void save(){
        System.out.println("İşlem kaydedildi");
   }
}
