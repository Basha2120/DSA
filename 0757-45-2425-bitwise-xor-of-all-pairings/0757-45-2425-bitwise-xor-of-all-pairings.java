class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xorNums1 = 0, xorNums2 = 0;

        // XOR of all elements in nums1
        for (int num : nums1) {
            xorNums1 ^= num;
        }

        // XOR of all elements in nums2
        for (int num : nums2) {
            xorNums2 ^= num;
        }

        // Calculate final result based on odd/even lengths
        return ((nums1.length % 2 == 1) ? xorNums2 : 0) ^
               ((nums2.length % 2 == 1) ? xorNums1 : 0);
    }
}
