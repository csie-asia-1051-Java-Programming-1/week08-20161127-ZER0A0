package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.print(J(n));

	}
	
	public static String J(int n){
		String m = "";
		
		while(n > 0){m = Integer.toString(n % 2) + m ; n = n / 2;}
		return m;
		
	}
		
}
