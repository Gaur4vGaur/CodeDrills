package code.kata;

public class UniqueStringOptimized {

    public static boolean isUniqueCharacterString(String string) {
        boolean[] array = new boolean[128];

        if(string.length() > 128) {
            return false;
        } else {
            for(char element: string.toCharArray()) {
                if(array[element]) {
                    return false;
                }

                array[element] = true;
            }
        }

        return true;
    }

    public static <T> void println(T input) {
        System.out.println("\n\n\n"+input);
    }
    
}