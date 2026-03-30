package inner_cls_pckg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        OuterCLS outer1 = new OuterCLS("Ime!");
//        System.out.println(outer1);
//
//        OuterCLS.InnerCLS inner1 = outer1.new InnerCLS("Ime unutarnje!");
//        inner1.innerInfo();
//
//        OuterCLS.InnerCLS inner2 = outer1.createInnerClsObject("Ime druge unutarnje!");
//        inner2.innerInfo();
//
//        ArrayList<Integer> initList = new ArrayList<>();
//        initList.add(10);
//        initList.add(21);
//        initList.add(22);
//
//        listElements(initList);

        CLSWithLocal stringParser = new CLSWithLocal();
        String[] data = {"6;2;3", "4;5;6", "test;8;app", "h;8,9", null};
        stringParser.processStringDData(data);



    }

//    private static void listElements(ArrayList<Integer> elements){
//        for(Integer el : elements){
//            System.out.println(el);
//        }
//    }
}
