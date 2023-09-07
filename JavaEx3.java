/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex3;

import java.util.Scanner;

/**
 *
 * @author 22cseb57
 */
public class JavaEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int ch;
        String mak,v_iden_no,size,r_doors,wheels;
        int racks,t_sp,doors,pass,year;
        Float bluebookval;
        Boolean warr,topper,imp;
        System.out.println("1-Car\n2-Truck");
        System.out.println("Enter the choice");
        ch=obj.nextInt();
        switch (ch)
                {
                    case 1:
                    {
                        System.out.println("Enter the car details");
                        System.out.println("Maker:");
                        mak=obj.next();
                        System.out.println("Vehicle Identification number:");
                        v_iden_no=obj.next();
                        System.out.println("Bluebookvalue:");
                        bluebookval=obj.nextFloat();
                        System.out.println("Year:");
                        year=obj.nextInt();
                        System.out.println("Passengers:");
                        pass=obj.nextInt();
                        System.out.println("Warranty:");
                        warr=obj.nextBoolean();
                        System.out.println("Doors:");
                        doors=obj.nextInt();
                        System.out.println("Imported:");
                        imp=obj.nextBoolean();
                        System.out.println("Top speed:");
                        t_sp=obj.nextInt();
                        System.out.println("Size:");
                        size=obj.next();
                        System.out.println("Rear doors:");
                        r_doors=obj.next();
                        car c=new car(mak,v_iden_no,bluebookval,year,pass,warr,doors,imp,t_sp,size,r_doors);
                        c.display();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter the truck details");
                        System.out.println("Maker:");
                        mak=obj.next();
                        System.out.println("Vehicle Identification number:");
                        v_iden_no=obj.next();
                        System.out.println("Bluebookvalue:");
                        bluebookval=obj.nextFloat();
                        System.out.println("Year:");
                        year=obj.nextInt();
                        System.out.println("Passengers:");
                        pass=obj.nextInt();
                        System.out.println("Topper:");
                        topper=obj.nextBoolean();
                        System.out.println("Wheels:");
                        wheels=obj.next();
                        System.out.println("Racks:");
                        racks=obj.nextInt();
                        truck t=new truck(mak,v_iden_no,bluebookval,year,pass,topper,wheels,racks);
                        t.display1();
                        break;
                    }
                }
    }
}
class automobile
{
    String mak,v_iden_no; 
    Float bluebookval;
    int year,pass;
}

class car extends automobile
{
    Boolean warr,imp;
    int doors,t_sp;
    String size,r_doors;
    car(String m,String v,Float b,int y,int p,Boolean w,int d,Boolean i,int t,String s,String r)
    {
        mak=m;
        v_iden_no=v;
        bluebookval=b;
        year=y;
        pass=p;
        warr=w;
        imp=i;
        doors=d;
        t_sp=t;
        size=s;
        r_doors=r;
    }
    void display()
    {
        System.out.println("Car Details");
        System.out.println("Maker:"+mak+"\nVehicle identification number:"+v_iden_no+"\nBluebookvalue:"+bluebookval+"\nYear:"+year+"\nPassengers:"+pass+"\nWarranty:"+warr+"\nDoors:"+doors+"\nImported:"+imp+"\nTopspeed:"+t_sp+"\nSize:"+size+"\nRear doors:"+r_doors);
    }
}

class truck extends automobile
{
    Boolean topper;
    String wheels;
    int racks;
    truck(String m,String v,Float b,int y,int p,Boolean t,String w,int r)
    {
        mak=m;
        v_iden_no=v;
        bluebookval=b;
        year=y;
        pass=p;
        topper=t;
        wheels=w;
        racks=r;
    }
    void display1()
    {
        System.out.println("Truck Details");
        System.out.println("Maker:"+mak+"\nVehicle identification number:"+v_iden_no+"\nBluebookvalue:"+bluebookval+"\nYear:"+year+"\nPassengers:"+pass+"\nTopper:"+topper+"\nWheels:"+wheels+"\nRacks:"+racks);
    }
}
