package com.example.test;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		ArrayList<String> list = new  ArrayList<>();
		list.add("adnan");
		list.add("kawsar");
		list.add("masao");
		list.add("josa");
		
		for (int i = 0; i< list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
