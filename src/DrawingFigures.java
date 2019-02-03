public class DrawingFigures {
    public static void main(String[] args) {
        drawHalfTree();
        drawDiagonal();
        drawZero();
        drawX();
    }




    private static void drawHalfTree() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<=i; j++){
                    a[i][j] = '*';

            }
        }
        for(int i=0; i< 6; i++){
            for(int j=0; j< 6; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

    private static void drawDiagonal() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<=i; j++){
                if (i == j) {
                    a[i][j] = '*';
                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 6; i++){
            for(int j=0; j< 6; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }

    private static void drawZero() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<6; j++){
                if (i == 0 || i == 5) {
                    a[i][j] = '*';
                }else if (j == 0 || j == 5){
                    a[i][j] = '*';
                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 6; i++){
            for(int j=0; j< 6; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

    private static void drawX() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<6; j++){
                if (i == j) {
                    a[i][j] = '*';
                }else if (j == 5-i) {
                    a[i][j] = '*';

                }else{
                    a[i][j] = ' ';
                }
            }
        }
        for(int i=0; i< 6; i++){
            for(int j=0; j< 6; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }

    }

}
