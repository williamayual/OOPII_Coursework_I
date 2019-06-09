package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

  
    public static void main(String[] args) {
     Scanner willy=new Scanner(System.in);
     System.out.println("enter your nickname");
     String z=willy.next();
     System.out.println("enter your nickname:" +z);
     int a=0,b=0,c=0,d=0,e=0,f=0,g=0,j=0;
     String m;
     if(a==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         a=willy.nextInt();
         System.out.println("your result is:" +a);
         
         
     }
     if(b==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         b=willy.nextInt();
         System.out.println("your result is:" +b);
         
         
     }
     if(c==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         c=willy.nextInt();
         System.out.println("your result is:" +c);
         
         
     }
     if(d==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         d=willy.nextInt();
         System.out.println("your result is:" +d);
         
         
     }
     if(e==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         e=willy.nextInt();
         System.out.println("your result is:" +e);
         
         
     }
     if(f==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         f=willy.nextInt();
         System.out.println("your result is:" +f);
         
         
     }
     g = a+b+c+d+e+f;
     j=g*100/600;
     System.out.println("average is:"+j);
     if(j<0){
         System.out.println("the grade is: F");
     }
     else 
         if(j<50){
             System.out.println("the grade is:D");
         }
     else
             if(j<70){
                 System.out.println("the grade is:C");
                 
             }
     else
                 if(j<80){
                     System.out.println("the grade is :B");
                     
                 }
     else
                     if(j>=100){
                         System.out.println("the grade is :A");
                     }
    }
    
}
