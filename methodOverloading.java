public class methodOverloading {
    public static void overload(int a){
        System.out.println("One param "+a);
    }
    public static void overload(int a,int b){
        System.out.println("Two params "+a+" "+b);
    }

    public static void main(String args[]){
        overload(45);
        overload(45,37);
    }

}
