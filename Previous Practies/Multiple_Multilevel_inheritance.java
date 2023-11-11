public class Multiple_Multilevel_inheritance {
    public static void main(String [] args){
        Child object=new Child();
        object.first_parent_details();
        object.second_parent_details();
        object.child_details();
        C obj=new C();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
interface First_Parent{
    default void first_parent_details(){
        System.out.println("Its is a First Parent program body");
    }
}
interface Second_Parent{
    default void second_parent_details(){
        System.out.println("Its is a Second Parent program body");
    }
}
class Child implements First_Parent,Second_Parent{
    void child_details(){
        System.out.println("Its is a Child program body");
    }
}
class A{
    void method1(){
        System.out.println("This is class A method");
    }
}
class B extends A{
    void method2(){
        System.out.println("This is class B method");
    }
}
class C extends B{
    void method3(){
        System.out.println("This is class C method");
    }
}