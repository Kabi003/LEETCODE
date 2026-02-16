public class Solution {
    
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            count += (n & 1);  // Check last bit
            n = n >>> 1;      // Unsigned right shift
        }
        
        return count;
    }
    
    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.hammingWeight(11));         // 3
        System.out.println(sol.hammingWeight(128));        // 1
        System.out.println(sol.hammingWeight(2147483645)); // 30
    }
}
