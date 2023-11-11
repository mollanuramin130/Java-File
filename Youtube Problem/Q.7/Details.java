import java.util.HashMap;

public class Details{
    public static void main(String[] args) {
        String str="My name is Nur Amin Molla";
        Para obj=getDetails(str);
        System.out.println("Total Words : "+obj.wordCount);
        System.out.println("Total Vowels : "+obj.vowelsCount);

        // for(HashMap.Entry<Character,Integer> hashElement: obj.hash.entrySet() ){
        //     System.out.println(hashElement.getKey()+" "+ hashElement.getValue());
        // }
        System.out.println(obj.hash.keySet()+" "+ obj.hash.values());
    }
    static Para getDetails(String str){
        Para obj=new Para();
        String words[]=str.split(" ");
        obj.wordCount=words.length;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                obj.vowelsCount++;
            }
        }
        for(int i=0;i<str.length();i++){
            if(obj.hash.containsKey(str.charAt(i))){
                obj.hash.put(str.charAt(i),obj.hash.get(str.charAt(i))+1);
            }
            else{
                obj.hash.put(str.charAt(i),1);
            }
        }
        return obj;
    }
}
class Para{
    int wordCount,vowelsCount;
    HashMap<Character,Integer> hash=new HashMap<>();
}