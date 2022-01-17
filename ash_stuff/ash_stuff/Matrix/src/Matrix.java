public class Matrix {
    public static void main(String[] args) {
        new Matrix().run();
    }

    public void run() {
        int[][] square = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] squareOut = new int[3][3];


        System.out.println("Square");
        for (int i = 0; i < square.length; i++) { //rows

            for (int j = 0; j < square.length; j++) { //cols

                squareOut[i][square.length - j - 1 ] = square[j][i];
            }
        }

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(squareOut[i][j]);
            }
            System.out.println();
        }


        int[][] rect = new int[][]{{1,2,3},
                                  {4,5,6}};
        int height = 3;
        int width = 2;
        int[][] rectOut = new int[height][width];
        System.out.println();
        System.out.println("Rectangle");
        for (int i = 0; i < height; i++) { //rows
            for (int j = 0; j < width; j++) { //cols

            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectOut[i][j]);
            }
            System.out.println();
        }
    }
}


