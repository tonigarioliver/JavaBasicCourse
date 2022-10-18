package Chapter6;

import java.math.BigDecimal;
import java.security.Provider;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String text ="Hello World";
        char texttoarray[] = text.toCharArray();
        for (int i = 0; i <text.length()/2; i++) {
            char temp = text.charAt(i);
            texttoarray[i]=text.charAt(text.length()-1-i);
            texttoarray[text.length()-1-i]=temp;
        }
        text=new String(texttoarray);
        System.out.println(text);

        Vector<Integer> vector = new Vector();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        BigDecimal bigDecimal1 = new BigDecimal(0.1f);
        BigDecimal bigDecimal2 = new BigDecimal(0.1f);
        BigDecimal bigDecimal3 = bigDecimal1.add(bigDecimal2);
    }
}

