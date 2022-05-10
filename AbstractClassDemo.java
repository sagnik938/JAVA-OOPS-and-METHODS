/*
Abstract classes set standards for other classes to implement.
Abstract classes have only methods not their implementation.
Objects of abstract classes cannot be made.
Classes inheriting abstract classes must be abstract themselves or implement all abstract methods if concrete.
Classes having one or more abstract methods must be declared abstract.
 */
abstract class gate{
    int x;
    int y;
   public gate(int x,int y){
        this.x = x;
        this.y = y;
    }
    public abstract int logic();
}
class andgate extends gate{
    public andgate(int x,int y){
        super(x,y);
    }
    @Override
    public int logic() {
        return( super.x & super.y);
    }
}

class orgate extends gate{
    public orgate(int x,int y){
        super(x,y);
    }
    @Override
    public int logic(){
        return( super.x | super.y);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        gate g1 = new orgate(0,0);
        gate g2 = new andgate(1,1);
        System.out.println(g1.logic());
        System.out.println(g2.logic());

        //gate g3 = new gate(1,1);

        /*gate g3 = new gate(1,1) {
            @Override
            public int logic() {
                return 0;
            }
        };*/
    }
}
