package Matrix;

public class matrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 3,8},
                {6, 8,10},
                {6, 5,6}};
        int row = arr.length;
        int col = arr[0].length;
//        rowcolumtraversematrix(arr, row, col);
//        printreversematrix(arr, row, col);
//        printmatrix(arr, row, col);
//        findmatix(arr, row, col, 6);
//        sumofmatrix(arr,row,col);
//        finrowcol(arr,row,col);
//        zigzagprintmatrix(arr, row, col);
//        mirrormatrix(arr, row, col);
//        highestrowsumfrommatrix(arr, row, col);
        Print_diagonal_elementstop_left_to_bottom_right_(arr, row, col);
//        Printdiagonalelementstop_righttobottom_left(arr,row,col);
        sumOfDiagonal(arr,row,col);
//        searchSortedRowAndCol(arr,row,col);
        shortestPath(arr,row,col);




    }

    private static void shortestPath(int[][] arr, int row, int col) {
        for (int i =0;i<row;i++){
            for (int j =0;j<col;j++){
                if (i==0&&j==0){
                    continue;
                }
                else if(i==0){
                    arr[i][j]+=arr[i][j-1];

                }
                else if(j==0) {
                    arr[i][j] += arr[i-1][j];
                }
                else {
                    arr[i][j]+= Math.min(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        System.out.println(arr[row-1][col-1]);
    }

    private static void searchSortedRowAndCol(int[][] arr, int row, int col) {
        int value=6;
        int r=0;
        int c=col-1;
        while   (c>=0&&r<=row-1) {
            if (arr[r][c] == value) {
                System.out.println("present");
                return;
            } else if (value < arr[r][c]) {
                c--;
            } else {
                r++;
            }
        }}

    private static void sumOfDiagonal(int[][] arr, int row, int col) {
        int sum=0;
        for (int i =0;i<row;i++){
            sum += arr[i][i];
            if (i!=col-i-1){
                sum+=arr[i][col-i-1];
                System.out.println(sum);
            }


        }
    }

    private static void Printdiagonalelementstop_righttobottom_left(int[][] arr, int row, int col) {
        for (int i=0;i<row;i++){

            System.out.print(arr[i][col-i-1]);
        }
        System.out.println();
    }


    //       00 01 02
//       10 11 12
//       20 21 22
    private static void Print_diagonal_elementstop_left_to_bottom_right_(int[][] arr, int row, int col) {
        for (int i=0;i<row;i++){
            System.out.print(arr[i][i]);
        }
        System.out.println();
    }



    private static void highestrowsumfrommatrix(int[][] arr, int row, int col) {
        int max = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = arr[i][j] + sum;
            }
//            if (max<sum){
//                max=sum;
//
//            }
            max = Math.max(sum,max);

        }
            System.out.println(max);
    }

    private static void mirrormatrix(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void zigzagprintmatrix(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    private static void rowcolumtraversematrix(int[][] arr, int row, int col) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }


    private static void printreversematrix(int[][] arr, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static void finrowcol(int[][] arr, int row, int col) {
        System.out.println(row);
        System.out.println(col);
    }

    private static void sumofmatrix(int[][] arr, int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = arr[i][j] + sum;
            }


        }
        System.out.println(sum);
    }

    private static void findmatix(int[][] arr, int row, int col, int value) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == value) {
                    System.out.println("value is present");
                    return;
                }
            }

        }
        System.out.println("value is not present");
    }

    private static void printmatrix(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}


