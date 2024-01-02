import CRUD.User;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        User user = new User();
        String Operation ;




        System.out.println("This is CRUD Operation : \n 1. add \n 2. edit \n 3. remove \n 4. show \n 5. exit");

        do{
             Operation =  scanner.nextLine() ;
            switch(Operation) {
                case "add":
                    System.out.println("Add a user ");
                    String addName = scanner.nextLine();
                    user.AddUser(addName);
                    System.out.println("User Added successfully!");
                    break;

                case "edit":
                    System.out.println("Enter id");
                    int editId = scanner.nextInt();

                    System.out.println("Enter name");
                    String editName = scanner.next();

                    user.EditUser(editId, editName);
                    System.out.println("User has changed successfully!");

                    break;
                case "remove":
                    System.out.println("Enter id");
                    int removeId = scanner.nextInt();
                    user.RemoveUser(removeId);
                    System.out.println("User removed successfully!");

                case "show":
                    User.ShowUsers();
                    break;
            }


        }while(!Objects.equals(Operation, "exit"));

        scanner.close();
    }



    }



