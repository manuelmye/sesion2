package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person; 

//public class PersonData {
    //Person p = new Person();
    //create(Person)

    //public static void create(Person p) {
        //todo
        //System.out.println("create");
    //}
    //public list<Person> list(string filter) {
        //list<Person> lis= new Arraylist<Person>();
        //*todo
        //System.out.println("list");
        //return lis;
    //}
    //public Person get(int id){
        //return new Person();
        //*todo
        //System.out.println("get");
        //return d;
    //}

    // update(Person, int): void
    // delete(int): void
//}
public class PersonData {
    List<Person> list = new ArrayList<Person>();
    int id=0;

    public void create(Person p) {
        p.setId(++id);
        lis.add(p);
    }
    public List <Person> list(String filter) {
        return list;
    }
    public Person get(int id) {
        int index;=0;
        for (Person d : lis){
            return lis.get(index);
        }
        index++;
    }
    return null;
}
public void update(Person p) {
    int index = 0;
    // boolean b=false;
    for (Person d : lis) {
        if (d.getId() == p.getId()) {
            // d = p;
            lis.set(index, p);
            // b=true;
        }
        index++;
    }
    // if (b)
    // System.out.println("encontrado");
    // else
    // System.out.println("NO encontrado");

}
public void delete(int id) {
    for (Person d : lis) {
        if (id == d.getId()) {
            lis.remove(d);
            // System.out.println("Eliminado " + d.getName());
        }
    }
}