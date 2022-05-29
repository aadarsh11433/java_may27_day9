package com.Problem3;

public class Child2  extends Parent2{

	
		 
		 
		 @Override
		public String toString() {
			return "object of class Child2";
		}

		public static void main(String[] args) {
			
			 
			 Child2 child2 = new Child2(); 
			 
			 System.out.println(child2);
		}
		 
}

//    class Child3 extends Parent1 , Parent2{
//	
//    }

/*    
   
            <----------------------------   multiple inheritance not supported in Java at class level  ---------------------->
            
        1. To reduce the complexity and simplify the language, multiple inheritance is not
           supported in java at class level.
           
        2. There will be ambiguity in calling the method if both the parent class have same method.
        
        3. In scenerio  like class child3 extends Parent1, Parent2 it will not be compiled properly.
           as commented in line 23. 
           
        4. Now point 3 is a special case what if there are no same method in two parent class but in that case also 
           it will be a compile time error as compile-time errors are better than runtime errors(dont know why.)
           
           example--->
           
           class A{
                 void msg(){
                 System.out.println("Hello");
                    }
                 }
                 
                 class B{
                 void msg(){
                 System.out.println("Welcome");
                     }
                 } 
                                 
c                 lass C extends A,B{//suppose if it were, compilation error
                
                 public static void main(String args[]){
                  
                  C obj=new C();
                  obj.msg();//Now which msg() method would be invoked?
                  
                    }
                 }

   
   
   
   
   
   
   
 */