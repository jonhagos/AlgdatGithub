package Oppgaveruke1;

public class Oppgave112 {
    public static void main(String[] args) {
        int[]a = { 8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        int mins_ind = mins(a);
        System.out.println(mins_ind);

    }

    public static int mins(int[] a){
        if(a.length < 1)
            throw new java.util.NoSuchElementException("Tabelen er tomt");

        int m = 0;
        for(int i = 1; i < a.length;i++){
            if(a[i]<a[m]) m = i;

        }
        return m;


    }

}
