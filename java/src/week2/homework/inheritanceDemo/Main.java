package week2.homework.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculate(new TeacherCreditManager());
        creditUI.creditCalculate(new SoldierCreditManager());
        creditUI.creditCalculate(new AgricultureCreditManager());
    }
}
