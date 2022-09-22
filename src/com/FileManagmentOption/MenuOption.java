package com.FileManagmentOption;

import java.io.File;
import java.util.Scanner;



public class MenuOption {
	public void MenuOption() {
		System.out.println("\n\n\n");
		System.out.println("File Managment Menu Options:");
		System.out.printf("\n1. Retrive Files in the Folder  \n2. File Menu Options  \n3. Exit \n");
		
		  int input=-1;
			do
			{
	Scanner sc=new Scanner(System.in);
	System.out.println("\n ****Enter your option from the above Main  Menu:****");
		input = sc.nextInt();
	switch(input)
	{
	case 1:
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter The Your Directory Name:");
	String Dir1=S1.nextLine();
	Dir1.toLowerCase();
	ListFiles(Dir1);
	break;
	
	case 2:
	FileOption fo=new FileOption();
	fo.FileOption();
	break;
	
	default:	
	}

	}while(input!=0);
	}

	static void ListFiles(String Dir1)
	{
	File dir = new File(Dir1);
	        File[] files = dir.listFiles();

	        if (files != null && files.length > 0) {
	            for (File file : files) {
	                if (file.isDirectory()) {
	                    System.out.println(file.getAbsolutePath());
	                } else {
	                    System.out.println(file.getName());
	                }
	            }
	        }
	        else
	        {
	        	System.out.println("The Directory is not found");
	        }
	}
}

