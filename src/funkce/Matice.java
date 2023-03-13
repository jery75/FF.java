package funkce;

public class Matice {
    public int[][] vypis(int c1, int c2) {
           if (c1 * c2 < 100) {
                  int[][] pole = new int[c1][c2];
                  int hodnota = 1;
                  for (int i = 0; i < c1; i++) {

                         System.out.println("");
                         for (int j = 0; j < c2; j++) {
                                pole[i][j] = hodnota;
                                hodnota++;
                                if (hodnota < 11) System.out.print("  " + pole[i][j]);
                                else System.out.print(" " + pole[i][j]);
                         }
                  }
                  return pole;
           }
           else System.out.println("hodnota matice překročila 100 matice se nevypíše");
           return null;
    }
}
