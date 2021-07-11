package lv.sda;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        //Rectangle
	//Rectangle rectangle = new Rectangle(5,10);
	//Rectangle rectangle1 = new Rectangle();
        //System.out.println("Area: " + rectangle.getArea());
        //System.out.println("Perimeter: " + rectangle.getPerimeter());

        //Calculator

        Calculator calculator = new Calculator();
        int sum = calculator.addValues(2, 4, 8, 9, 10, 11, 23, 25);
        System.out.println(sum);
        System.out.println(calculator.addValues(22, 11, 4));

        int difference, product;
        float quotient, average;

        difference = calculator.subtractValues(60, 30);
        product = calculator.multiplicationValues(3,4,2,5);
        quotient = calculator.divideValues(40, 20);
        average = calculator.averageOfValues(2, 3, 8, 19, 29, 30);

        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);




    }
}
