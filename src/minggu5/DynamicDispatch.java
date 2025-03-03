package minggu5;

class A {

    void callThis() {
        System.out.println("inside Class A's Method!");
    }
}

class B extends A {

    void callThis() {
        System.out.println("inside Class B's Method!");
    }
}

class C extends A {

    void callThis() {
        System.out.println("inside Class C's Method!");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callThis();
        
        ref = c;
        ref.callThis();
        
        ref = a;
        ref.callThis();
    }
}
