package Oppgaveruke1;

public class Optimalisering {
    public static void main(String[] args) {
        int[]a ={1,7,8,2,14,5,6};
        int maksval = makss(a);
        System.out.println(maksval);

    }

    public static int makss(int[] a){
        if(a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tomt");

        int maksind = 0;
        int maksval = a[0];
        for(int i = 1;i<a.length;i++) if(a[i] > maksval){

                maksval = a[i];
                maksind = i;
        }
        return maksind;



    }
}
