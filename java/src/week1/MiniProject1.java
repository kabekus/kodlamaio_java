package week1;

public class MiniProject1 {
    public static void main(String[] args) {
        int num = 25, remainder = num % 2;
        boolean isPrime = true;

        if (num==1){
            System.out.println("Sayı Asal Değil");
        } else if (num<1) {
            System.out.println("Geçersiz Sayı");
        }

        for (int i=2 ; i<num ; i++){
            if (num % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Sayı Asaldır");
        }else{
            System.out.println("Sayı Asal Değildir");
        }
    }
}
