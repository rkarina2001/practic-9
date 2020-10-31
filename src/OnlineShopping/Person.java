package OnlineShopping;

import java.io.IOException;

public class Person {

    private String name;
    private String INN;

    public Person(String n, String i) throws InvaildExpection{
        if (i.length() != 12) {
            throw new InvaildExpection("INN can't be less than 12 numbers");
        }
        name=n;
        INN=i;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getINN() {
        return INN;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", INN=" + INN +
                '}';
    }
}
