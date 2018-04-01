
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.project;

import java.util.Scanner;

/**
 *
 * @author STD
 */
public class CoProject {

    /**
     * @param args the command line arguments
     */
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
    
    public static int test(int a,int b){
        System.out.println("55");
        return a+b;
    }
    
}
