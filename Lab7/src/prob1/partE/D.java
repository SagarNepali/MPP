package prob1.partE;

public class D extends A implements B,C{
    @Override
    public void method() {
        System.out.println(this.getClass().getSimpleName());
    }



    public static void main(String[] args) {
        D d = new D();
        d.method();;
    }
}
