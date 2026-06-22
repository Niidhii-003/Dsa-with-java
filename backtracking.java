// public class backtracking{
//     public static void changeArr(int arr[] , int i , int val){
//         ///base case
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }


//         ///recursion
//         arr[i]=val;
//         changeArr(arr , i+1 , val+1);
//         arr[i]=arr[i]-2;


//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]=new int[5]; 
//         changeArr(arr , 0 , 1);
//         printArr(arr);

//     }
// }


///FIND SUBSETS

// public class backtracking{
//     public static void findSubsets(String str, String ans , int i){
//         ///base case
//         if(i==str.length()){
//             System.out.println(ans);
//             return;
//         }
//         ///recursion Yes Choice
//         findSubsets(str , ans+str.charAt(i), i+1);
//         ///no choice
//         findSubsets(str , ans , i+1);
//     }
//     public static void main(String args[]){
//         String str="abc";
//         findSubsets(str , "" , 0);
//     }
// }


///FIND PERMUTATIONS


// public class backtracking{
//     public static void findPermutations(String str , String ans){
//         //base case
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }

//         //recursion
//         for(int i=0 ; i<str.length(); i++){
//             char curr=str.charAt(i);
//             //"abcde"=> "ab"+"de"="abde"
//             String Newstr=str.substring(0 , i) + str.substring(i+1);
//             findPermutations(Newstr , ans+curr);

//         }
//     }
//     public static void main(String args[]){
//         String str="abc";
//         findPermutations(str , "");
//     }
// }



////N QUEENS placed in n columns

// public class backtracking{
//     public static void nQueens(char board[][] , int row){
//         ///base
//         if(row==board.length){
//             printBoard(board);
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++){
//             board[row][j]='Q';
//             nQueens(board, row+1);   //function call
//             board[row][j]='X';    //backtracking step
//         }
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("---------Chess Board--------");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int n=2;
//         char board[][]= new char[n][n];
//         //initialise
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j]='X';
//             }
//         }
//         nQueens(board , 0);
//     }
// }



///N SAFE QUEENS PLACED N COLUMNS 

///time complexity for safe---O(n!)


// public class backtracking{
//     public static boolean isSafe(char board[][] , int row , int col){
//         //VERTICAL UP
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//         ///DIAGONAL LEFT up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         //DIAGONAL RIGHT up
//         for(int i=row-1 , j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }



//     public static void nQueens(char board[][] , int row){
//         ///base
//         if(row==board.length){
//             count++;

//             printBoard(board);
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board , row , j)){
//                 board[row][j]='Q';
//                 nQueens(board, row+1);   //function call
//                 board[row][j]='X';    //backtracking step

//             }
           
//         }
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("---------Chess Board--------");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
//     static int count=0;
//     public static void main(String args[]){
//         int n=4;
//         char board[][]= new char[n][n];
//         //initialise
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j]='X';
//             }
//         }
//         nQueens(board , 0);
//         isSafe(board , 0 , 0);
//         System.out.println("Total ways to solve n queens="+ count);
//     }
// }


////GRIDS WAYS


// public class backtracking{
//     public static int GridWays(int i , int j, int n , int m){
//         ///base case
//         if(i==n-1 && j==m-1){   ////condition for last cell
//             return 1;
//         }else if(i==n|| j==n){   ////boundary cross condition
//             return 0;
//         }
//         int w1=GridWays(i+1, j , n , m);
//         int w2=GridWays(i, j+1 , n , m);
//         return w1+w2;

//     }
//     public static void main(String args[]){
//         int n=3 , m=3;
//         System.out.println(GridWays(0, 0 , n , m));
//     }
// }



///SUDOKU

public class backtracking{
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        ///column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid 
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3X3 grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][] , int row , int col){
        ///base case
        if(row==9 && col==0){
            return true;
        }

        ///recursion
        int nextRow=row , nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }else if(row==9){
            return false;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1; digit<=9; digit++) {
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol )){    ////solution exists
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;

    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int sudoku[][]={ {0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3} };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else {
            System.out.println("solution does not exists");
        }

    }
    
}