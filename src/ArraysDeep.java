public class ArraysDeep {
 //1. Заполнить двумерный массив размером 5х5 рандомными числами.
 // И вывести на экран 3 элемент с 3-й строки
    public void randomArrays() {

        int [] [] array = new int [5] [5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i] [j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("3 элемент с 3-й строки: " + array[2] [2] );
    }
//3.* Создать двумерный массив чтобы получилась матрица 3х3
// и вывести шахматную последовательность из 0 и 1.
    public void chessStep() {
        System.out.println("Последовательность из 0 и 1 для 3 на 3");
       int [] [] array = new int [3] [3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if ((i + j) % 2 == 0){
                    array [i] [j] = 1;
                }
                else {
                 array [i] [j] = 0;
                }
                System.out.print( array[i][j] + "  " );
            }
            System.out.println();
        }
        System.out.println("Последовательность из 0 и 1 для 4 на 4");
    }
//4.* Создать двумерный массив чтобы получилась матрица 4х4
// и вывести шахматную последовательность из 0 и 1

    public void chessStepFour() {
        int [] [] array = new int [4] [4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if ((i + j) % 2 == 0){
                    array [i] [j] = 1;
                }
                else {
                    array [i] [j] = 0;
                }
                System.out.print( array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
