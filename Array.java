public class Array {
    public static void main(String args[]){
        // int num[]={1,2,3,4};
        // num[1]=6;

        // int nums[]=new int[4];

        // System.out.println(num[1]);

        //2D Array
        // int nums[][]=new int[3][4];
        // int random=0;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //        nums[i][j]=(int)(Math.random()*10);
        //     }
        // }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //        System.out.print(nums[i][j]+" ");
        //     }
        //     System.err.println();
        // }
        // for(int n[]: nums){
        //     for(int m:n){
        //          System.out.print(m+" ");
        //     }
        //     System.err.println();
        // }

        //Jagged Array
        int num[][]=new int[4][]; //Jagged

        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[5];
        num[3]=new int[2];

        for(int i=0;i<4;i++){
            for(int j=0;j<num[i].length;j++){
               num[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]: num){
            for(int m:n){
                 System.out.print(m+" ");
            }
            System.err.println();
        }
    }
}
