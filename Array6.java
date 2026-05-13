public class Array6 {
    public static void main(String9[] args){

        int nums[] = {1,2,3,4,5};
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        int nums2[] = new int[5];
        nums2[0] = 6;
        nums2[1] = 5;
        nums2[2] = 4;
        nums2[3] = 3;
        for(int i=0; i<nums2.length; i++){
            System.out.println(nums2[i]);
        }

        int nums3[][] = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums3[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int n[]: nums3){
            for(int m: n){
                System.out.println(m);
            }
        } 
    }
}
