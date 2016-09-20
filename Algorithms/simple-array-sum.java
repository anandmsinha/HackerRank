import java.io.*;
import java.util.*;

public class Solution {
    
    public static PrintWriter out;
    
    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        MyScanner sc = new MyScanner();
        final int arrSize = sc.nextInt();
        long total = 0;
        for (int i = 0; i < arrSize; ++i) {
            total += sc.nextInt();
        }
        out.println(total);
        out.close();
    }

    public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
          try {
             str = br.readLine();
          } catch (IOException e) {
             e.printStackTrace();
          }
	    return str;
      }
   }
}
