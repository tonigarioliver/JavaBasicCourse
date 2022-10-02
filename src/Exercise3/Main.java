package Exercise3;

public class Main {
    public static void main(String[] args) {
        String[] names = {"mario", "juan", "", ""};
        System.out.println(concatString(names));
    }

    private static String concatString(String[] names) {
        String text = "";
        for (String name : names) {
            text += name;
        }
        return text;
    }
}

