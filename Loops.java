import java.util.*;
public class Loops {
    public static void main(String args[]){
//////////////////////////////////////////////////////////////////
        // For LOOP 
        // for(int counter = 0; counter < 100; counter = counter +1){
        //     System.out.println("Hello Ajay");
        // }
//////////////////////////////////////////////////////////////////
        // for (int counter = 0 ;counter <11; counter++){
        //     System.out.println(counter+" ");
        // }
///////////////////////////////////////////////////////////////////
            // for (int i=0; i<11;i++){
            //     System.out.println(i);
            // }
/////////////////////////////////////////////////////////////////////////
        // While LOOP 

        // int i = 0;
        // while (i < 11 ){
        //     System.out.println(i);
        //     i +=1 ; // i++
        // }

///////////////////////////////////////////////////////////////////
//Do While Loop
    // int i = 0;
    // do { 
    //     System.out.println(i);
    //     i += 1;
    // } while (i < 11);

////////////////////////////////////
    // int i = 12;
    // while(i < 11){
    //     System.out.println("Tiwari JI");
    // }

    // do {
    //     System.out.println("Tiwari ajay ");
        
    // }while(i < 11);
//////////////////////////////////////////////////////
/// 
/// 
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    // int sum = 0;
    // for(int i = 1; i <= n ;i++){
    //     sum = sum+i;
        
    // }
    // System.out.println(sum);

    // Print the table of a number input by the user.
    for(int i = 1; i <11; i++){
        System.out.println(n*i);
    }
}
}
