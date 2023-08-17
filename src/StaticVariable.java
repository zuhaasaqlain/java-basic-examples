

class Mobile {
     String brand;
     int price;
     static String name;

     public void show(){
         System.out.println(brand + " " + price + " " + name);
     }

}


public class StaticVariable {
    public static void main(String[] args) {
         Mobile obj = new Mobile();
         obj.brand = "Iphone";
         obj.price = 123456;
         obj.name = "anything";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 123456;
        obj1.name = "anything";
    }
}
