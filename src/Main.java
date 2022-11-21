import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toUpperCase();
        Weekend weekend = Weekend.valueOf(day);


        switch (weekend) {
            case MONDAY -> System.out.println("-----Monday ukuuga baram-----");
            case TUESDAY -> System.out.println("-----Tuesday practica kylam-----");
            case WEDNESDAY -> System.out.println("-----Wednesday tez jazuuga konuu-----");
            case THRUSDAY -> System.out.println("-----Thrusday ertereek kelip okup kechinde erte ketuu-----");
            case FRIDAY -> System.out.println("-----Friday kechki sabaka ele keluu-----");
            case SATURDAY -> System.out.println("-----Saturday erteden kechke practica kyluu-----");
            case SUNDAY -> System.out.println("-----Sunday erteden kechke uydo es aluuu-----");
        }
    }
}