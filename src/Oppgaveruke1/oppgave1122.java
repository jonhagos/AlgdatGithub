package Oppgaveruke1;

public class oppgave1122 {
    public static void main(String[] args) {
      int[] a ={ 8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
      int mins_val=min(a);
        System.out.println(mins_val);
    }
    public static int min(int[] a){
        if(a.length < 1)
            throw new java.util.NoSuchElementException("tabellen er tomt");
        int mins_val = a[0];
        for(int i = 1; i<a.length;i++){
            if(a[i]<mins_val)
                mins_val = a[i];
        }
        return mins_val;

    }
}
