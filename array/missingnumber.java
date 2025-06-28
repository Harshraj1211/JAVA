// Missing Number
package array;
import java.util.*;
public class missingnumber {
    public static void missingnumber(int array[],int array1[],int size,int s2){
        int i=0;
        boolean foundnumber=false;
        if(size>=s2){
            for(i=0 ; i<size ; i++){
                for(int j=0 ; j<s2 ; j++){
                    if(array[i]==array1[j]){
                        foundnumber=true;
                        break;
                    }
                }
                if(foundnumber=false){
                    System.out.println("Mssing number : " + array[i]);
                }
            }
        }
        else{
            System.out.println("Missing number not found because size of second array is larger then size of first array.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter size of array1 : ");
        int s2=sc.nextInt();
        int array1[]=new int[s2];
        System.out.println("Enter second array Elemets : ");
        for(i=0 ; i<s2 ; i++){
            array1[i]=sc.nextInt();
        }
        missingnumber(array,array1,size,s2);
    }
}