/*
public
private
protected
default
 */
class Demo{
    private int id;
    public int roll_no;
    protected String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Demo d = new Demo();
        // d.id = 34;
        //System.out.println(d.id);

        d.roll_no = 64;
        System.out.println(d.roll_no);

        d.setId(90);
        System.out.println(d.getId());

        d.name = "SAGNIK";
        System.out.println(d.name);
    }
}
