package DSA;

public class DPExample {
//Dynamic programming: calculate the fibonacci sequence iteratively to optimize space
    public static int fibonacci(int n){
        if(n<=1) return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
public static void main(String args[]){
        int n=10;
        System.out.println("Fibonacci of " +n+ "is: "+fibonacci(n));
}
}
