/*
package solid;

import java.util.ArrayList;
import java.util.List;

public class LiskovsSubstitutionPrinciple extends MemberLiskov {

    public LiskovsSubstitutionPrinciple(String name) {
        super(name);
    }

    @Override
    public void test() {
        System.out.println("LiskovsSubstitutionPrinciple Executed");
    }
    @Override
    public void enquire() {
        System.out.println("LiskovsSubstitutionPrinciple Enquiry");
    }
}
class Liskov2Example extends MemberLiskov {

    public Liskov2Example(String name) {
        super(name);
    }

    @Override
    public void test() {
        System.out.println("Liskov2Example executed");
    }
    @Override
    public void enquire() {
        System.out.println("LiskovsSubstitutionPrinciple Enquiry");
    }
}
class Enquiry extends MemberLiskov {

    public Enquiry(String name) {
        super(name);
    }

    @Override
    public void test() {
        System.out.println("Liskov2Example executed");
    }
    @Override
    public void enquire() {
        throw new RuntimeException("Illegal Implementation : Liskov's Principle");
    }
}

class TestMain {
    public static void main(String[] args) {
        List<MemberLiskov> list = new ArrayList<>();

        LiskovsSubstitutionPrinciple l1 = new LiskovsSubstitutionPrinciple("Liskov-1");
        Liskov2Example l2 = new Liskov2Example("Liskov-2");
        Enquiry l3 = new Enquiry("Enquiry-3");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        for (MemberLiskov m: list) {
            m.enquire();
        }
    }
}*/
