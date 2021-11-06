import java.util.HashMap;

public class Exercise {

    /**
     *
     * @param arr   Array of Integers
     * @param val   Comparison value
     * @return      Hashmap of number of above and below values
     */
    public HashMap<String, Integer> aboveBelow(int[] arr, int val){
        int above = 0;
        int below = 0;

        for (int num : arr) {
            if (num > val){
                above++;
            } else if (num < val){
                below++;
            }
        }

        HashMap<String, Integer> output = new HashMap<>();

        output.put("above", above);
        output.put("below", below);

        return output;
    }

    /**
     *
     * @param str       String to be Rotated
     * @param rotate    Rotation amount
     * @return          Rotated String
     */
    public String stringRotation(String str, int rotate){
        if (rotate < 0){
            throw new ArithmeticException("Rotation amount must be positive");
        } else {
            rotate = str.length() - (rotate % str.length());

            String end = str.substring(rotate);
            String start = str.substring(0, rotate);

            return end + start;
        }
    }
}
