package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	
	/*Given the array candies and the integer extraCandies, 
	 * where candies[i] represents the number of candies that the ith kid has.
	For each kid check if there is a way to distribute extraCandies
	among the kids such that he or she can have the
 	greatest number of candies among them. Notice that multiple 
 	kids can have the greatest number of candies.*/
	
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> greatestCandyList =  new ArrayList<Boolean>();
        int maxAmountOfCandies = 0;
        
        for(int i=0;i<candies.length;i++){
            if(candies[i] > maxAmountOfCandies)
                maxAmountOfCandies = candies[i];
        }
        
        for(int i=0;i<candies.length;i++){
            int currentExtraAmount = candies[i] + extraCandies;
            if(currentExtraAmount >= maxAmountOfCandies){
                greatestCandyList.add(true);
            }else{greatestCandyList.add(false);}
                
        }
        
        return greatestCandyList;
        
    }
	
}
