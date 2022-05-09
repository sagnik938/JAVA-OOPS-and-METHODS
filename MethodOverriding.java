/* Run twice
1) With overridden methods commented.
2) With overridden methods implemented.
 */

class OverridingDemoBase{
    public void method1(){
        System.out.println("Method1 of base");
    }
    public void method2(){
        System.out.println("Method2 of base");
    }
}
class OverridingDemoDerived extends OverridingDemoBase{
    /*@Override
    public void method1(){
        System.out.println("Method1 of derived");
    }
    @Override
    public void method2(){
        System.out.println("Method2 of derived");
    }*/
}

public class MethodOverriding {
    public static void main(String[] args) {
        OverridingDemoBase d1 = new OverridingDemoBase();
        OverridingDemoDerived d2=  new OverridingDemoDerived();
        d1.method1();
        d1.method2();
        d2.method1();
        d2.method2();
    }
}
