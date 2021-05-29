package cl.bgmp;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // int i = scanNumber();
        // printFromZeroToI(i);

        Stick stick = new Stick("Verde", "Madera", 10.2);
        System.out.println(stick.getColor());
        stick.setColor("Morado");
        System.out.println(stick.getColor());

        stick.goUp();
        stick.goUp(40);
        stick.getX();

        Cup cup = new Cup();
        Stick stick1 = new Stick("Verde", "Madera", 10.2, 5.5, 4.4, 55);
        stick.setX(3);
    }

    public static void printFromZeroToI(int i) {
        for (int j = 0; j <= i; j++) {
            System.out.println(j);
        }
    }

    public static int scanNumber() {
        System.out.println("Ingresa el limite superior:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
