class constdemo{
    int v1;
    int v2;
    public constdemo(){
        this.v1 = 90;
        this.v2 = 89;
    }
    public constdemo(int v1){
        this.v1 = v1;
        this.v2 = 89;
    }
    public constdemo(int v1 , int v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }
}

public class constructors {
    public static void main(String[] args) {
        constdemo c1 = new constdemo();
        System.out.println(c1.getV1() + " " + c1.getV2());
        constdemo c2 = new constdemo(45);
        System.out.println(c2.getV1() + " " + c2.getV2());
        constdemo c3 = new constdemo(49,67);
        System.out.println(c3.getV1() + " " + c3.getV2());
    }
}
