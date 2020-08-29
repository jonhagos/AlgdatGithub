package Oppgaveruke1;

public class Eksampel112 {

    public static void main(String[] args) {
        int[] a ={1,9,3,6,9,8,5};
        int maks_ind = maks(a);
        System.out.println(maks_ind);

    }
    public static int maks(int[] a){
        if(a.length<1)
            throw new java.util.NoSuchElementException("Tabellen er tomt");

        int m = 0;
        for(int i = 1;i<a.length;i++){
            if(a[i]>=a[m])
                m = i;
        }
        return m;

    }
}
