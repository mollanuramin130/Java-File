abstract class Bike{  
    int price;
    
    Bike(int price){
      this.price=price;
      System.out.println("bike is created");
    }  
    void price(){
      System.out.println("Bike Price :"+price);
    }
    abstract void run();    
  }  
 //Creating a Child class which inherits Abstract class  
  class Honda extends Bike{ 
    Honda(int price){
      super(price);
    }
  void run(){
    System.out.println("running below 60 KM/h");
  }  
  }  
 //Creating a Test class which calls abstract and non-abstract methods  
  public class TestAbstraction{  
  public static void main(String args[]){  
   Honda obj = new Honda(70000); 
   obj.price(); 
   obj.run();
  }  
 }  