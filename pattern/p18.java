    /*
    *
   * *
  *   *
 *     *
*********

 */
package pattern;

public class p18 {
    public static void main(String args[]){
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }                                                
            System.out.print("*");
                                                            /*#DOUBT CHHEEEE:::::*/
            if(i>1 && i!=5){
                for(int space=1;space<2*i-2;space++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                
                    System.out.print("");
                
            }
            System.out.println();
        }
    }
}
