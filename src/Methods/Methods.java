package Methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(topla(10, 20));
        System.out.println(faktöriyel(5));
        System.out.println(usAl(1, 3));
    }

    public static int topla(int a, int b) {
        int toplam = a + b;
        return toplam;
    }

    public static int faktöriyel(int c) {
        int f = 1;
        for (int i = 1; i <= c; i++)
            f = f * i;

        return f;
    }

    public static int usAl(int taban, int us) {
        int sonuc = 1;
        for (int i = 1; i <= us; i++)
            sonuc = sonuc * taban;
        return sonuc;
    }


}


