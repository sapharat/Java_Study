/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2fanndk;
import  java.util.Scanner;
/**
 *
 * @author defok
 */
public class DaysInMoth {
    public static void main(String[] args) {
    Scanner  kb = new  Scanner (System.in);
    System.out.print("กรอกเดือน = ");
    int month = kb.nextInt();
    System.out.print("กรอกปี = ");
    int year = kb.nextInt();
    
    int  y = year-543;
    if (y % 400 == 0 || y % 4 == 0 && y % 100 !=0)
    {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
             System.out.println("31");
        }
        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("30");
         }
        else if (month == 2 )
        {
            System.out.println("29");
        }
}
    else
    {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
             System.out.println("31");
        }
        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("30");
         }
        else if (month == 2 )
        {
            System.out.println("28");
        }
    }
    
}
}
