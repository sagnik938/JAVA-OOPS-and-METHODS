import java.util.HashMap;
class P{
    int x;
    int y;
    public P(){
        this.x = 0;
        this.y = 0;
    }
    public P(int x){
        this.x = x;
        this.y = 0;
    }
    public P(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Q extends P{
    int z;
    public Q(){
        this.z = super.x + super.y;
    }
    public Q(int x){
        //Use in constructor calling
        super(x);
        this.z = super.x + super.y;
    }
    public Q(int x,int y){
        super(x,y);
        //Use of super in variable call
        this.z = super.x + super.y;
    }

    public HashMap<String,Integer> getDetails() {
        HashMap<String,Integer>map = new HashMap<>();
        // Use of Super in method call
        map.put("x",super.getX());
        map.put("y",super.getY());
        map.put("z",this.z);
        return map;
    }
}

public class UseofSuper {
    public static void main(String[] args) {
        Q q1 = new Q();
        System.out.println(q1.getDetails());

        Q q2 = new Q(10);
        System.out.println(q2.getDetails());

        Q q3 = new Q(10,90);
        System.out.println(q3.getDetails());
    }
}
