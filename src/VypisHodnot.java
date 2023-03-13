import funkce.Kalkulacka;
import funkce.Matice;
import funkce.NejvissiDelitel;
import java.util.Scanner;
public class VypisHodnot {
    private static final Scanner vstup = new Scanner(System.in);
    public static void main(String[] args) {
        int c1=0;
        int c2=0;
        System.out.println("Zadej první číslo");
        c1=vstup.nextInt();
        System.out.println("Zadej druhé číslo");
        c2=vstup.nextInt();
        Kalkulacka calc=new Kalkulacka();
        int calcS=calc.soucet(c1,c2);
        System.out.println("součet je "+calcS);
        int calcN=calc.nasobek(c1,c2);
        System.out.println("násobek je "+calcN);
        float calcP=calc.podil(c1,c2);
        System.out.println("podíl je "+calcP);

        NejvissiDelitel del=new NejvissiDelitel();
        int del2 = del.deleni(c1,c2);
        if(del2>1){
            System.out.println("nejvišší dělitel je "+del2);
        }
        else if (del2==1) {
            System.out.println("číslo lze dělit pouze 1");
        }
        Matice mat =new Matice();
        int[][] matR=mat.vypis(c1,c2);
    }
}