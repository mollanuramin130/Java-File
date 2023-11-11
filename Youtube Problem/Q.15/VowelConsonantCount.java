/*
 * Print the number of vowel and consonant of string .
 */

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str="MY name is Nur Amin Molla";
        int result[]=count(str);
        System.out.println("Number of vowel is: "+ result[0]);
        System.out.println("Number of consonant is: "+result[1]);
    }
    static int [] count(String str){
        int result[]=new int[2];
        int vowel=0,consonant=0;
        for(int i=0;i<str.length();i++){
            if(('a'<=str.charAt(i) && str.charAt(i)<='z')||('A'<=str.charAt(i) && str.charAt(i)<='Z')){
                switch(str.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    vowel++;
                    break;
                    default:
                    consonant++;
                }
            }
          
        }
        result[0]=vowel;
        result[1]=consonant;
        
        return result;
    }
}
