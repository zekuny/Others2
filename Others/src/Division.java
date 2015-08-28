import java.util.Arrays;
import java.util.Scanner;
 
class Division {
	  public static void main(String[] args) {	 
		  int a, b, result = 5;
		  
		  
		  
		  String m = "cba";
		  char[] tmp = m.toCharArray();
		  for(int i = 0; i < tmp.length; i++){
			  System.out.println(tmp[i]);
		  }
		  Arrays.sort(tmp);
		  for(int i = 0; i < tmp.length; i++){
			  System.out.println(tmp[i]);
		  }
		  String n = String.valueOf(tmp);
		  System.out.println(m + " " + n);
		  
		  
		  
		  
		  Scanner input = new Scanner(System.in);
		  System.out.println("Input two integers");
		  
		  try{
			  a = input.nextInt();
			  b = input.nextInt();
			  result = a / b;
		  }catch(ArithmeticException e){
			  e.printStackTrace();
		  }finally {
		      System.out.println("finally block will execute.");
		  }
		 
		  System.out.println("Result = " + result);
	  }
}