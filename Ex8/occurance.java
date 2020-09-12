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
public class occurance {
    
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       String name="rhagul ghandhi sonia ghandhi";
       int count=1;
       String sp[]=name.split(" ");
       for(int i=0;i<sp.length;i++)
       {
           for(int j=i+1;j<sp.length;j++)
           {
               if(sp[i].equals(sp[j]))
               {
                   count=count+1;
                   sp[j]="0";
               }
           }   
               if(sp[i]!="0")
               {
                   System.out.println(sp[i]+"---"+count);
                   count=1;
               }
           
       }
    }
}
