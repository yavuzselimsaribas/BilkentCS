public class Main {

    public static int binarySearch(int[] nums, int flag)
    {
        int high = nums.length -1;
        int low = 0;
        while(high>=low){
            int middle = (low+high)/2;
            if(nums[middle]>flag){
                low = middle+1;
            }else if(flag>nums[middle]){
                low= middle -1;
            }
            else{return middle;}

        }
        return -1;
    }

    public static void main(String[] args){


        //QUESTION 2C
        int[][] nums = new int[2][];
        nums[0] = new int[2];
        for(int i=0; i<2; i++){
            nums[0][i] = i+1;
        }
        nums[1] = new int[3];
        for(int i=0; i<3; i++){
            nums[1][i] = i+3;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[j][i]+"-");
            }
        }



  /*       int[] nums = {1,1,2,3,5,6,7,10};
        int searchNum = 6;
        int index = binarySearch(nums, searchNum);
        if(index == -1){
            System.out.println(searchNum+"is not in the array");

        }else{
            System.out.println(searchNum+"is at index"+index);
        } */
    }
    
}
