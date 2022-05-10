abstract class phone{
    abstract void time();
    abstract void on();
}
abstract class smartphone extends phone{
    abstract void music();
    abstract void game();
}
class galaxyM20 extends smartphone{
    @Override
    void time() {
        System.out.println("Time is..");
    }
    @Override
    void on() {
        System.out.println("Welcome to Samsung");
    }
    @Override
    void music() {
        System.out.println("All my friends are toxic");
    }
    @Override
    void game() {
        System.out.println("Starting bgmi..");
    }
}

class redminote9 extends smartphone{

    void time() {
        System.out.println("Time is..");
    }
    @Override
    void on() {
        System.out.println("Welcome to Xiaomi");
    }
    @Override
    void music() {
        System.out.println("Ab to adaat si...");
    }
    @Override
    void game() {
        System.out.println("Starting Fifa..");
    }
}

class nokia extends phone{

    @Override
    void time() {
        System.out.println("Time is...");
    }
    @Override
    void on() {
        System.out.println("Welcome...");

    }
}

public class InheritanceInAbstractClasses {
    public static void main(String[] args) {
        phone p1 = new galaxyM20();
        smartphone p2 = new redminote9();
        phone p3 = new nokia();
        p3.on();
        p3.time();
        //Cannot be done...
        //smartphone p4 = new nokia();
        p1.on();
        p1.time();
        //Cannot be done as phone type object cannot access methods of smartphone...
        //p1.music();
        //p1.game();
        p2.on();
        p2.time();
        p2.game();
        p2.music();

        galaxyM20 g1 = new galaxyM20();
        nokia n1 = new nokia();
        g1.on();
        g1.music();
        g1.time();
        g1.game();
        n1.on();
        n1.time();
        //Cannot be done...
        // n1.music();
        // n1.game();
    }
}
/*
NOTES:-
Classes inheriting abstract classes must be abstract themselves or if concrete must implement all methods.

If a class inherits from an abstract class which in turn inherits from another abstract class then it must
implement all methods of both classes.

 */
