import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
//Write your code here
public static Scanner sc = new Scanner(System.in);
public static int B = sc.nextInt();
public static int H = sc.nextInt();
public static boolean flag = B > 0 && H > 0;
static{
    if(flag==false){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

