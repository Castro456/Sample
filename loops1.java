import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println();
        int N = Integer.parseInt(bufferedReader.readLine().trim());
//    	int N = 2;
//        System.out.println("Is it");
        for (int i=1; i<=10; i++){
            System.out.println(N+ " x " +i + " = " +N*i);
//        	System.out.println("Fun");
        }
        
        bufferedReader.close();
    }
}
