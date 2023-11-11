class A{
   void method1(){
    System.out.println("Hi");
    }
}
interface area{
    int a=3;
    int calculate(int x,int y);
}

class Rectangle implements area{
    float calculate (int x,int y){
        return x*y;
    }
}
class Circle implements area{
    public float calculate(int x,int y){
        return a*x*x; 
    }
}
public class Interface {
    public static void main(String [] args){
        System.out.println("Hi");
        Rectangle rc = new Rectangle();
        area b ;
        System.out.println("Arae = " + b.calculate(5,10));

    }
    
}
