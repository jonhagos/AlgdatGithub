package Oppgaveruke1;

public class Oppgave1123 {

    public static void main(String[] args) {
        int[] a ={1,9,3,6,7,9,5};
        int maks2ind = maks2(a);
        System.out.println(maks2ind);
    }

    public static int maks2(int[] a){
        if(a.length < 1 )
            throw new java.util.NoSuchElementException("Tabellen er tomt");
        int m=a.length - 1;
        for(int i =(a.length - 2);i >= 0;i--){
            if(a[i]>a[m])
                m = i;
        }
        return m;
    }
}
