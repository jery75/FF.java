import funkce.Kalkulacka;
import funkce.NejvissiDelitel;

public class Main {
    public static void main(String[] args) {
        int c1=54;
        int c2=72;

        Kalkulacka calc=new Kalkulacka();
        int calcS=calc.soucet(c1,c2);
        System.out.println("součet je "+calcS);
        int calcN=calc.nasobek(c1,c2);
        System.out.println("násobek je "+calcN);
        float calcP=calc.podil(c1,c2);
        System.out.println("podíl je "+calcP);

        NejvissiDelitel del=new NejvissiDelitel();
        int del2 = del.deleni(c1,c2);
        System.out.println("nejvišší dělitel je "+del2);
    }
}