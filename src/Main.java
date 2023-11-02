public class Main {
    public static void main(String[] args) {
        Main myFactory = new Main();
    }

    //constructor method
    /// a constructor is a method with no return type and has the same name as the class it's in.
    public Main() {

        System.out.println("----------------");
        Fruit strawberry;
        strawberry = new Fruit("red", "triangle", 20, true);
        strawberry.printFruit();

        System.out.println("----------------");
        Fruit apple;
        apple = new Fruit("green ", "circle", 35, true);
        apple.printFruit2();

        System.out.println("----------------");
        Fruit kiwi;
        kiwi = new Fruit("brown and green", "oval", 9, false );
        kiwi.printFruit3();
    }
}