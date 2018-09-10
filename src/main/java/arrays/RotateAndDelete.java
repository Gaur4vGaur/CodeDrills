package arrays;

/**
 * The program first rotates the array in a clockwise
 * direction then delete the last element. Some of samples are:
 * 1 2 3 4 -> 2
 * 1 2 3 4 5 6 -> 3
 *
 */

public class RotateAndDelete {

    public static void main(String[] args) {
        int[] array = {85837,6388,48661,2534,5257};
        String[] a = convert(array);

        System.out.println(Rotate.rotate(a));
    }

    private static String[] convert(int arr[]) {
        String[] out = new String[arr.length];

        for(int i = 0; i < arr.length; i++)
            out[i] = String.valueOf(arr[i]);

        return out;
    }
}

class Rotate {
    public static String rotate(String[] array) {
        int count = 1;
        while(array.length > 1) {
            array = rotateAndDelete(array, count);
            count = count+1;
        }

        return array[0];
    }

    private static String[] rotateAndDelete(String[] array, int count) {
        String[] out = new String[array.length-1];
        if(count >= array.length) {
            for(int i = 0; i < array.length-1; i++) {
                out[i] = array[i];
            }
        } else {
            String[] temp = new String[array.length-1];
            count = temp.length - count;

            for(int i=0; i<array.length-1; i++) {
                temp[i] = array[i];
            }

            out[0] = array[array.length-1];

            int oc = 1;
            for(int i=0; i < temp.length; i++) {
                if(i != count && oc < out.length) {
                    out[oc] = temp[i];
                    oc = oc+1;
                }
            }

        }

        return out;
    }
}
