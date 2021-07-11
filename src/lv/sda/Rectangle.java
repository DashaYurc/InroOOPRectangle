package lv.sda;

public class Rectangle {
    private int breadth;
    private int length;

    //A constructor is used to create objects of a class.
    //Constructor overloading: this is creating multiple constructors while differentiating them with the number of
    //parameters passed in.


    public Rectangle(int breadth, int length){
        //set the fields to the properties of the parameters passed in
        this.breadth = breadth;
        this.length = length;
    }
    public Rectangle(){
    }

    public int getBreadth(){
        return this.breadth = breadth;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length = length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getArea(){
        //Area of a rectangle is l*b
        return this.length * this.breadth;
    }

    public int getPerimeter(){
        return 2 * (this.length + this.breadth);
    }
}
