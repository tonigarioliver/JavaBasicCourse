package Exercise1;

public class Main {
    public static void main(String[] args) {
        Print p = new Print();
        int i = 0;
        p.printvalue(i);
        String j =Integer.toString(i);
        p.printvalue(j);
        float k = Float.parseFloat(j);
        p.printvalue(k);
        boolean l = true;
        p.printvalue(l);
        long m = Long.parseLong(j);
        p.printvalue(m);

    }
}
