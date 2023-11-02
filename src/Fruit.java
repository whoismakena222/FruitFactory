public class Fruit {

    public String color;
    public String shape;
    public int nSeeds;
    public boolean isRipe;
    public int nBush;


    public void printFruit() {
        System.out.println("the fruit is a strawberry ");
        System.out.println("color = " + color);
        System.out.println("shape = " + shape);
        System.out.println("number of seeds = " + nSeeds);
        System.out.println("number of strawberrys per bush = " + nBush);
        System.out.println("the fruit is ripe = " + isRipe);

    }
    public void printFruit2(){
        System.out.println("the fruit is an apple ");
        System.out.println("color = " + color);
        System.out.println("shape = " + shape);
        System.out.println("number of seeds = " + nSeeds);
        System.out.println("number of apples per tree = " + nBush);
        System.out.println("the fruit is ripe = " + isRipe);
    }

    public void printFruit3(){
        System.out.println("the fruit is a kiwi ");
        System.out.println("color = " + color);
        System.out.println("shape = " + shape);
        System.out.println("number of seeds = " + nSeeds);
        System.out.println("number of kiwis per vine = " + nBush);
        System.out.println("the fruit is ripe = " + isRipe);
    }

    public Fruit (String paramColor, String paramShape, int paramnBush, boolean paramisRipe) {
        color = paramColor;
        shape = paramShape;
        nBush = paramnBush;
        isRipe = paramisRipe;
        nSeeds = (int)(Math.random()*100);

    }
}
