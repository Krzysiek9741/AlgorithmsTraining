public class DrawingFigures {
    public static void main(String[] args) {
        drawHalfTree();
        drawDiagonal();
        drawZero();
        drawX();
    }


//

    private static void drawHalfTree() {
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<=i; j++){
                    a[i][j] = '*';

            }
        }
        for(int i=0; i< 10; i++){
            for(int j=0; j< 10; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

    private static void drawDiagonal() {
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<=i; j++){
                if (i == j) {
                    a[i][j] = '*';
                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 10; i++){
            for(int j=0; j< 10; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }

    private static void drawZero() {
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                if (i == 0 || i == 9) {
                    a[i][j] = '*';
                }else if (j == 0 || j == 9){
                    a[i][j] = '*';
                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 10; i++){
            for(int j=0; j< 10; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

    private static void drawX() {
        char[][] a = new char[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                if (i == j) {
                    a[i][j] = '*';
                }else if (j == 9-i) {
                    a[i][j] = '*';

                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 10; i++){
            for(int j=0; j< 10; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

}
