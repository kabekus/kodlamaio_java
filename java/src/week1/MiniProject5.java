package week1;

public class MiniProject5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,5,8,7};
        int search = 84;
        boolean isThere = false;

        for (int num : numbers){
            if (num == search){
                isThere = true;
                break;
            }
        }

        if (isThere){
            System.out.println("Sayı mevcuttur");
        }else
            System.out.println("Sayı mevcut değildir");
    }
}
