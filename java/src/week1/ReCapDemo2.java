package week1;

public class ReCapDemo2 {
    public static void main(String[] args) {

        double[] myList = {1.2,3.4,5.7};
        double total = 0,maxNum = myList[0];

        for (double num:myList){
            total = total+num;
            System.out.println(num);
            if (maxNum<num){
                maxNum=num;
            }
        }
        System.out.println("Total: "+total);
        System.out.println("Max Number: "+maxNum);
    }
}
