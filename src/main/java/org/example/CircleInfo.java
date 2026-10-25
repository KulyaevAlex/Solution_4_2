package org.example;

public class CircleInfo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(5, 1, 1);
        Circle circle4 = new Circle(6, 2, 3);
        Circle circle5 = new Circle(7, 2, -2);

        System.out.printf("Площадь окружности равна: %.3f%n", circle1.area());
        System.out.printf("Площадь окружности равна: %.3f%n", circle2.area());
        System.out.printf("Периметр окружности равен: %.3f%n", circle3.perimeter());
        System.out.println();
        System.out.println("Введем точку с координатами x и y");
        double x = 2.0;
        double y = -1.0;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Проверим, находится ли точка внутри окружности c параметрами: ");
        circle3.printInfo();
        System.out.println(circle3.contains(x, y) ? "Да, точка внитри окружности" : "Нет, точка вне окружности");
        System.out.println();
        System.out.println("Проверим пересекаются ли окружности ");
        circle4.printInfo();
        circle5.printInfo();
        System.out.println(circle4.intersects(circle5) ? "Да, окружности пересекаются" : "Нет, окружности не пересекаются");
    }
}
