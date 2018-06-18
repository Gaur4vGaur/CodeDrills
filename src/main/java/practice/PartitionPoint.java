/**
 * Given an array, find an element before which all elements are smaller than it, 
 * and after which all are greater than it. Return index of the element if there 
 * is such an element, otherwise return -1.
 *
 * @author Gaurav Gaur
 *
 **/

package practice;

public class PartitionPoint {
    static int findPartition(int[] a) { 
        int maxL = a[0];
        int partE = -1;
        int l = a.length;
        
        for(int i = 1; i < l - 1; i++) {
            
            if(partE == -1) {
                if(a[i] > a[i-1])
                    partE = a[i];
                    
                if(a[i] > maxL)
                    maxL = a[i];
            } else {
                if(partE > a[i])
                    partE = -1;
            }
        }
        
    
        return partE;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 5, 8, 6, 7};
        System.out.println("Test 1: {4, 3, 2, 5, 8, 6, 7} -> " + findPartition(a));
        
        int[] b = {4, 2, 5, 7};
        System.out.println("Test 2: {4, 2, 5, 7} -> " + findPartition(b));
        
        int[] c = {11, 9, 12};
        System.out.println("Test 3: {11, 9, 12} -> " + findPartition(c));
        
        int[] d = {4, 3, 2, 7, 8, 9};
        System.out.println("Test 4: {4, 3, 2, 7, 8, 9} -> " + findPartition(d));

    }
}