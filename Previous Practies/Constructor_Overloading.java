class Constructor{
    Constructor(){
        String name="Nur Amin Molla";
        String admissionId="22MCA0082";
        System.out.println("My name is "+name+" and Admission ID is "+admissionId);
    }
    Constructor(String name,String admissionId){
        System.out.println("My name is "+name+" and Admission ID is "+admissionId);
    }
    }
public class Constructor_Overloading {
    public static void main(String [] args){
       Constructor object= new Constructor();
       Constructor object2=new Constructor("Sakil Sardar","22BCA0123");
    }
}