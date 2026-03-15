

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
    // Scanner sc = new Scanner(System.in);
    // int n =sc.nextInt();

    // int sum = 0;
    // for(int i = 1; i <= n ;i++){
    //     sum = sum+i;
        
    // }
    // System.out.println(sum);

    // Print the table of a number input by the user.
    // for(int i = 1; i <11; i++){
    //     System.out.println(n*i);
    // }

    //////////////////////////////////////////
    // int a = 4;
    // int m = 5;
    // //Outer loop
    // for (int i = 1; i<= a ;i++){
        
    //     //Inner loop
    //    for (int j = 1; j<= m; j++){
    //      System.out.print("*");
    //    }
    //     System.out.println();
         
    // }

    // int n = 4;
    // int m = 5;

    // //outer loop
    // for (int i = 1 ; i <=n;i++){
    //     //inner loop
    //     for (int j=1; j<=m; j++){
    //         //cell -> (i,j)
    //         if(i==1 || j== 1|| i ==n|| j == m){
    //             System.out.print("*");
            
    //         }else{
    //             System.out.print(" ");
    //         }
            
    //     }
    // //     System.out.println();
    // }
    // int n = 4;
    // for (int i = 1 ; i<=n;i++){
    //     //inner loop
    //     for (int j= 1; j<=i ; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //print Gun StarF inverted Pyrimid 
    // int n = 5;
    // for (int i=n; i>=1;i--){
    //     for (int j=1; j<=i;j++){
    //       System.out.print("*");  
    //     }
    //   System.out.println();
    // }
// inverted half left pyrimid 
    // int n = 5;
    // for (int i=1; i<=n;i++){
    //     //inner loop >>/Space Print
    //     for (int j=1; j<=n-i;j++){   
    //       System.out.print(" ");  
    //     }
    //     //inner loop >> star print
    //     for (int j = 1 ; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println( );
            
    // }


    // int n = 5;
    // for (int i = 1 ; i<=n;i++){
    //     //inner loop
    //     for (int j= 1; j<=i ; j++){
             
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }


    int n = 5;
    // for (int i =n ; i>=1;i--){
    //     //inner loop
    //     for (int j= 1; j<=i ; j++){
             
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    for (int i = 1 ; i<=n;i++ ){
        for (int j= 1; j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }

}
}
