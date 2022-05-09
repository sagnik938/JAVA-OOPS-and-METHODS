public class Recursion {
    public static int factorial(int n){
        if(n == 0 || n == 1 ){
            return (1);
        }
        return(n*factorial(n-1));
    }

    public static int fibo(int n){
        if(n==1){
            return(0);
        }
        if(n==2){
            return(1);
        }
        return(fibo(n-1) + fibo(n-2));
    }

    public static void main(String[] args){
        System.out.println(factorial(10));
        System.out.println(fibo(3));
    }
}
