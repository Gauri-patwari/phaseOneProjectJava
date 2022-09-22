package com.FileManagmentOption;

public class MainMenu {
	public static void main(String[] args) {
		String str="Gauri Patwari";
		System.out.println("  -------------------------------------Welcom to FileManagment Application-------------------------------------");
		System.out.println("**********************************");
		System.out.println("Developer Name:"+str);
		System.out.println("**********************************");
		MenuOption mo = new MenuOption();
		mo.MenuOption();
	}
}
