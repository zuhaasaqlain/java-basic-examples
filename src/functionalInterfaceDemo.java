


@FunctionalInterface
interface Cab {
   public void bookCab();
}


public class functionalInterfaceDemo {
    public static void main(String[] args) {
        Cab cab = () -> System.out.println("Ola booked a cab ");
        cab.bookCab();
    }
}
