package com.test;

import java.util.Scanner;

public class UserCounter {

    private String LastName;
    private int age;
    private Scanner in;
    private UserCounter st[];
    private int i;

    public void count(){

        in = new Scanner(System.in);
        st = new UserCounter[6];

        for(i=1;i<st.length;i++)

        {
            System.out.println("Enter name and age of "+i+" user: ");
            st[i] = new UserCounter();
            st[i].LastName = in.nextLine();
            st[i].age = in.nextInt();
            in.nextLine();
        }

        System.out.println("Sorry, container is full");
        System.out.println();
        System.out.println("Information about users:");

        for(i=1;i<st.length;i++)

        {
            System.out.println("Name of "+i+" user: "+st[i].LastName+" ,age: "+st[i].age);
        }

    }
}
