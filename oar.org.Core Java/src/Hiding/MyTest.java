package Hiding;

class X 
{ 
  protected static void m1(int a)
  { 
    System.out.println("m1 in class X"); 
  } 
 } 

class Y extends X
{ 
  static void m1(int y) //C.T.E
  { 
    System.out.println("m1 in class Y"); 
  } 
} 
public class MyTest 
{ 
  public static void main(String[] args) 
  { 
    X x = new Y(); 
    x.m1(10); 
  
    Y y = new Y(); 
    y.m1(20); 
  } 
}
/*
Output Explanation:
 
1. x.m1(10); will call m1() method of class X because x is a reference type of X.

2. y.m1(20); will give a compile-time error because we cannot reduce the visibility
   of the inherited method from X.

*/




