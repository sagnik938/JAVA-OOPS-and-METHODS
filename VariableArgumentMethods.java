public class VariableArgumentMethods {
    //no amount of param is compulsory
    public static int sum(int ...arr){
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        return (sum);
    }
    // one param is compulsory
    public static int modifiedsum(int x,int ...arr){
        int sum = x;
        for(int a: arr){
            sum += a;
        }
        return(sum);
    }

    public static void main(String args[]){
        //sum
        System.out.println("Sum varargs");
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));

        //modified sum
        System.out.println("Compulsory1 modifiedsum");
        System.out.println(modifiedsum(9));
        System.out.println((modifiedsum(9,10,11)));
    }
}
