import java.util.Scanner;

public class my_problem_solving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.print("Hello\nsifat adnan");
//		==================================================
		
//		2.Write a Java program to print the sum of two numbers.
//		========================================================
		
		int num1= 74;
		int num2=36;
	    int	sum=num1+num2;
	    System.out.println(sum);
		
//		3.Write a Java program to divide two numbers and print on the screen.
//		=====================================================================
		
		int num1= 50;
		int num2=3;
	    int	sum=num1/num2;
	    System.out.println(sum);
		
//		4.Write a Java program to print the result of the following operations. Go to the editor	
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9
//		c. 20 + -3*5 / 8
//		d. 5 + 15 / 3 * 2 - 8 % 3
//	    =====================================================================
		
		int a=-5 + 8 * 6;
		int b=(55+9) % 9;
		int c=20 + -3*5 / 8;
		int d=5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
		
//		5.Write a Java program that takes two numbers as input and display the product of two numbers.
//		================================================================
		
        Scanner input=new Scanner(System.in);
		System.out.println("Input Your first Number:");
		int number1 =input.nextInt();
		System.out.println("Input Your Second Number:");
		int number2 =input.nextInt();
		
		int totalNumber=number1*number2;
		System.out.println("your total number is :"+totalNumber);
//		
//	    6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//		===================================================
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input Your first Number:");
		int number1 =input.nextInt();
		System.out.println("Input Your Second Number:");
		int number2 =input.nextInt();
		
		System.out.println(number1+"+"+number2+"="+(number1+number2)+"\n"+number1+"*"+number2+"="+(number1*number2)+"\n"
		                     +number1+"-"+number2+"="+(number1-number2)+"\n"
		                     +number1+"/"+number2+"="+(number1/number2)+"\n"+
		                     number1+"%"+number2+"="+(number1%number2));
//		
//		7.Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//		Test Data:
//		Input a number: 8
//		Expected Output :
//		8 x 1 = 8
//		8 x 2 = 16
//		8 x 3 = 24
//		=====================================================
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input Your first Number:");
		int number1 =input.nextInt();
		
		for(int i=1 ; i<=10;i++) {
			
		   	System.out.println(number1+" * "+i+" = "+(number1*i));
			
		}
		
//		8.Write a Java program to display the following pattern. Go to the editor
//		Sample Pattern :
//
//		   J    a   v     v  a                                                  
//		   J   a a   v   v  a a                                                 
//		J  J  aaaaa   V V  aaaaa                                                
//		 JJ  a     a   V  a     a
//	===================================================
		
		
		System.out.println("    j     a   v     v  a" );	
		System.out.println("    j    a a   v   v  a a" );		
        System.out.println(" j  j   aaaaa   V V  aaaaa" );		
        System.out.println("  jj   a     a   V  a     a" );		
				
				
//		9.Write a Java program to compute the specified expressions and print the output.
//
//		Specified Expression :
//		(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)		
//		================================================
        
		double x=(25.5d * 3.5d - 3.5d * 3.5d);
		double y=(40.5d - 4.5d);
				
		double expression=x/y;
		System.out.println(expression);
//		
//		10.Write a Java program to compute a specified formula. Go to the editor
//		Specified Formula :
//		4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//		Expected Output
//		2.9760461760461765
//		==================================================
		double formula=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(formula);
		
//		11.Write a Java program to print the area and perimeter of a circle. Go to the editor
//		Test Data:
//			Radius = 7.5
//			Expected Output
//			Perimeter is = 47.12388980384689
//			Area is = 176.71458676442586
//		=========================================================
		we know that circumstance c=2*pi*r
				        area  A= pi*r squar;
		
		double Radius =7.5d;
		double Perimeter = 2* Math.PI* Radius;
		double Area = Math.PI*(Radius*Radius);
		
		System.out.println("Perimeter is ="+Perimeter+"\n"+
		                    "Area is ="+Area  );
//		12.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
				
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input Your first Number:");
		int number1 =input.nextInt();
	
		System.out.println("Input Your second Number:");
		int number2 =input.nextInt();
		
		System.out.println("Input Your third Number:");
		int number3 =input.nextInt();
		
		int AvarageNumber= (number1+number2+number3)/3;
		
		System.out.println("Your Avarage Number is:"+AvarageNumber);
		
//		13.Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//		Test Data:
//		Width = 5.5 Height = 8.5
//
//		Expected Output
//		Area is 5.6 * 8.5 = 47.60
//		Perimeter is 2 * (5.6 + 8.5) = 28.20
//		======================================================
		
		double Width = 5.5d;
		double Height = 8.5d;
		
		double Perimeter  =2*(5.5d+8.5d);
		
		double Area  =5.5d*8.5d;
		
		System.out.println("Area is 5.6 * 8.5 ="+Area+"\n"+"Perimeter is 2 * (5.6 + 8.5) ="+Perimeter);
//		
//		14. Write a Java program to print an American flag on the screen. Go to the editor
//		Expected Output

//		* * * * * * ==================================                          
//		 * * * * *  ==================================                          
//		* * * * * * ==================================                          
//		 * * * * *  ==================================                          
//		* * * * * * ==================================                          
//		 * * * * *  ==================================                          
//		* * * * * * ==================================                          
//		 * * * * *  ==================================                          
//		* * * * * * ==================================                          
//		==============================================                          
//		==============================================                          
//		==============================================                          
//		==============================================                          
//		==============================================                          
//		==============================================
		
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
//		
		
//		15. Write a Java program to swap two variables
		
		int x= 5;
		int y= 7;
		System.out.println(x +" "+ y);
		 x=x+y;
		 y=x-y;
		 x=x-y;
		System.out.println(x +" "+ y );
		
//		Write a Java program to print a face. Go to the editor
//		Expected Output
//
//		 +"""""+                                                 
//		[| o o |]                                                
//		 |  ^  |                                                 
//		 | '-' |                                                 
//		 +-----+
		
		System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '=' | ");
        System.out.println(" +-----+ ");
		
		
		
		
		
		
		
		
		
		
		
	}

}
