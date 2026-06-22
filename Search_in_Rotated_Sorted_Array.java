class Solution {
    public int search(int[] nums, int target) {
   int l=nums.length;
   int res=-1;
      for(int i=0;i<l;i++){
        if(nums[i]==target){
            res=i;
            //System.out.println(i);
        }
      }
      return res;
    }
}
