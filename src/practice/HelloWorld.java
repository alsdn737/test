package practice;

import java.util.Scanner;
//123
public class HelloWorld {
	static int[] ordinaryYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	 
	final static String PROMPT = "> ";					
	
	public static void main(String [] args) {
Prompt prompt = new Prompt();
Scanner yearScanner = new Scanner(System.in);
System.out.println("원하는 년을 입력하세요.");
System.out.print(PROMPT);
int getYear = yearScanner.nextInt();
if((getYear%4==0 && getYear%100!=0)||getYear%400==0) {
	   ordinaryYear[1] = 29;
	}
System.out.println("원하는 달을 입력하세요.");
System.out.print(PROMPT);
Scanner monthScanner = new Scanner(System.in);
int getNumber = monthScanner.nextInt();
 int realDaysOfMonth = getNumber -1;
		int getDaysOfMonth = ordinaryYear[realDaysOfMonth];
		
prompt.getDaysOfYearAndMonth(getYear, getDaysOfMonth);
yearScanner.close();
monthScanner.close();
	
}
}

