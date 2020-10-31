package OnlineShopping;

public class Main {
    public static void main(String[] args) throws InvaildExpection{
        Processing shopping = new Processing();
        shopping.AddCustomer("Евгений", "123456789123");
        shopping.AddCustomer("Екатерина", "345961038466");

        shopping.PrintCustomer();

    }
}
