public class SuperClass {
    SuperClass(){
        System.out.println("Parent");
    }
}
class Child10 extends SuperClass {
         Child10(){
            super();
            System.out.println("Child");
        }
    public static void main(String[] args) {
            Child10 ch = new Child10();
    }
}
