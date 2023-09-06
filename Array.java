public class Array {
    public static void main(String args[]){
        // int num[]={1,2,3,4};
        // num[1]=6;

        // int nums[]=new int[4];

        // System.out.println(num[1]);

        int nums[][]=new int[3][4];
        int random=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               nums[i][j]=(int)(Math.random()*10);
            }
        }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //        System.out.print(nums[i][j]+" ");
        //     }
        //     System.err.println();
        // }
        for(int n[]: nums){
            for(int m:n){
                 System.out.print(m+" ");
            }
            System.err.println();
        }

    }
}
