package test;
import java.util.Scanner;

class Employee
{
    String name;
    int age;
    String phone_number;
    String address;
    int salary;
    
    void printSalary()
    {
        System.out.println("Salary: "+salary);
    }
}

class Officer extends Employee
{
    String specialization;
    void printall(){
        System.out.print("Officer's name:"+name+"\nOfficer's age:"+age+"\nOfficer's phone_number:"+phone_number+"\nOfficer's address:"+address+"\nOfficer's salary:"+salary);
    }
}

class Manager extends Employee
{
    String department;
    void printall(){
        System.out.println("\nManager's name:"+name+"\nManager's age:"+age+"\nManager's phone_number:"+phone_number+"\nManager's address:"+address+"\nManager's salary:"+salary);
    }
}

public class test2 
{
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        
	        Officer off=new Officer();
	        System.out.println("Enter officer name");
	        off.name=sc.nextLine();
	        System.out.println("Enter age of officer");
	        off.age=sc.nextInt();
	        System.out.println("Enter officer phonenumber");
	        off.phone_number=sc.nextLine();
	        System.out.println("Enter address of officer");
	        off.address=sc.nextLine();
	        System.out.println("Enter salary of officer");
	        off.salary=sc.nextInt();
	        off.printall();
	        
	        Manager m=new Manager();
	        System.out.println("Enter name of Manager");
	        m.name=sc.nextLine();
	        System.out.println("Enter age of Manager");
	        m.age=sc.nextInt();
	        System.out.println("Enter phonenumber of manager");
	        m.phone_number=sc.nextLine();
	        System.out.println("Enter address of manager");
	        m.address=sc.nextLine();
	        System.out.println("Enter salary of Manager");
	        m.salary=sc.nextInt();
	        m.printall();
	        
	    }
}	
