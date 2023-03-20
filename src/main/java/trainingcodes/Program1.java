/**
 * 
 */
package trainingcodes;

/**
 * @author vinay
 *
 */

/*
*- $ $ $ $ $
*- - $ $ $ $ $
*- - - $ $ $ $ $
*- - - - $ $ $ $ $
*- - - - - $ $ $ $ $
*/
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=1;i<=n;i++) {
//    	   for(int j=1;j<=n;j++) {
//    		   System.out.print("- ");
//    		   }
//    	   for(int j=1;j<=n;j++) {
//
//    			   System.out.print("$ ");
//    		   }
//    			   
//    		   
//		System.out.println();
//	}
//	}
//	}
/*
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 */
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=1;i<=n;i++) {
//    	   for(int j=1;j<=n;j++) {
//    		   System.out.print("$ ");
//    		   }
//    	   for(int j=1;j<=n;j++) {
//
//    			   System.out.print("# ");
//    		   }
//    			   
//    		   
//		System.out.println();
//	}
//	}
//	}
/*
*multiplicative table
*/
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//		int count;
//       for(int i=1;i<=n;i++) {
//    	   count=i;
//       for(int j=1;j<=n;j++) {
//    		   System.out.print(count+"	  ");
//    		   count=count+i;
//        }   
//    		   System.out.println();
//       }
//	    }
//	}
/*
*- $ $ $ $
*- - $ $ $
*- - - $ $
*- - - - $
*- - - - -
*/
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n=");
		int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("- ");
    		   }
    	   for(int j=i+1;j<=n;j++) {

    			   System.out.print("$ ");
    		   }
    			   
    		   
		System.out.println();
	}
	}
	}
