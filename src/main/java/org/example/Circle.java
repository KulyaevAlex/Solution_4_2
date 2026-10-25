package org.example;

public class Circle {
    double radius;
    double centerX;
    double centerY;

    public Circle() {
        this(1, 0, 0);
    }

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(Circle other) {
        this(other.radius, other.centerX, other.centerY);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    /**
     * Метод возвращает площадь окружности
     */
    public double area() {
        return radius * radius * Math.PI;
    }

    /**
     * Метод возвращает периметр окружности
     */
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Метод принимает координаты точки и возвращает true если точка внутри окружности
     *
     * @param x - Координата x точки
     * @param y - Координа y точки
     * @return - true если точка внутри окружности
     */
    public boolean contains(double x, double y) {
        double dx = x - centerX;
        double dy = y - centerY;
        double distance = dx * dx + dy * dy;
        return distance <= radius * radius;
    }

    /**
     * Метод принимает другой Circle и возвращает true если окружности пересекаются
     *
     * @param other - Другая окружность
     * @return возвращает true если окружности пересекаются
     */
    public boolean intersects(Circle other) {
        double dx = this.centerX - other.centerX;
        double dy = this.centerY - other.centerY;

        double distanceSquare = dx * dx + dy * dy;
        double sumOfRadius = radius + other.radius;
        return distanceSquare <= sumOfRadius * sumOfRadius;
    }

    public void printInfo() {
        System.out.println("Радиус = " + getRadius() + " центр X = " + getCenterX() + " центр Y = " + getCenterY());
    }
}
