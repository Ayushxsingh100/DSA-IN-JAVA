class LEETCODE12 {
    // Function to swap two elements in the array
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; // Fix: Assign the correct value back
    }

    // Function to reverse the array from index i to the end
    public void reverse(int[] nums, int i) {
        int j = nums.length - 1; // last index
        while (i < j) { // reversing till i and j meet
             swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        // Start from last but one step more for using current and previous using jugaad
        int i = nums.length - 2;
        
        // Find the first decreasing element from the right
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        
        // Within this loop, 'i' will reach the element that is decreasing
        if (i >= 0) { // Ensure we found a decreasing element
            int j = nums.length - 1;
            
            // Find the element just larger than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }
            // When this loop exits, we have found the just-bigger element
            swap(nums, i, j);
        }
        
        // After this, the place where we left our 'i' from there to the last all the elements should be reversed
        reverse(nums, i + 1);
    }
}
