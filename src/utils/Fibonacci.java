package utils;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fibonacci {

    private List<Integer> nums = new ArrayList<>();

    public Fibonacci(){
        nums.add(0);
        nums.add(1);
    }

    public int getN(int N){
        if(nums.size()-1<N){
            nums.add(getN(N-1)+getN(N-2));
        }
        return nums.get(N);
    }
}
