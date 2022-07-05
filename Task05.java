package test.Task2;

public class Task05 {
    public static void main(String[] args) {
        double []num = {2.4, 5, 1.9, 1, 0.1, 5.1, 7, 2.3, 2, 7.6};;

        for(int i =0; i<num.length; i++){
            if(i < num[i]){
                System.out.println(num[i]);
            }
        }
    }
}