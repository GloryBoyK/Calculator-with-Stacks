import java.util.*;
import static java.lang.Math.*;

class Main {
    public static void main(String[] args) {
      calcStacks();
    }

  
    public static void calcStacks(){
      Scanner s=new Scanner(System.in);
    	System.out.print("Use a function of the calculator: ");
    	String input = s.nextLine();

    	//s.close();
    	Stack<String> Calculator=new Stack<>();
    	while(!input.equals("!")){
    	  if(input.equals("?")){
    	    Stack<String> copyCalculator=Calculator;
    	    while(copyCalculator.isEmpty()==false){
    	      System.out.println(copyCalculator.peek());
    	      copyCalculator.pop();
    	    }
    	  }
    	  else if(input.equals("+")){
    	    int num1=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    int num2=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    System.out.println(num1+num2);
    	  }
    	  
    	  else if(input.equals("-")){
    	    int num1=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    int num2=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    System.out.println(num2-num1);
    	 	}
    	 	
    	 	else if(input.equals("*")){
    	    int num1=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    int num2=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    System.out.println(num1*num2);
    	  }
    	  
    	  else if(input.equals("/")){
    	    int num1=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    int num2=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    System.out.println(num2/num1);
    	  }
    	  
    	  else if(input.equals("%")){
    	    int num1=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    int num2=Integer.parseInt(Calculator.peek());
    	    Calculator.pop();
    	    System.out.println(num2%num1);
    	  }

        else if(input.equals("^")){
          int num1=Integer.parseInt(Calculator.peek());
          Calculator.pop();
          int num2=Integer.parseInt(Calculator.peek());
          Calculator.pop();
          System.out.println(pow(num2, num1));
        }
          
    	  else{
    	    Calculator.push(input);
    	  }
    	  System.out.print("Use a function of the calculator: ");
        input = s.nextLine();
      }
    }
  }