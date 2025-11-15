package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private static <String> DetailsOne= new ArrayList<>();

    public static String Details(String name, double grade) {

        DetailsOne
    return name + String.valueOf(grade);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("choose the following from the menu "+
                    "\n 1.Add student and grade " +
                    "\n 2. View all students "+
                    "\n 3.Calculate class average "+
                    "\n 4.Show top student" +
                    "\n 5.Exit");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:{
                    System.out.print("Add the name: ");
                    String name = scanner.nextLine();
                    System.out.print("Add the grade: ");
                    double grade = scanner.nextDouble();


                    break;
                }
                case 2:{
                    System.out.print(Details(name,grade));
                }
            }





        }
    }
}
