package DP;
import java.util.*;

//leetcode62_UniquePath
public class uniquepath {
	    public int uniquePaths(int m, int n) {
	        int[][] ar = new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j =0;j<n;j++){
	                if(i==0||j==0){
	                    ar[i][j]=1;
	                }
	                else{
	                    ar[i][j]=ar[i-1][j]+ar[i][j-1];
	                }
	            }
	        }
	        return ar[m-1][n-1];
	    }
	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   int m  = sc.nextInt();
		   int n = sc.nextInt();
		   uniquePaths(m,n);
	   }
}
