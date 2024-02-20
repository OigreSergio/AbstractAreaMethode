public class Triangle extends Rectangle {
    private float base;
    private float height;
    public Triangle(float base,float height){
        super(base, height);
        this.height=height;
        this.base=base;
    }
    public float calculateAreaMethode() {
        float area = base*height/2;
        System.out.print("The result of triangle area is: "+area+"\n");
        return area;
    }
}

