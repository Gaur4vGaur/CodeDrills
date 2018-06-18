package practice;

/**
 * Given an array arr[] of n integers, 
 * construct a Product Array prod[] (of same size) 
 * such that prod[i] is equal to the product of all 
 * the elements of arr[] except arr[i].
 *
 * @author Gaurav Gaur
 *
 **/

public class ProductArray {
    
    private static int product(int[] arr, int b, int e) {
        if(b >= e) {
            return arr[b];
        } else {
            int c = (b+e)/2;
            return product(arr, b,c) * product(arr, c+1,e);
        }
    }
    
    private static int[] productArray(int[] a) {
        int p = product(a, 0, a.length-1);
        
        for(int i = 0; i < a.length; i++) {
            a[i] = p/a[i];
        }
        
        return a;
    }
    
    private static void println(int[] a) {
        for(int e: a) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] a = {10,11,3,2};
        System.out.print("{10,11,3,2} -> ");
        println(productArray(a));
        
        int[] b = {10,3,5,6,2};
        System.out.print("{10,3,5,6,2} -> ");
        println(productArray(b));
        
        int[] c = {20,12};
        System.out.print("{20,12} -> ");
        println(productArray(c));
    }
}