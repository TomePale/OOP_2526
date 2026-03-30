package inner_cls_pckg;

import java.util.ArrayList;

public class OuterCLS {
    private int id;
    private static int cntID = 1;
    private String nameIT;
    private static final String OUTERNME = "Name oft hte outer cls";
    private static ArrayList<OuterCLS> outList = new ArrayList<>();

//    public OuterCLS() {
//        System.out.println("Creating an object of the OUTER CLS!");
//    }

    public OuterCLS(String nameIT) {
        this.nameIT = nameIT;
        this.id = cntID++;
        OuterCLS.outList = new ArrayList<>();
    }

    static class StaticInnerCLS {
        static void addElementTwoList(OuterCLS outerElement) {
            System.out.println("Adding element to the list!");
            outList.add(outerElement);
        }
    }


    class InnerCLS {
        String someInnerName;

        public InnerCLS(String name) {
            this.someInnerName = name;
        }

        public void innerInfo() {
            System.out.println("This is the object of the: " + this.getClass().getSimpleName());
            System.out.println("This inner class id - hashCode: " + Integer.toHexString(this.hashCode()));
            System.out.println("This is some other object : " + OuterCLS.this.getClass().getSimpleName());
            System.out.println("This is outer cls id - hashCode: " + Integer.toHexString(OuterCLS.this.hashCode()));
        }

        @Override
        public String toString() {
            return "InnerCLS{" +
                    "someInnerName='" + someInnerName + '\'' +
                    '}';
        }
    }


    public InnerCLS createInnerClsObject(String innerClsObjectName) {
        return new InnerCLS(innerClsObjectName);
    }


    @Override
    public String toString() {
        return "OuterCLS{" +
                "id=" + id +
                ", nameIT='" + nameIT + '\'' +
                '}';
    }
}
