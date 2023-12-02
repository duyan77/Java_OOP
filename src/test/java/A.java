public class A {
    protected void show() {
        System.out.print("A");
    }

    protected void show(String c) {
        System.out.print("B");
    }

    public void name() {
        System.out.println("A");
    }
}

class B extends A {
    protected void show(String c) {
        System.out.print("C");
        show();
    }

    @Override
    public void name() {
        System.out.println("B");
    }
}

class Runner {
    public static void main(String[] args) {
        A ins = new B();
        ins.show();
    }
}
