public class Rabbit{
    public static void main(String[] args) {
        int t=10;
        int s=5;
        int c=0;

        while(t>5){
            t=t-s;
            c=c+1;
        }
        System.out.println(c+1);
    }
}