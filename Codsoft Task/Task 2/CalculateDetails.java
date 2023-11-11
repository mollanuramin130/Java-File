import java.util.*;

class Para{
    float average_percentage;
    String grade;
}


public class CalculateDetails {

    static Para getDetails(int totalMarks,int number){

        Para obj=new Para();
        float percen=(float)totalMarks/number;

        if(percen<=100 && percen>=90){
            obj.grade="O";
        }
        else if(percen<90 && percen>=80){
            obj.grade="A+";
        }
        else if(percen<80 && percen>=70){
            obj.grade="A";
        }
        else if(percen<70 && percen>=60){
            obj.grade="B+";
        }
        else if(percen<60 && percen>=45){
            obj.grade="B";
        }
        else if(percen<45 && percen>=34){
            obj.grade="C";
        }
        else{
            obj.grade="Fail";
        }
        obj.average_percentage=percen;
        return obj;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many subject marks you went to calculate?");
        int number=sc.nextInt();

        int marks[]=new int[number];
        int totalMarks=0;

        System.out.println("Enter the Marks(out of 100) of subject : ");
        for(int i=0;i<number;i++){
            marks[i]=sc.nextInt();
            if(marks[i]>100 || marks[i]<0){
                System.out.println("please Enter valid marks (0 to 100)");
                i--;
                continue;
            }
            totalMarks+=marks[i];
        }
        System.out.println();

        Para obj=getDetails(totalMarks, number);
        
        System.out.println("Student Details:\nTotal Marks :"+totalMarks);
        System.out.println("Average Percentage : "+obj.average_percentage);
        System.out.println("Corresponding Grade : "+obj.grade+"\n\n");
    }
}