/*
*  * * * * * * * * * * * 
*  * *     * * *     * * 
*  *   * *   *   * *   * 
*  *   * *   *   * *   * 
*  * *     * * *     * * 
*  * * * * * * * * * * * 
*  * *     * * *     * * 
*  *   * *   *   * *   * 
*  *   * *   *   * *   * 
*  * *     * * *     * * 
*  * * * * * * * * * * * 
*/
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=0;i<n;i++) {
//    	   for(int j=0;j<n;j++) {
//    		   if( i==0 || i==(n-1) || j==0 || j==(n-1) || i==(n/2) || j==(n/2) || i==j || (i+j)==(n-1) || (i+j)==(n/2) || (j-i)==(n/2) || (i-j)==(n/2) 
//    				   || (i+j)==(n-1)+(n/2)) {
//    		   System.out.print("^ ");
//    		   }
//    		   else {
//    			   System.out.print("  ");
//    		   }
//    	   }
//    	   System.out.println();
//	 }
//  }
//}
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=0;i<n;i++) {
//    	   for(int j=0;j<n;j++) {
//    		   if((j==0 && i<=(n/2)) || (j==(n-1) && i<=(n/2))  ||  (i+j)==(n-1) + (n/2) ||(i-j)==(n/2)){
//    		   System.out.print("* ");
//    		   }
//    		   else {
//    			   System.out.print("  ");
//    		   }
//    	   }
//    		   System.out.print("   ");
//    		   for(int j=0;j<n;j++) {
//        		   if( j==0 || (i-j)==(n/2) || (i+j)==(n/2) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    	   System.out.println();
//	 }
//  }
//}
/* OUTPUT :-
*                   *    *         *           
*                   *    *       *             
*                   *    *     *               
*                   *    *   *                 
*                   *    * *                   
*                   *    *                     
  *               *      * *                   
    *           *        *   *                 
      *       *          *     *               
        *   *            *       *             
          *              *         *           
*/
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=0;i<n;i++) {
//    	   for(int j=0;j<n;j++) {
//    		   if((j==0 && i!=j) || (i==0 && j<(n/2) && i!=j ) || (j==(n/2) && i!=0) || (i==(n/2) && j<=(n/2)) ){
//    		   System.out.print("* ");
//    		   }
//    		   else {
//    			   System.out.print("  ");
//    		   }
//    	   }
//    		   for(int j=0;j<n;j++) {
//        		   if(j==0 || (i==0 && j<(n/2))|| (j==(n/2)&& i!=0 && i!=(n/2) && i!=(n-1))|| (i==(n/2) && j<(n/2)) || (i==(n-1) && j<(n/2)) ) {
//        		   System.out.print("* ");
//        	}
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    		   }
//        		   for(int j=0;j<n;j++) {
//            		   if(j==0 || (i==0 && j<(n/2))|| (j==(n/2)&& i!=0 && i!=(n/2) && i!=(n-1)) || (i==(n-1) && j<(n/2))  ) {
//            		   System.out.print("* ");
//            		   }
//            		   else {
//            			   System.out.print("  ");
//            		   }
//    		   }
//    	   System.out.println();
//	 }
//  }
//}
/* OUTPUT :-
  * * * *             * * * * *             * * * * *             
*         *           *         *           *         *           
*         *           *         *           *         *           
*         *           *         *           *         *           
*         *           *         *           *         *           
* * * * * *           * * * * *             *                     
*         *           *         *           *         *           
*         *           *         *           *         *           
*         *           *         *           *         *           
*         *           *         *           *         *           
*         *           * * * * *             * * * * *             
*/
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=0;i<n;i++) {
//    	   for(int j=0;j<n;j++) {
//    		   if((j==0 && i<=(n/2)) || (j==(n-1) && i<=(n/2))  ||  (i+j)==(n-1) + (n/2) ||(i-j)==(n/2)){
//    		   System.out.print("* ");
//    		   }
//    		   else {
//    			   System.out.print("  ");
//    		   }
//    	   }
//    	    System.out.print("  ");
//    		   for(int j=0;j<n;j++) {
//        		   if( (i==0 && j<=(n/2))|| j==(n/4)||(i==(n-1) && j<=(n/2)) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    		   for(int j=0;j<n;j++) {
//        		   if( j==0 || i==j || j==(n-1) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    		   System.out.print("  ");
//    		   for(int j=0;j<n;j++) {
//        		   if((j==0 && i!=j) || (i==0 && j<(n/2) && i!=j ) || (j==(n/2) && i!=0) || (i==(n/2) && j<=(n/2)) ){
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//        	   }
//    		   for(int j=0;j<n;j++) {
//        		   if((i==j && i<=(n/2)) || (i+j==(n-1) && j>=(n/2)) || (j==(n/2) && i>=(n/2))){
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//        	   }
//    		   
//    	   System.out.println();
//	 }
//  }
//}
/* OUTPUT :-
 	*                   *   * * * * * *           *                   *     * * * *             *                   * 
 	*                   *       *                 * *                 *   *         *             *               *   
 	*                   *       *                 *   *               *   *         *               *           *     
 	*                   *       *                 *     *             *   *         *                 *       *       
 	*                   *       *                 *       *           *   *         *                   *   *         
 	*                   *       *                 *         *         *   * * * * * *                     *           
 	  *               *         *                 *           *       *   *         *                     *           
 	    *           *           *                 *             *     *   *         *                     *           
 	      *       *             *                 *               *   *   *         *                     *           
 	        *   *               *                 *                 * *   *         *                     *           
              *             * * * * * *           *                   *   *         *                     *           
 */
//import java.util.Scanner;
//public class Program1 {
//	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n=");
//		int n=sc.nextInt();
//       for(int i=0;i<n;i++) {
//    	   for(int j=0;j<n;j++) {
//    		   if((i==0 && j<=(n/2) && i!=j) || (j==0 && i<(n/2) && i!=j) || 
//    				   (i==(n/2) && j<(n/2) && j!=0) || (j==(n/2) && i>(n/2) && i!=(n-1)) || (i==(n-1) && j<(n/2))){
//    		   System.out.print("* ");
//    		   }
//    		   else {
//    			   System.out.print("  ");
//    		   }
//    	   }
//    		   for(int j=0;j<n;j++) {
//        		   if( (j==0 && i!=j) || (i==0 && j<(n/2) && i!=j ) || (j==(n/2) && i!=0) || (i==(n/2) && j<=(n/2)) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    		   for(int j=0;j<n;j++) {
//        		   if( (j==0 && i!=j && i!=(n-1)) || (i==0 && j<(n/2) && i!=j ) || (i==(n-1) && j<(n/2) && i!=j ) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    		   
//    		   for(int j=0;j<n;j++) {
//        		   if(j==0 || (i==(n/2)&&j<(n/2)) || j==(n/2) ){
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//        	   }
//    		   for(int j=0;j<n;j++) {
//        		   if( (i==0 && j<=(n/2))|| j==(n/4)||(i==(n-1) && j<=(n/2)) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//    		   for(int j=0;j<n;j++) {
//        		   if( j==0 || i==j || j==(n-1) ) {
//        		   System.out.print("* ");
//        		   }
//        		   else {
//        			   System.out.print("  ");
//        		   }
//    	   }
//
//    		   
//    	   System.out.println();
//	 }
//  }
//}
/* OUTPUT :-
  * * * * *             * * * *               * * * *             *         *           * * * * * *           *                   * 
*                     *         *           *                     *         *               *                 * *                 * 
*                     *         *           *                     *         *               *                 *   *               * 
*                     *         *           *                     *         *               *                 *     *             * 
*                     *         *           *                     *         *               *                 *       *           * 
  * * * *             * * * * * *           *                     * * * * * *               *                 *         *         * 
          *           *         *           *                     *         *               *                 *           *       * 
          *           *         *           *                     *         *               *                 *             *     * 
          *           *         *           *                     *         *               *                 *               *   * 
          *           *         *           *                     *         *               *                 *                 * * 
* * * * *             *         *           * * * * *             *         *           * * * * * *           *                   * 

 */

