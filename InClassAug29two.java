import java.util.HashSet;
import java.util.Set;

public class InClassAug29two{
	public static void main (String[] args){
		if(args.length > 0){
		  int[] nums = new int[args.length];
		  for(int i = 0; i < args.length; i++){
		    nums[i] = Integer.parseInt(args[i]);
		  }
		  System.out.println(duplicates(nums));
		}
		else{
		  int[] nums = {1, 2, 3, 1};
		  int[] numstwo = {1, 2, 3, 4};
		  System.out.println(duplicates(nums));
		  System.out.println(duplicates(numstwo));
		}
	}
	
	public static boolean duplicates(int[] x){
	  Set<Integer> elem = new HashSet<>();
	  for(int i = 0; i < x.length; i++){
	    if(elem.contains(x[i])) return true;
	    else elem.add(x[i]);
	  }
	  return false;
	}
}

