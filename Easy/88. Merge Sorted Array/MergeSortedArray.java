class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        int j = 0;

        if(m == 0) {
            for(int q = 0; q < nums1.length; q++) {
                nums1[q] = nums2[q];
            }
        }   
        else {
            while(i < nums1.length) {
                nums1[i] = nums2[j];
                i += 1;
                j += 1;
            }
            // Selection sort;
            for(int x = 0; x < nums1.length-1; x++) {
                int min = x;
                for(int y = x+1; y < nums1.length; y++) {
                    if(nums1[y] < nums1[min]) {
                        min = y;
                    }
                }
                int temp = nums1[min];
                nums1[min] = nums1[x];
                nums1[x] = temp;
            }
        }
    }
}
