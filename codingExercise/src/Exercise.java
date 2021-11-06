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

        HashMap<String, Integer> output = new  HashMap<>();

        output.put("above", above);
        output.put("bellow", below);

        return output;
    }
}
