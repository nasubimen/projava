package main.java.projava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 5;
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
        }
    }
}
