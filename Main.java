public class Main {
    public static int Knapsack01(int a[] ,int prof[], int n,int W){
       if(W<=0 || n<=0){
           return(0);
       }
       else if (a[n-1]<=W){
           return( Math.max(prof[n-1] + Knapsack01(a ,prof,n-1,W-a[n-1]) , Knapsack01(a,prof,n-1,W) ) );
       }
       else {
           return( Knapsack01(a,prof,n-1,W));
       }
    }

    public static void main(String[] args) {
        System.out.println("Max Profit is:");
        int a[] = {1,2,3,4,5};
        int prof[] = {1,1,2,2,3};
        System.out.println(Knapsack01(a,prof, a.length, 5));
    }
}