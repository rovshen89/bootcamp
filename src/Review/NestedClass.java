package Review;

public class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.inner();

    }
}


class Outer{
    void outer(){
        System.out.println("This is outer");
    }
    class Inner{
        void inner(){
            System.out.println("This is inner");
        }
    }
}
