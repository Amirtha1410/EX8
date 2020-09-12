/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class checking {
    
    public static void main(String[] args)
    {
       boolean a;
       int i=0,j=0;
       Scanner obj=new Scanner(System.in);
       String username,password;
       System.out.println("Enter the username:");
       username=obj.next();
       System.out.println("Enter the password:");
       password=obj.next();
       a=username.equals(password);
       if(a==true)
       {
           System.out.println("\nThe username and password are equal");
       }
       else
       {
          System.out.println("\nThe username and password are unequal"); 
       }
       System.out.println("\nThe concatenation of two strings are:");
       System.out.println(username+password);
    }    
}
