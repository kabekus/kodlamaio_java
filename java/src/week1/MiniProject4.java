package week1;

public class MiniProject4 {
    public static void main(String[] args) {
        int num1 = 220, num2 = 284, total1 = 0, total2 = 0;

        for (int i=1 ; i<num1 ; i++){
            if (num1 % i == 0){
                total1 += i;
            }
        }

        for (int i=1 ; i<num2 ; i++){
            if (num2 % i == 0){
                total2 += i;
            }
        }

        if (num1 == total2 && num2 == total1){
            System.out.println(num1 + " ve " + num2 + " sayıları arkadaştır.");
        }else
            System.out.println(num1 + " ve " + num2 + " sayıları arkadaş değildir.");
    }
}
