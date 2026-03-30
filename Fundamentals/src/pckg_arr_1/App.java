package pckg_arr_1;

import java.util.Scanner;

public class App {

    private static Scanner scanner;
    public static void main(String[] args) {
        String[] elem = {"Vasa", "vana plurana", "-----"};
        String res = AUX_CLS.concatenateArrELements(elem);
        System.out.println(res);
        scanner = new Scanner(System.in);
        String[] elms = AUX_CLS.userInputsArr(scanner, 4);
        AUX_CLS.printELementsFromArr(elms);
    }
}
