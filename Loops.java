package Lesson6;
import java.util.Scanner;
public class Loops {
 public static void main	(String[] args) {
	 
	 // FOR LOOP EXAMPLE
	 int d;
	 
	 System.out.println("FOR LOOP");
	//starting point =0; cycle till less than 10; adding +1 till <10 to skip infinity loop
	 for(int i = 0; i < 10; i++) {
	 System.out.println(i);
	 }
	 System.out.println("_________________");
	 
	 for(int i = 100; i > 10; i/=2) {
		 System.out.println(i);
		 }
	 System.out.println("_________________");
	 
	 //WHILE LOOP EXAMPLE 
	 int number = 0;
	 int sum = 0;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number, or 0 to exit the scanner: ");
	 number = sc.nextInt();
	 while (number !=0) {
		 sum = sum + number;
		 System.out.println("Enter a number, or 0 to exit the scanner: ");
		 number = sc.nextInt();
		 
		 System.out.println("total sum: "+ sum);
		 System.out.println("__________________");
	 }
	 
	 //DO WHILE LOOP EXAMPLE /DO TILL WHILE IS TRUE!!! do once and uses while xxxx times. shows how many times 100 can be devided by 2 (4 DOes)
	 int x = 100;
	 do {
		 System.out.println ("DO");
		 x/=2;
	 } while(x>10);
	 
	 int n = 4;
	 int m = 2;
	 
	 for(int i = 1; i <=n; i ++) {
		 System.out.println ("Outer loop: " + i);
		 
		 for(int j = 0; j<= m; j ++) {
		 System.out.println ("Inner loop: " + j);
		 }
		 
		 System.out.println("__________________");
	 
 
	 }
 }
 }


