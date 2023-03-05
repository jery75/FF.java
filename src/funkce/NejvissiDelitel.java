package funkce;

public class NejvissiDelitel {

    public int deleni(int c1, int c2) {
        int nejvisDel = 0;
        for (int i = 1; i <= c2; i++) {
            if (c1 % i == 0 && c2 % i == 0) {
                nejvisDel=i;
            }
        }
        return nejvisDel;
    }
}
