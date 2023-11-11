import java.util.*;
public class Matrix_Multiplication {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first matrix number of rows:");
        int r1=sc.nextInt();
        System.out.println("Enter first matrix number of columns:");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter your first matrix elements");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }

        System.out.println("Enter Second matrix number of rows:");
        int r2=sc.nextInt();
        System.out.println("Enter Second matrix number of columns:");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter your Second matrix elements");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }

        int arr3[][]=new int[r1][c2];
        int temp=0;
        if(c1!=r2){
            System.out.println("Matrix Multiplication impossible for unbalance matrix order");
        }
        else if (c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    //arr3[i][j]=0;
                    for(int k=0;k<c1;k++){
                       // arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                       temp=temp+arr1[i][k]*arr2[k][j];
                    }
                    arr3[i][j]=temp;
                    temp=0;
                }
            }
            System.out.println("Multiplication matrix be :");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.printf("%4d",arr3[i][j]);
                }
                System.out.println();
            }
        }
    }
}
