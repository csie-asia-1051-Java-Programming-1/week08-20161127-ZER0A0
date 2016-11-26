package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.print(J(n));

	}
	
	public static int J(int n){
		int m = 0;
		
		if(n == 0){return m;}
		else if(n % 2 == 1){m = m + 1;} return J(n / 2) + m;
		
	}

}
