public class Main {
    public static void main(String[] args) {
        Main myFactory = new Main();
    }

    //constructor method
    /// a constructor is a method with no return type and has the same name as the class it's in.
    public Main() {
        // strawberry: red, triangle, 200, yes, 20
        Fruit strawberry;
        strawberry = new Fruit();
        strawberry.color = "red";
        strawberry.shape = "triangle";
        strawberry.nSeeds = 200;
        strawberry.nBush = 20;
        strawberry.isRipe = true;
        strawberry.printInfo();

        Fruit apple;
        apple = new Fruit();
        apple.color = "green";
        apple.shape = "circle";
        apple.nSeeds = 4;
        apple.nTree = 35;
        apple.isRipe = true;
        apple.printInfo();


        // apple: green, circle, 4, yes, 35
    }
}