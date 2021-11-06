import java.util.HashMap;

public class Exercise {

    public HashMap<String, Integer> aboveBelow(int[] arr, int val){
        int above = 0;
        int below = 0;

        for (int num : arr) {
            if (num > val){
                above++;
            }else if (num < val){
                below++;
            }
        }

        HashMap<String, Integer> output = new HashMap<>();

        output.put("above", above);
        output.put("below", below);

        return output;
    }

    public String stringRotation(String str, int rotate){
        if(rotate < 0){
            throw new ArithmeticException("Rotation amount must be positive");
        }else {
            rotate = str.length() - (rotate % str.length());

            String end = str.substring(rotate);
            String start = str.substring(0, rotate);

            return end + start;
        }
    }
}
