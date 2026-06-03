package week1.day3;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res= new int[nums.length];
        int l=0,r=nums.length-1 , pos=nums.length-1;
        while(l<=r){
            int lp=nums[l]*nums[l];
            int rp=nums[r]*nums[r];

            if(rp>lp){
                res[pos--]=rp;
                r--;
            } else {
                res[pos--]=lp;
                l++;
            }
        }
        return res;
    }
}
