import java.util.Arrays;
public class Main
{
    public static int searchInsert(int[] nums, int target) {
        int res=-1;
     int ind=Arrays.binarySearch(nums,target);
     System.out.println(ind);
     if(ind>=0){
        res=ind;
     } 
     else{
        res=-ind-1;
     }
     return res;
    }
	public static void main(String[] args) {
	    int[] nums={1,3,5,6,7,9};
	    int target=8;
	    int r =searchInsert(nums,target);
		System.out.println(r);
	}
}
