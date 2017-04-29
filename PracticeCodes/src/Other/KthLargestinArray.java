package Other;

public class KthLargestinArray {
		public static void main(String[] args){
			int[] nums = {3,4,2,5,1,87,6,88,9};
			int k = 2;
			System.out.println(findkthlargest(nums,k));
		}

		private static int findkthlargest(int[] nums, int k) {
			// TODO Auto-generated method stub
			return quickselect(nums,k,0,nums.length-1);
		}

		private static int quickselect(int[] nums, int k, int left, int right) {
			// TODO Auto-generated method stub
			int pos = partition(nums,left,right);
			if(pos==k-1) return nums[pos];
			if(pos < k-1) return quickselect(nums, k, pos+1, right);
			else return quickselect(nums, k, left, pos-1);
			
		}

		private static int partition(int[] nums, int left, int right) {
			// TODO Auto-generated method stub
			int pivot = left++;
			while(left<=right){
				while(left<=right && nums[left]>=nums[pivot]) left++;
				while(right>=left && nums[right] < nums[pivot]) right--;
				if(left>right) break;
				swap(nums,left,right);
			}
			swap(nums, pivot, right);
			return right;
		}

		private static void swap(int[] nums, int i, int j) {
			// TODO Auto-generated method stub
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
}
