class FindMinimumLength {
    public static int minSubArrayLen(int goal, int[] nums) {
        int minimumLength=0;
        boolean oneOver = false;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] >= goal) {
        		oneOver = true;
        		minimumLength = 1;
        		break;
        	}
        }
        if(oneOver == true) {
        	return minimumLength;
        }
        
        else {
        	for(int j = 0; j < nums.length - 1; j++) {
        		sum = nums[j];
        		for(int k = j + 1; k < nums.length; k++) {
        			sum += nums[k];
        			if(sum >= goal && minimumLength == 0) {
        				minimumLength = k - j + 1;
        			}
        			else if(sum >= goal && minimumLength != 0 && ((k - j + 1) < minimumLength)) {
        				minimumLength = k - j + 1;
        			}
        		}
        	}
        	return minimumLength;
        }
    }
    
    public static void main(String[] args) {
    	int[] array1 =   {1, 0, 1, 1};
    	System.out.println(minSubArrayLen(3, array1)); 
    	int[] array2 =   {5, -6, 8, 2};
    	System.out.println(minSubArrayLen(10, array2));
    }
}
