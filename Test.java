// Queue using 2 stack 

import java.util.*;
class Test {
  
  static class Queue{
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();
    
    public static  boolean isEmpty(){
      return s1.isEmpty();
    }
    
    // adding 
    public static void add(int data){
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }
      s1.push(data);
      
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
    }
    
    //remove 
    public static int remove(){
      if(isEmpty()){
        System.out.println("Empty Queue");
        return -1;
      }
      return s1.pop();
    }
    
    //peek
    public static int  peek(){
      if(isEmpty()){
        System.out.println("Empty Queue");
        return -1;
      }
      return s1.peek();
    }
    
  }
  
  public static void main(String[]args){
    Queue qq = new Queue();
    
    
     qq.add(1);
     qq.add(2);
     qq.add(3);
     qq.add(4);
   
    
    while(qq.isEmpty()!=true){
      System.out.println(qq.peek());
      qq.remove();
    }
  }
}