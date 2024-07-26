
package com.mycompany.mavenproject5;
import  java.util.Scanner;
import java.util.ArrayList;



public class Mavenproject5 {

    public static void main(String[] args) 
    {
        System.out.println("Enter or number ");
        ArrayList<String> list = new ArrayList<>();
        Scanner number = new Scanner(System.in);
        
        String a = number.nextLine();
        
        while (!a.equals("end"))
        {   
            System.out.println("Enter or number ");
            Scanner input = new Scanner(System.in);
            String num = input.nextLine();
            
            if (num.equals ("end"))
            {
                System.out.println("end");
                break;
                
            }
            else if (num.equals(" ")||(num.equals("")))
            {
                System.out.println("Error");
                continue;
            }
            else
            {
               list.add(a);
               list.add(num);
            }
        }
        System.out.println("Strings entered:");
        int u =1;
        for (String str : list )
        {       
                System.out.println("number"+u+":"+str);
                u++;
        }
    }
}
