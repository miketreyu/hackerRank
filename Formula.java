//We use the integers , , and  to create the following series:
//
//You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
//
//Input Format
//
//The first line contains an integer, , denoting the number of queries.
//Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
//
//Constraints
//
//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultado=0;
            int cont = 1;
            for(int j=1; j<=n; j++){
                resultado = cont*b+resultado;
                cont = cont*2;
                System.out.print(a+resultado+" ");
            }
            System.out.println();
            
        }
        in.close();
    }
}
