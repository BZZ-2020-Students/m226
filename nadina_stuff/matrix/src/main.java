public class main {

    public static void main(String[] args) {
        secondm();
    }
    public static void secondm(){
        // arr1
        int[][] iarray = new int [][]{{1, 2, 3},
        {4, 5, 6},
                {7, 8, 9}};

        // arr2
        int[][] oarray = new int [][]{{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        for(int i = 0; i < iarray.length; i++ ){
            for(int x = 0; x < iarray.length; x++){
                oarray[i][x] = iarray[iarray.length -1 -x][i];

                System.out.print(oarray[i][x]);
            }
            System.out.println();
        }
    }
}
