public class Square extends Rectangle {
    float side1;
    float side2;

    public Square(float side1, float side2) {
        super(side1, side2);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float calculateAreaMethode() {
        float area = side1 * side2;
        System.out.print("The area of Squere is : " + area);
        return area;
    }
}