import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Algoritmer {
    public static void main(String[] args) {
        int[]a = {12,14,16};
        int max_val = max(a);
        System.out.println(max_val);

    }
    static int max(int[] a){
        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tomt");
        }

        int max_value=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i] > max_value)
                max_value = a[i];

        }
        return max_value;
    }

    public static int maxind(int[] a){
        if(a.length<1)
            throw new java.util.NoSuchElementException("Tabellen er tomt");

        int maxind = 0;
        for(int i = 1;i < a.length;i++){
            if(a[i]>a[maxind])
                maxind = i;

        }
        return maxind;
    }

}
