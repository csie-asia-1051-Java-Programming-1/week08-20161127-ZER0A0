package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.print("進制(10以下)：");
		int nn = scn.nextInt();
		if(nn > 10){System.out.print("10以下!!!");}
		else System.out.print(J(n,nn));

	}
	
	public static String J(int n , int nn){
		String m = "";
		
		while(n > 0){m = Integer.toString(n % nn) + m ; n = n / nn;}
		return m;
		
	}
		
}
