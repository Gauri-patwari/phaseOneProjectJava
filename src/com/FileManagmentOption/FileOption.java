package com.FileManagmentOption;

import java.io.File;
import java.util.Scanner;
public class FileOption {
	public void FileOption() {
		int input1=-1;
		do
		{

			System.out.println("\n!!!!!!File Options:!!!!!\n");
			System.out.printf("\n1. Add File \n2. Search File \n3. Delete File \n4. Go Back to Main Menu  \n0. Exit \n");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\n Enter your option from the above Menu:");
			input1 = sc1.nextInt();
			switch (input1) 
			{

				case 1:
					CreateFile();
					break;
				case 2:
					SearchFile();
					break;

				case 3:
					DeleteFile();
					break;
				case 4:
					MenuOption mo = new MenuOption();
					mo.MenuOption();
					break;


				default :
	}
	}while(input1!=0);
	}
	
	static void CreateFile()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Your File Name:");
		String filename=s.nextLine().toLowerCase();
		File fd=new File("./main/",filename);

		if(fd!=null)
		{				
			try
			{
			boolean res1=fd.createNewFile();
			if(res1)
			{
			System.out.println("The Created File Name is  " +fd.getName());
			System.out.println("@@File created  Succesfully@@");
			}else
			{
			System.out.println("File already created");
			}
			}
			catch(Exception e)
			{
			System.out.println("The exception" +e.getClass());
			System.out.println("The exception occured" +e.getMessage());
			}
		}
	}



	static void SearchFile()
	{
		System.out.println("Enter the name of the File to Search: ");
		Scanner sc5=new Scanner(System.in);
		String name1 = sc5.nextLine().toLowerCase();
		File filename2 = new File("./main/",name1);
		if(filename2.isFile())
		{
			System.out.println("#####Searched File Name is  " +filename2.getName() +"#####");
		}
		else
		{
			System.out.println("$$$$file not found$$$$");
		}
	}

	static void DeleteFile()
	{
	Scanner sc4=new Scanner(System.in);
	System.out.println("Enter File name to Delete:");
	String n1 = sc4.nextLine().toLowerCase();
	File filename1 = new File("./main/",n1);
		if (filename1.delete())
		{
			System.out.println("deleted file name "+filename1.getAbsolutePath());
			System.out.println("~~~~~File deleted successfully~~~~~");
		} 
		else
		{
			System.out.println("**********Failed to delete the File*****************");
		}
	}

}
