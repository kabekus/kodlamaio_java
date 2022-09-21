package week1;

public class ReCapDemo {
    public static void main(String[] args) {

        int num1=20, num2=25, num3=2, maxNum=num1;

        if (maxNum<num2){
            maxNum = num2;
        }else if (maxNum<num3){
            maxNum = num3;
        }

        System.out.print("Largest number: "+maxNum);
    }
}

