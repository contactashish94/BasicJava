package cimpress.overrideequalsexample;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Subash Adhikari", 28));
        people.add(new Person("K", 28));
        people.add(new Person("StackOverflow", 4));
        people.add(new Person("Subash Adhikari", 28));

        for (int i = 0; i < people.size() - 1; i++) {
            for (int y = i + 1; y <= people.size() - 1; y++) {
                boolean check = people.get(i).equals(people.get(y));

                System.out.println("-- " + people.get(i).getName() + " - VS - " + people.get(y).getName());
                System.out.println(check);
            }
        }
    }
}
