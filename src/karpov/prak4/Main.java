package karpov.prak4;

public class Main {
    public static void main(String[] args) {
        Circle abc = new Circle("Red",true,2);
        System.out.printf("Площадь равна %.2f\n",abc.getArea());
        System.out.println(abc.getPerimeter());
        Rectangle abcd = new Rectangle("Blue",true,20,30);
        System.out.printf("Площадь равна %.2f\n",abcd.getArea());
        System.out.println(abcd.getPerimeter());
        Square abcde = new Square("Green",true,20,20);
        System.out.printf("Площадь равна %.2f\n",abcde.getArea());
        System.out.println(abcde.getPerimeter());
    }
}
