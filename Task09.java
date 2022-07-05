package test.Task2;

public class Task09 {
    public static void main(String[] args) {
        int n = 10;
        int[] num = new int[n];
        for (int i = 0; i<num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println(num[i]);
        }
        int repeatedNum = num[0];
        int repCount = 1;
        int count = 0;
        for (int k : num) {
            for (int i : num) {
                if (k == i) {
                    count++;
                }
            }
            if (((repCount == count) && (repeatedNum > k)) || (repCount < count)) {
                repeatedNum = k;
                repCount = count;
            }
            count = 0;
        }
        System.out.println();
        System.out.println("Repeated number is: " + repeatedNum + "\n"+ "With number of counts: " + repCount);//wtf?
    }
}
