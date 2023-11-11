public class Main22{
    public static void main(String ... args){
        A a=new A();
        a.method1();
        B.method2();
        
    }
}
class A{
    public void method1(){
        System.out.println("This is method1 of class A");
    }
   }
class B extends A{
    public void method1(){
        System.out.println("This is method1 of class B");
    }
   static void method2(){
        System.out.println("This is method 2 of class B");
    }
}
