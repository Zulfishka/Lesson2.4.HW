import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> commands1 = new ArrayList<>();
        ArrayList<String> commands2 = new ArrayList<>();
        ArrayList<String> commands3 = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            String name = scanner.nextLine();
            commands1.add(name);
        }
        System.out.println("Список А ");

        for (int i = 0; i < 6; i++) {

            System.out.println(commands1.get(i));
        }

        for (int i = 0; i < 6; i++) {
            String name = scanner.nextLine();
            commands2.add(name);
        }
        System.out.println("Список Б ");

        for (int i = 0; i < 6; i++) {
                       System.out.println(commands2.get(i));
        }

        commands3.add(commands1.get(0));
        commands3.add(commands2.get(4));
        commands3.add(commands1.get(1));
        commands3.add(commands2.get(3));
        commands3.add(commands1.get(2));
        commands3.add(commands2.get(2));
        commands3.add(commands1.get(3));
        commands3.add(commands2.get(1));
        commands3.add(commands1.get(4));
        commands3.add(commands2.get(0));

        System.out.println("Список С");
        for (int i = 0; i < commands3.size(); i++) {
            System.out.println(commands3.get(i));

        }

        Comparator<String> byLength = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length () - s2.length ();
            }
        };
        Collections.sort(commands3, byLength);
        System.out.println("\nотсортировано\n");
        System.out.println(commands3);
        }

    }