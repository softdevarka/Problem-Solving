class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] temp = new int [n1+n2];
        for (int i=0; i<n1; i++){
            temp[i]=nums1[i];
        }
        for (int j=0; j<n2; j++){
            temp[j+n1]=nums2[j];
        }
        Arrays.sort(temp);
        if ((n1+n2)%2 == 0){
            double res = (temp[((n1+n2)/2)-1]+temp[(n1+n2)/2])/2.0;
            return res;
        }
            else{
                return temp[(n1+n2)/2];
            }
        }   
    }