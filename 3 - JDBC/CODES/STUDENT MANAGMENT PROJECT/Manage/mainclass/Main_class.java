package Manage.mainclass;

import java.util.*;
import Manage.add.*;
import Manage.delete.delete_data;
import Manage.display.display_data;
import Manage.update.update_data;

public class Main_class{
    public static void main(String[] args) throws Exception {
        System.out.println("WELCOME TO STUDENT MANAGMENT SYSTEM !!");
        Scanner sc=new Scanner(System.in);
        System.out.println();
        while(true){
            System.out.println("1.FOR INSERTING THE DATA");
            System.out.println("2.FOR DELETING THE DATA ");
            System.out.println("3.FOR DISPLAYING ALL THE DATA");
            System.out.println("4.FOR UPDATING THE DATA");
            System.out.println("5.FOR EXITING");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE : ");
            int input_01=sc.nextInt();

            if(input_01==1){
                add_data.input();

            }
            else if(input_01==2){
                delete_data.delete();
            }
            else if(input_01==3){
                display_data.display();

            }
            else if(input_01==5){
                break;

            }
            else if(input_01==4){
                update_data.update();
            }
            else{

            }
        }
        System.out.println("THANKS FOR USING OUR SYSTEM :)) ");
        sc.close();
    }
}
