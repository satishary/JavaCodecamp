package shivank.shivank;

import java.util.*;
public class Q1-factorial {
    public int fact(int num)
    {
        if(num==1)
        return 1;
        return fact(num)*fact(num-1);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a nummber ot get its factorial:");
      int num=sc.nextInt();
      int ans=fact(num);
      System.out.println(ans); 
    
    }
    
    
}
