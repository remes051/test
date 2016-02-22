package com.test;

import java.util.Scanner;

public class UserCounter {

    private String FirstName;
    private int age;
    private Scanner in;
    private UserCounter st[];
    private int i;
    private String name;
    private String a;

    public void begin() {
        in = new Scanner(System.in);
        System.out.println("Hello, introduce yourself:");
        name = in.nextLine();
        introduce(name);
    }

    public void introduce(String name) {
        System.out.println("Hi " + name + ", Enter 1 create new user, enter 2 to search user, 3 to exit:");

    }

    public void logic() {
        a = in.nextLine();
        if (a.equals("1")) {
            System.out.println("");
        }
        if(a.equals("3")){
            System.out.println("Exit");
            System.exit(0);
        }
        in = new Scanner(System.in);
        st = new UserCounter[6];

        for (i = 1; i < st.length; i++)

        {
            System.out.println("Enter information of " + i + " user: ");
            System.out.println("Name:");
            st[i] = new UserCounter();
            st[i].FirstName = in.nextLine();
            System.out.println("Age:");
            st[i].age = in.nextInt();
            if (st[i].age > 100 || st[i].age < 0) {
                System.out.println("Age should be more than 0 and less than 100, try again");
                in.nextInt();
            }
            in.nextLine();
        }

        System.out.println("Sorry, container is full");
        System.out.println();
        System.out.println("Information about users:");

        for (i = 1; i < st.length; i++)

        {
            System.out.println("Name of " + i + " user: " + st[i].FirstName + ", age: " + st[i].age);
        }

    }

}
