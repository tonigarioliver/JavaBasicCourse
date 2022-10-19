package Chapter7;

import Exercise1.Print;

import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*try {
            InputStream file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Chapter7\\test");
            try {
                byte[] datos = file.readAllBytes();
                for(byte dato : datos){
                    System.out.println((char)dato);
                }
            }catch(IOException e) {
                System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error" + e.getLocalizedMessage());
        }*/
        /*try {
            InputStream file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Chapter7\\test");
            try {
                int dato = file.read();
                while(dato != -1){
                    System.out.print((char)dato);
                    dato = file.read();
                }
            }catch(IOException e) {
                System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error" + e.getLocalizedMessage());
        }*/
        try {
            InputStream file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Chapter7\\test");
            try {
                byte[] datos = new byte[7];
                int dato = file.read(datos);
                while(dato != -1){
                    System.out.print((datos.toString()).toCharArray());
                    dato = file.read(datos);
                }
            }catch(IOException e) {
                System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error" + e.getLocalizedMessage());
        }

        try {
            InputStream file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Chapter7\\test");
            BufferedInputStream filebuffer = new BufferedInputStream(file);
            try{
                int dato = filebuffer.read();
                while(dato != -1){
                    System.out.print((char)dato);
                    dato = filebuffer.read();
                }
            }catch(IOException e) {
                System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error" + e.getLocalizedMessage());
        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un entero");
            int a = scanner.nextInt();

            try {
                InputStream file = new FileInputStream("C:\\Users\\tonie\\IdeaProjects\\JavaBasicCourse\\src\\Chapter7\\test");
                BufferedInputStream filebuffer = new BufferedInputStream(file);
                try {
                    int dato = filebuffer.read();
                    while (dato != -1) {
                        System.out.print((char) dato);
                        dato = filebuffer.read();
                    }
                } catch (IOException e) {
                    System.out.println("No se puede leer fichero" + e.getLocalizedMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Oye, que el programa da error" + e.getLocalizedMessage());
            }
        }catch(Exception e){

        }

        try {
            PrintStream  filetxt = new PrintStream("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
