package week2.homework.recapdemoClass;

public class Main {
    public static void main(String[] args) {
        int num1 = 5, num2 = 56;

        FourTransactions fourTransactions = new FourTransactions();
        int gather = fourTransactions.addition(num1, num2);
        int interest = fourTransactions.extractionProcess(num1, num2);
        int multiply = fourTransactions.multiplication(num1, num2);
        int plenty = fourTransactions.division(num1, num2);

        System.out.println("Toplama sonucu: " + gather +
                "\nÇıkarma sonucu: " + interest +
                "\nÇarpma sonucu: " + multiply +
                "\nBölme sonucu: " + plenty);
    }
}
