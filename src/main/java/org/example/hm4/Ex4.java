package org.example.hm4;

/**
 * Задача4
 *  Отвалидировать доску судоку
 * /Требования
 * Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
 * 1. Каждая строка должна содержать цифру 1-9 без повторения
 * 2. Каждая колонка должна содержать цифру 1-9 без повторения
 * 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
 */
public class Ex4 {
    public static void main(String[] args) {
        char[][] board =
                       {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));

        if(isValidSudoku(board)){
            System.out.println("Судоку решена!");
        }
        else{
            System.out.println("Что ты такое!");
        }
        printSudoku(board);
    }

    /**\
     * метод визуализации доски судоку
     * @param board
     */
    public static void printSudoku(char[][] board) {
        for(int row = 0; row < boardSize;row++){
            for(int col = 0; col < boardSize;col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }


    static int boardSize = 9;

    /**
     * метод прохода по строке
     * @param board
     * @param row
     * @param x
     * @return
     */
    public static boolean isRow(char[][] board, int row, char x) {
        for (int i = 0; i < boardSize; i++) {
            if (board[row][i] == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * метод прохода по столбцам
     * @param board
     * @param col
     * @param x
     * @return
     */
    public static boolean isColumn(char[][] board, int col, char x) {
        for (int i = 0; i < boardSize; i++) {
            if (board[i][col] == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * метод разделяет доску судоку на отдельные 9 квадратов
     * @param board
     * @param col
     * @param row
     * @param x
     * @return
     */
    public static boolean isBox(char[][] board, int row, int col, char x) {
        int rowBox = row - row % 3;
        int colBox = col - col % 3;
        for (int i = rowBox; i < rowBox + 3; i++) {
            for (int j = colBox; j < colBox + 3; j++) {
                if (board[i][j] == '.') {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * метод для проверки доски на условие рекурсивного прохода
     * @param board
     * @param col
     * @param row
     * @param x
     * @return
     */
    public static boolean isValidBoard(char[][] board, int col, int row, char x) {
        return !isRow(board, row, x) && !isColumn(board, col, x) && !isBox(board, row, col, x);
    }

    /**
     * метод решения судоку с помощью рекурсивного прохода
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if(isValidBoard(board, row, col, num)) {
                            board[row][col] = num;

                            if (isValidSudoku(board)) {
                                return true;
                            }
                            else {board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }


/**
 * вывод: тестировать на наличие ошибок
 */


}