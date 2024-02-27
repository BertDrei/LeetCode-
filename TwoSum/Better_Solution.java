package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Better_Solution {

    // array method for the two sum
    public int[] twoSum(int[] nums, int target ){

        //Hashmap to contain the key (the difference between the target and the value of the index) and the value (index value)
        // It's "Integer, Integer" because it does not accept primitive data type.
        Map<Integer, Integer> complements = new HashMap<>();
        //for loop, to help scan the whole array
        for(int i = 0; i < nums.length; i++){

            //complementIndex gets the value of the following.
           Integer complementIndex = complements.get(nums[i]);
            /*
            if the complimentIndex got a value, or in other words, the value already exist in the hashmap,
            it'll return the {"the current index we are looping to" , "the index we can add to the number we are looping to"}
             */
           if ( complementIndex != null){
               return new int[]{i, complementIndex};

           }
           //this is can be an else, but since the inside of the if statement is a return, it'll go out on its own if condition is met.
            // if ithe complimentIndex is null, { "it'll subtract the current value of the index to the target", "current index"}
            // format of the hashmap { key , value }
           complements.put(target - nums[i], i );




        }
        return nums;

    }

}
