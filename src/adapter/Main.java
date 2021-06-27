package adapter;

public class Main {

    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.doubleNumber(10f));
        System.out.println(adapter.halfNumber(10f));


    }
}
