package Exercise2;

public class Main {
    public static void main(String[] args) {
        float price = 10;
        int IVA = 7;
        System.out.println(pricewithIVA(price,IVA));
    }

    private static float pricewithIVA(float price, int IVA) {
        return price*((((float)IVA)/100)+1);
    }

}
