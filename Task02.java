package test.Task2;

public class Task02 {
    public static void main(String[] args) {
        double [] num = {1, -2, 3, -0.7, 5, 6, 4, 4.3, -0.2};
        int numOfReplace = 0;
        double z = 3.5;

        for(int i = 0; i < num.length; i++){
            if(num[i] > z){
                num[i]=z;
                numOfReplace++;
            }
            System.out.println(num[i]);
        }
        System.out.println("Number of replacement: "+ numOfReplace);
    }
}