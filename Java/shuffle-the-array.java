package interviewQuestions;

public class Q3 {

	   public int[] shuffle(int[] nums, int n) {
	        int[] shffleArray = new int[2*n];
	        
	        for(int i=0; i<n; i++){
	           shffleArray[i*2] = nums[i];
	            shffleArray[i*2+1] = nums[i+n];
	            
	        }
	        
	        return shffleArray;
	        
	        
	    }
	
}
