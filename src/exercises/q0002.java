package exercises;

import utils.Fibonacci;

public class q0002 {

    static Fibonacci f = new Fibonacci();

    public static void main(String[] args) {
        System.out.println(EvenFibonacci(4000000));
    }

    static int EvenFibonacci(int maxVal){
        int i = 0;
        int sum = 0;
        while(f.getN(i)<maxVal){
            sum += f.getN(i) % 2 ==0 ? f.getN(i) : 0;
            i++;
        }
        return sum;
    }
}
