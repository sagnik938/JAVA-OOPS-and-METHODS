class Phone{
    public void on(){
        System.out.println("Phone turning on...");
    }
    public void showtime(){
        System.out.println("Time...");
    }
}
class Smartphone extends Phone{
    @Override
    public void on(){
        System.out.println("Smartphone turning on...");
    }
    public void music(){
        System.out.println("All my friends are toxic....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        //Runtime Polymorphism using Dynamic Method Dispatch
        Phone smp = new Smartphone();
        Smartphone smp1 = new Smartphone();
        smp.on();
        smp.showtime();

        smp1.on();
        smp1.music();
        smp1.showtime();
    }
}
