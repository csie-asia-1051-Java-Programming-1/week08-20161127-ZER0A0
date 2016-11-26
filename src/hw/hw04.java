package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String n = scn.nextLine();
		number.J(n);
		
	}

}

class number{
	public static void J(String n){
		for(int x = 0 ; x < 5 ; x ++){
		for(int y = 0 ; y < 4 ; y ++){
			switch(n.charAt(y)){
			case '0':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print(" *   * ");}
				else if(x == 2){System.out.print(" *   * ");}
				else if(x == 3){System.out.print(" *   * ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '1':if(x == 0){System.out.print("   *   ");}
				else if(x == 1){System.out.print("   *   ");}
				else if(x == 2){System.out.print("   *   ");}
				else if(x == 3){System.out.print("   *   ");}
				else if(x == 4){System.out.print("   *   ");}break;
			
			case '2':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print("     * ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print(" *     ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '3':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print("     * ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print("     * ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '4':if(x == 0){System.out.print(" *   * ");}
				else if(x == 1){System.out.print(" *   * ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print("     * ");}
				else if(x == 4){System.out.print("     * ");}break;
			
			case '5':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print(" *     ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print("     * ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '6':if(x == 0){System.out.print(" *     ");}
				else if(x == 1){System.out.print(" *     ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print(" *   * ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '7':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print("     * ");}
				else if(x == 2){System.out.print("     * ");}
				else if(x == 3){System.out.print("     * ");}
				else if(x == 4){System.out.print("     * ");}break;
			
			case '8':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print(" *   * ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print(" *   * ");}
				else if(x == 4){System.out.print(" ***** ");}break;
			
			case '9':if(x == 0){System.out.print(" ***** ");}
				else if(x == 1){System.out.print(" *   * ");}
				else if(x == 2){System.out.print(" ***** ");}
				else if(x == 3){System.out.print("     * ");}
				else if(x == 4){System.out.print("     * ");}break;
				
				}
			
			}
		
		System.out.println();}
		
	}
	
}