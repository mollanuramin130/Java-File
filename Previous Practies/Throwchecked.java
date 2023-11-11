import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwchecked {
    public static void method()throws FileNotFoundException{
        FileReader file = new FileReader("/Users/nuramin/Desktop/Codding File/nur.txt");
        BufferedReader fileInput=new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String[] args){
    try{
        method();
    }
    catch(FileNotFoundException fe){
        System.out.println(fe);
        fe.printStackTrace();
    }
    System.out.println("Rest of the code");
    }
}
