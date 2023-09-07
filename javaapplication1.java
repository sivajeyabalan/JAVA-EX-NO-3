/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author 22cseb55
 */
public class javaapplication1 
{
    public static void main(String[] args)
    {
       bank b=new bank();
       bank1 b1=new bank1();
       bank2 b2=new bank2();
       bank3 b3=new bank3();
       Scanner obj = new Scanner(System.in);
       System.out.println("select the bank 1\t 2\t 3\t");
       int o=obj.nextInt();
       
       switch(o)
       {
        case 1 :
             int a=b1.getbalance();
            System.out.println("the bank balance of bank 1 is "+a);
            break;
        case 2 :
                   int e=b2.getbalance();
                   System.out.println("the bank balance of bank 2 is "+e);
                   break;
        case 3 :
                   int c=b3.getbalance();
                   System.out.println("the bank balance of bank 3 is "+c);
                   break;
        default:
            System.out.println("INvalid input");
       }
       }
    }


class bank
{
    int balance=0;
    int getbalance()
    {
        return balance;
    }
}

class bank1
{
    int balance=1000;
    int getbalance()
    {
        return balance;
    }
}        

class bank2
{
    int balance=1500;
    int getbalance()
    {
        return balance;
    }
}
class bank3
{
    int balance=2000;
    int getbalance()
    {
        return balance;
    }
}

