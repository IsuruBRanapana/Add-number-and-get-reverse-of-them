package addnumandgetrevers;
//import scanner
import java.util.Scanner;

public class AddNumAndGetRevers {

    public static void main(String[] args) {
        //create scanner
        Scanner input=new Scanner(System.in);
        //input how many numbers
        System.out.println("Enter how many numbers that we enter :- ");
        int i=input.nextInt();
        //create array to hold numbers
        double [] list1=new double[i];
        //add numbers to array
        for(int a=0;a<list1.length;a++){
            System.out.println("Enter the number "+(a+1));
            list1[a]=input.nextDouble();
        }
        
        for(int a=0;a<list1.length;a++){
            System.out.print(list1[a]+"  ");
            }
        System.out.println(" ");
        //create reverse list
        double []list2=new double[list1.length];
        // reverse list call from reverse method
        list2=reverse(list1);
        for(int a=0;a<list2.length;a++){
            System.out.print(list2[a]+"  ");
        }

    }
    
    //create revers method
    public static double [] reverse(double[] list){
        //create reverse list
        double [] result=new double[list.length];
        //reverse numbers
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[i]=list[j];
            
        }
        return result;
    }
    
}
