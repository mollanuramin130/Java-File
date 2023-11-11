public class VowelCount {
    public static void main(String[] args) {
        String str="my Name is Nur Amin Molla";
        int vowelCount=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                vowelCount++;
            }
        }
        System.out.println("Total number of vowel is : "+vowelCount);
    }
    static boolean isVowel(char i){
        switch(i){
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
            return true;
        }
        return false;
    }
}
