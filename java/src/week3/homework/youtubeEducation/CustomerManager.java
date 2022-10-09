package week3.homework.youtubeEducation;

public class CustomerManager {

    private Customer customer;
    private ICreditManager iCreditManager;
    public CustomerManager(Customer customer,ICreditManager iCreditManager) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }
    public void save(){
        System.out.println("Müşteri Kaydedildi.");
    }

    public void giveCredit(){
        iCreditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
