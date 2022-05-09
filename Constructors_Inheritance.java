class  A{
    int x;
    public A(){
        System.out.println("NonParam Const A");
    }
    public A(int x){
        this.x = x;
        System.out.println("Param Const A with value "+x);
    }
}
class B extends A{
    int y;
    public B(){
        //super();
        System.out.println("NonParam Const B");
    }
    public B(int x,int y){
        super(x);
        System.out.println("Param Const B with x,y as "+x+" "+y);

    }
}
class C extends B{
    public C(){
        System.out.println("NonParam Const C");
    }
    public C(int x, int y,int z){
        super(x,y);
        System.out.println("Param Const C with x,y,z as "+x+" "+y+" "+z);
    }

}

public class Constructors_Inheritance {
    public static void main(String[] args) {
        //C test1 = new C();
        C test2 = new C(10,12,12);
        //C test3 = new C(90,90);

    }
}
