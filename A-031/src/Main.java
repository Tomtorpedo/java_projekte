public class Main {
    public static void main(String[] args) {
        int[][] matheMatrix = new int[20000][10000];
        for (int i = 0; i < matheMatrix.length; i++) {
            for (int j = 0; j < matheMatrix[i].length; j++) {
                matheMatrix[i][j] = i * j;
            }
        }
        System.out.print(matheMatrix[12345][9876]);
    }
}