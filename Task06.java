package test.Task2;

public class Task06 {
    public static void main(String[] args) {
        double[] num = {2.4, 5, 1.9, 1, 0.1, 5.1, 7, 2.3, 2, 7.6};
        int sum = 0;
        for (int i = 0; i< num.length; i++) {
            if(isPrime(i)){
                sum+=num[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int value){
        if(value<2){
            return false;
        } else {
            for(int i = 2; i<= value/2; i++){
                if(value%i == 0){
                    return false;
                }
            }
        } return true;
    }
}