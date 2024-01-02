package CRUD;

import java.util.ArrayList;


public class User {
    public static ArrayList<String> Users = new ArrayList<>();
    public static void AddUser(String user){
        Users.add(user);
        System.out.println("user " + user + " added!" ); ;
        System.out.println(Users);

    }
    public static void RemoveUser(int user){
        Users.remove(user);
        System.out.println("user " + user + " removed!" );

    }
    public static void EditUser(int id,String user){
        Users.set(id,user);
        System.out.println("user<" + id + "> has changed to " + user ); ;

    }
    public static void ShowUsers(){
        System.out.println(Users);
    }

//    public static void Clear(){
//        Users.clear();
//    }





}
