public class Final_class_method_variable{
    public static void main(String [] args){
        Z obj2=new Z();
        obj2.add();
        X obj3=new X();
        obj3.method();
        obj3.method(10);
        A obj4= new A();
        obj4.method1();
    }
}
class Z {
    final int a=100;
    int b=50;
    void add(){
       // a=a*2; //Error :cannot assign a value to final variable a, a=a*2;
        b=b*2;
        System.out.println("Sum of two number is "+(a+b));
    }
}
class X{
    final void method(){
        System.out.println("This is parameterless final method body");
    }
    void method(int a){
        System.out.println("This is parameteries final method body & passing argument value is:"+a);
    }
}
// class Y extends X {
//     // its generate errors because final method can't override by the exends class method..
//     /*
//      error: method() in Y cannot override method() in X
//     void method(){
//          ^
//   overridden method is final
//     1 error
//      */
//     void method(){
//         System.out.println("This is method overriding from extends class Y");
//     }
// }
final class A {
    void method1(){
        System.out.println("This is final class method calls");
    }
}

//  class B extends A{
//     // its generate errors because final class can't exends by the other class..
//          /*  error: cannot inherit from final A
//             class B extends A{
//                  ^
//                 1 error */
//     void method2(){
//         System.out.println("This is final class Exends method body");
//     }
//  }