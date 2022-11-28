package lesson5;

public class TwoDemensionArrayBasic {
  public static void main(String[] args) {
    int[][] pascalsTriangles;
    pascalsTriangles =  new int[4][];
    int[] rowZero = pascalsTriangles[0];

    pascalsTriangles[0] = new int[]{1};
    pascalsTriangles[1] = new int[]{1,1};
    pascalsTriangles[2] = new int[]{1,2,1};
    pascalsTriangles[3] = new int[]{1,3,3,1};
    int[] rowTwo = pascalsTriangles[2];
    rowTwo[1] = -5;

    int[][] matrix;
    matrix = new int[4][];
    matrix = new int[4][4];

    int[][] pascalAgain = new int[][]{{1},{1,1},{1,2,1},{1,3,3,1}};
  }
}
