
package co.project;

import java.util.Scanner;

public class CoProject {

    
    public static void main(String[] args) {
        
        int a,b;
        int sum=0;
        
        Scanner a1 = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        a = a1.nextInt();
        
        Scanner b1 = new Scanner(System.in);
        System.out.print("Enter Number2: ");
        b = b1.nextInt();
                
        
        sum=a+b;
        
         System.out.println("Sum is : "+sum);
                
        
       
    }
    
}
