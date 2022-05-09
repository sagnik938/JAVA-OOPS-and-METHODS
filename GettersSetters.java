class employee{
    private String name;
    private int id;

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        employee e = new employee();
        e.setId(9000);
        e.setName("Alex Timberlake");
        System.out.println("ID:- "+e.getId()+"\nName:- "+e.getName());
    }
}
