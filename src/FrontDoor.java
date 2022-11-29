public class FrontDoor {
    public static void main(String[] args) {
        Square mySquare = new Square();
        System.out.println(mySquare);
        mySquare.setSide(5);
        System.out.println(mySquare);
    }
}
