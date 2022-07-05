package test.Task2;

public class Task08 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbs = new int[n];
        int count = 0;
        System.out.println("Array of integers before removing:");
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = (int) (Math.random() * 100);
            System.out.println(numbs[i]);
        }
        int searchKey = numbs[0];
        for (int num: numbs){
            if(num < searchKey){
                searchKey = num;
            }
        }

        for(int i: numbs){
            if(i == searchKey){
                count++;
            }
        }

        int[]res = new int[numbs.length-count];
        int index = 0;
        for (int value : numbs) {
            if (value > searchKey) {
                res[index++] = value;
            }
        }
        System.out.println("Array of integers after removing:");
        for (int re : res) {
            System.out.println(re);
        }
    }
}