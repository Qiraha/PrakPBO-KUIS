/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.pkg1.pbo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContactManager myContactManager = new ContactManager();
       String name;
       String email;
       String phoneNumber;
       
       name="PhemSee";
       email="phemsee@mail.com";
       phoneNumber="088-999-777-666";
       Contact contact1 = new Contact(name,email,phoneNumber);
       myContactManager.addContact(contact1);
       
       name="Me";
       email="Me@mail.com";
       phoneNumber="089-111-222-333";
       Contact contact2 = new Contact(name,email,phoneNumber);
       myContactManager.addContact(contact2);
       
       name="You";
       email="You@mail.com";
       phoneNumber="087-444-555-666";
       Contact contact3 = new Contact(name,email,phoneNumber);
       myContactManager.addContact(contact3);
       
       name="Qiraha";
       email="Qiraha@mail.com";
       phoneNumber="087-333-555-777";
       Contact contact4 = new Contact(name,email,phoneNumber);
       myContactManager.addContact(contact4);
       
       name="Human";
       email="Human@mail.com";
       phoneNumber="081-444-666-888";
       Contact contact5 = new Contact(name,email,phoneNumber);
       myContactManager.addContact(contact5);
       
       Scanner input = new Scanner (System.in);
        
       String repeat = "y";
        do{
            System.out.print("Search Name : ");name = input.nextLine();
            name = name.toLowerCase();
            Contact result = myContactManager.searchContact(name);
            System.out.println("Looking for contact number...");
            if(result!=null){
                System.out.println("Nama         : "+ result.getName() +"\nEmail        : " + result.getEmail() + "\nNo. Telp     : " + result.getPhoneNumber());
            }
            else{
                System.out.println("Contact not found!");
            }
            System.out.print("search again?(y/n)");repeat = input.nextLine();System.out.println("");
        }while(!"n".equals(repeat));
       
       
       
       
       
    }
    
}
