package Constructor;

class rectangle{
    private double length;
    private double breadth;

    public rectangle(){
        length=1;
        breadth=1;
    }
    public rectangle(double l, double b){
        setLength(l);
        setBreadth(b);
    }
    public rectangle(double squ){
        length = breadth = squ;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setLength(double length) {
        if(length >= 0)
            this.length = length;
        else
            this.length = 0;

    }
    public void setBreadth(double breadth) {
        if (breadth >=0)
            this.breadth = breadth;
        else
            this.breadth = 0;
    }
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}

public class Rectangle_test {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        System.out.println("Area "+ obj.area());

        rectangle r1 = new rectangle(12 ,5);
        System.out.println("Area "+ r1.area());

        rectangle r2 = new rectangle(12, 12);
        System.out.println(r2.isSquare());

        rectangle obj1 = new rectangle();  // b=1, l=1
        System.out.println("perimeter "+ obj1.perimeter());

        rectangle r11 = new rectangle(12 ,5);
        System.out.println("perimeter "+ r11.perimeter());

        rectangle r3 = new rectangle(15);
        System.out.println("Area "+ r3.area());
    }
}
