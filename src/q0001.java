public class q0001 {

    public static void main(String[] args) {
        System.out.println(MultiplesOf3And5(1000));
    }

    static int MultiplesOf3And5(int max){
        int sum = 0;
        for(int i=0;i<max;i+=3){
            sum+=i;
        }
        for(int i=0;i<max;i+=5){
            sum += i%3!=0 ? i : 0;
        }
        return sum;
    }
}
