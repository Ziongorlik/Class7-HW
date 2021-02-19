import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise-1
        //  JavaBeans are classes that encapsulate many objects into a single object (the bean).
        //  They are serializable, have a zero-argument constructor, and allow access to properties using getter and setter methods.
        //  The name "Bean" was given to encompass this standard, which aims to create reusable software components for Java.

        // Exercise-2
        // Design patterns are not language dependent.

        // Exercise-3
        /*Scanner scanner = new Scanner(System.in);
        Logs custumerLog = Logs.getInstance();
        String input = null;

        try {
            System.out.print("Input your name: ");
            input = scanner.next();
            custumerLog.writeToFile(input);

            System.out.print("Input your age : ");
            input = scanner.next();
            custumerLog.writeToFile(input);

            System.out.print("Input your address : ");
            input = scanner.next();
            custumerLog.writeToFile(input);

            System.out.print("Input your phone number : ");
            input = scanner.next();
            custumerLog.writeToFile(input);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Exercise-4
        // Uses: BWM, CarFactory, CarNames, Drivable, Fiat, Porsche, FactoryTest

        // Exercise-5
        // Pictures are in the Screenshots directory.

        // Exercise-6
        // https://github.com/Ziongorlik/Class1-HW.git

        // Exercise-7
        //  Maven is a build automation tool used primarily for Java projects.
        //  Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages.
        //  In Maven terminology, a repository is a directory where all the project jars, library jar,
        //  plugins or any other project specific artifacts are stored and can be used by Maven easily.

        // Exercise-8
        // Uses: Table, TableThread1, TableThread2
        Table table = Table.getInstance();
        TableThread1 tableThread1 = new TableThread1(table);
        TableThread2 tableThread2 = new TableThread2(table);
        tableThread1.start();
        tableThread2.start();

        // Exercise-9
        // Builder Pattern: says that "construct a complex object from simple objects using step-by-step approach".
        // Bridge Pattern: says that just "decouple the functional abstraction from the implementation so that the two can vary independently".
        // Strategy Pattern: says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

        // Exercise-10
        // Ivy
        // Nant

    }
}
