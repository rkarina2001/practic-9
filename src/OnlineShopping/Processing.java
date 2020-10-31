package OnlineShopping;

import ImprovedPr6.Student;

import java.util.ArrayList;

public class Processing {
    ArrayList<Person> customer;

    public Processing(){
        customer = new ArrayList<>();
    }

    public void AddCustomer(String name, String INN) throws InvaildExpection{
        Person person = new Person(name,INN);
        customer.add(person);
    }

    public void PrintCustomer(){
        for (Person person : customer){
            System.out.println(person.toString());
        }
    }
}
