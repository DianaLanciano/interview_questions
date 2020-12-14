
package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q5 {

	  public static int numIdenticalPairs(int[] nums) {
		     
		     Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		     int numOfGoodPairs = 0;
		    
		        for(int i=0; i<nums.length; i++){
		        	numOfGoodPairs+= map.getOrDefault(nums[i], 0);
		        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		        }
		        return numOfGoodPairs;
		    }

	
}
