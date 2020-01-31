package easy;

public class RotateArrayRightKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void rotate(int[] nums, int k) {
	        if(nums.length<=1 || nums== null)
	            return;
	        if(k>nums.length){
	            k=k%nums.length;
	        }
	        //reverse whole array
	        reverse(nums,0,nums.length-1);
	        //reverse first k
	        reverse(nums,0,k-1);
	        //reverse remaining
	        reverse(nums,k,nums.length-1);
	    }
	     public void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	     }
}
