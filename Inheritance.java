class base{
    int x;
    public base(){
        System.out.println("Constructor of base");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base{
    int y;
    public derived1(){
        System.out.println("Constructor of derived1.,mjyyjl");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = this.getX() + y;
    }
}

class derived2 extends derived1{
    int z;
    public derived2(){
        System.out.println("Constructor of derived2");
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z + this.getY() + this.getX();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        derived2 s = new derived2();
        s.setX(10);
        s.setY(90);
        s.setZ(100);
        System.out.println("X is "+s.getX());
        System.out.println("Y is "+s.getY());
        System.out.println("Z is "+s.getZ());
    }
}
