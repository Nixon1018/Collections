package org.example;

import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        logger.info("1.Array 2.Arraylist 3.list 4.Quiet");
        int n=1;
        do {
            int choice = sc.nextInt();
            if(choice==1)
            {
                Array a = new Array();
                a.arr();
            }
            if(choice==2)
            {
                Arraylist al = new Arraylist();
                al.arraylist();
            }
            if (choice==3)
            {
                Linkedlist ll = new Linkedlist();
                ll.linkedlist();
            }
            if(choice==4)
            {
                n=0;
            }
        }while(n==1);

    }
}
