import java.util.*;

public class StringSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your string: ");
        String str = sc.nextLine();
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        String sortedStr = new String(strArray);
        System.out.println("The sorted string is: " + sortedStr);
    }
}