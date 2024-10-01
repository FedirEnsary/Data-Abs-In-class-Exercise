import java.util.ArrayList;
import java.util.HashMap;

public class InClassOct1{
	public static void main (String[] args){
		
	}
    public static ArrayList<int[]> symmetry(int[][] input){
        ArrayList<int[]> output = new ArrayList<int[]>();
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for(int[] x : input){
            pairs.put(x[0], x[1]);
        }
        for(int[] x : input){
            if (pairs.containsKey(x[1])){
                output.add(x);
            }
        }
        return output;
        

    }
}

