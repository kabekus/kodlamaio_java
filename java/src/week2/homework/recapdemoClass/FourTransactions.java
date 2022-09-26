package week2.homework.recapdemoClass;

public class FourTransactions {

    public int addition(int num1, int num2){
        return num1 + num2;
    }

    public int extractionProcess(int num1, int num2){
        if (num1>num2){
            return num1-num2;
        }else
            return num2-num1;
    }

    public int multiplication(int num1, int num2){
        return num1*num2;
    }

    public int division(int num1, int num2){
        if (num1>num2){
            return num1/num2;
        }else
            return num2/num1;
    }
}
