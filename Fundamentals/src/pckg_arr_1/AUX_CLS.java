package pckg_arr_1;

import java.sql.Struct;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private  static final int ORIGIN = 0;
    private  static final int BOUND = 250;

    public static int[] genIntArray(int numElements){

        int[] array = new int[numElements];
        for(int k= 0; k < numElements; k++){
           array[k] = ThreadLocalRandom.current().nextInt(ORIGIN, BOUND);
        }
        return array;
    }

    public static Student[] genStudentFromNames(String[] names){

        Student[] studenti = new Student[names.length];
        for(int k = 0; k < names.length; k++){
            studenti[k] = new Student(names[k]);
        }
        return studenti;
    }

    public static Profesor[] genProfsFromNames(String[] names){

        Profesor[] profs = new Profesor[names.length];
        for(int k = 0; k < names.length; k++){
            profs[k] = new Profesor(names[k]);
        }
        return profs;
    }

    public static String concatenateArrELements(String [] strArr){
        String conString = "";

        for (String el : strArr){
            conString = conString + " " + el;
        }
        return conString;
    }

    public static String[] userInputsArr(Scanner scanner, int numElements){
        String[] userArr = new String[numElements];
        for(int k = 0; k < numElements; k++){
            System.out.println("Unesite jedan string!!!\n");
            userArr[k] = scanner.nextLine();
        }

        return userArr;
    }



    public static void printIntFromArr(int[] intArr){
        for(int el : intArr){
            System.out.println(el);
        }
    }

    public static void printStrFromArr(String[] strArr){
        for(String el : strArr){
            System.out.println(el);
        }
    }

    public static void printStudentFromArr(Student[] stud){
        for(Student st : stud){
            System.out.println(st);
        }
    }

    public static <E> void printELementsFromArr(E[] arr){
        for(E element : arr){
            System.out.println(element);
        }
    }
}
