package Exercise7;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"hello", "how", "are", "you"};
        for (String element : stringArray) {
            System.out.println(element);
        }
        int matrix[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        Vector<String> names = new Vector<>();
        String name = "Hello";
        for (int i = 0; i < 5; i++) {
            names.add(name);
            name += name;
        }
        for (String newname : names) {
            System.out.println(newname);
        }
        names.removeElementAt(1);
        names.removeElementAt(1);
        for (String nameupdate : names) {
            System.out.println(nameupdate);
        }
        /*if we want to copy a n elements into an array java takes memory
        duplicate the inital size*/
        ArrayList<String> listNames = new ArrayList<>(Arrays.asList(stringArray));
        LinkedList<String> linkedNames = new LinkedList<>(listNames);
        for (String listname : linkedNames) {
            System.out.println(listname);
        }
        for (String listname : linkedNames) {
            System.out.println(listname);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) % 2) == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
        try {
            DividePorCero(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        PrintStream FileOut;
        try {
            FileOut = new PrintStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Exercise7\\testout.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStream file;
        try {
            file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Exercise7\\testin.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        copyFile(FileOut,file);
        Lasttest();
        FileInputStream filein;
        try {
            filein = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Exercise7\\finalin.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        copyFile(FileOut,filein);

    }
    static void DividePorCero(int x, int y)throws ArithmeticException{
        int result = x/y;
        System.out.println(result);
    }
    static void copyFile(PrintStream fileOut, InputStream fileIn){
        BufferedInputStream filebuffer = new BufferedInputStream(fileIn);
        try {
            int dato = filebuffer.read();
            while (dato != -1) {
                System.out.print((char) dato);
                fileOut.print((char)dato);
                dato = filebuffer.read();
            }
            fileIn.close();
        } catch (IOException e) {
            System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
        }
    }
    static void Lasttest(){
        //Create file
        PrintStream FileOut;
        try {
            FileOut = new PrintStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Exercise7\\finalin.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        LinkedList<String> sentences = new LinkedList<>();
        String sentence = "sentence";
        for (int i = 0 ; i<5; i++) {
            sentences.add(sentence);
            sentence +=sentence;
        }
        HashMap<Integer,String> sentenceMap = new HashMap<>();
        for (String s : sentences) {
            sentenceMap.put(sentences.indexOf(s),s);
        }
        String[] sentencesArray = new String[sentenceMap.size()] ;
        for(int i : sentenceMap.keySet()) {
            sentencesArray[i] =sentenceMap.get(i);
        }
        for(String s :sentencesArray){
            FileOut.println(s);
        }
        FileOut.close();
    }
}
