package com.src;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentDb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the path to create a directory: ");
	      Scanner sc = new Scanner(System.in);
	      String path = sc.next();
	      System.out.println("Enter the name of the desired a directory: ");
	      path = path+sc.next();
	      //Creating a File object
	      File file = new File(path);
	      //Creating the directory
	      boolean bool = file.mkdir();
	      if(bool){
	          System.out.println("Directory created successfully");
	       }else{
	          System.out.println("Sorry couldn’t create specified directory");
	       }
	      System.out.println("Enter the Student Branch :");
	      String stuBranch=sc.nextLine();
	      if(stuBranch=="cse") {
	    	  FileOutputStream fos=new FileOutputStream("D:\\HCL\\Day11\\cse\\studentdb.txt");
	  		ObjectOutputStream oos=new	ObjectOutputStream(fos);
	  		oos.writeObject(new StudentEx(12,"bhagya","86766582615","CSE"));
	  		
	  		oos.close();
			System.out.println("written data of student to the file");
	      }else if(stuBranch=="ece") {
	    	  FileOutputStream fos=new FileOutputStream("D:\\HCL\\Day11\\ece\\studentdb.txt");
		  		ObjectOutputStream oos=new	ObjectOutputStream(fos);
		  		oos.writeObject(new StudentEx(21,"praveen","2978857898","ECE"));
		  		
		  		oos.close();
				System.out.println("written data of student to the file");
				
	      }else if(stuBranch=="eee") {
	    	  FileOutputStream fos=new FileOutputStream("D:\\HCL\\Day11\\eee\\studentdb.txt");
		  		ObjectOutputStream oos=new	ObjectOutputStream(fos);
		  		oos.writeObject(new StudentEx(21,"dharshu","2345582615","EEE"));
		  		
		  		oos.close();
		  		System.out.println("written data of student to the file");
	      }else if(stuBranch=="mech") {
	    	  FileOutputStream fos=new FileOutputStream("D:\\HCL\\Day11\\mech\\studentdb.txt");
		  		ObjectOutputStream oos=new	ObjectOutputStream(fos);
		  		oos.writeObject(new StudentEx(21,"kumar","866582345","MECH"));
		  		
		  		oos.close();
				System.out.println("written data of student to the file");
	    	  
	}

}

}