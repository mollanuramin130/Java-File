public class Overloading_Overriding {
    public static void main(String [] args){
        Overloading obj=new Overloading();
        obj.sum(5,3);
        obj.sum(95641.8d, 89266.63d);
        obj.sum(9,7,3);
        A obj2=new A();
        obj2.overriding_method();
        Overriding obj3=new Overriding();
        obj3.overriding_method();
    }
    
}
class Overloading{
    void sum(int a,int b){
        System.out.println("your given two numbers sum be :"+(a+b));
    }
    void sum(int a,int b ,int c){
        int d= a+b+c;
        System.out.println("Your given three numbers sum be:"+d);
    }
    void sum(double a,double b){
        System.out.println("Your double numbers sum be: "+(a+b));
    }
}
class Overriding{
    void overriding_method(){
        System.out.println("this is the normal method calling body");
    }
}
class A extends Overriding{
    void overriding_method(){
        System.out.println("This is the overriding method calling body");
    }
}