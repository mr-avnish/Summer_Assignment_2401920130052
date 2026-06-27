public class Outer {

    public void display() {
        System.out.println("Outer class display");
    }

    
    public class Inner {
        public void display() {
            System.out.println("Inner class display");
        }
    }

    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.display();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}

