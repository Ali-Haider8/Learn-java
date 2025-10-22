package com.ali_haider;

import java.util.Scanner;

public class If_else_lesson {
    
	static Scanner reader_name = new Scanner(System.in);
	static Scanner reader_age = new Scanner(System.in);
	static Scanner reader_job = new Scanner(System.in);
	
	public static void main(String[] args) {

		// the definition of variables
		String choose;
		String name;
		Integer age;
		String job;
		
		System.out.println("start now ?");
		choose=reader_name.nextLine();
		if (choose.equals("yes")){

			System.out.println("enter your name :-");
			name=reader_name.nextLine();
			
			if (name.equals("ali")){
				System.out.println("enter your age :-");
				age=reader_age.nextInt();
				if(age==17){
					System.out.println("enter your job :-");
					job=reader_job.nextLine();
					if(job.equals("java programmer")){
						System.out.println("Are you spy !");
					}else{
						System.out.println("Wrong");
					}
				}else{
					System.out.println("Wrong");
				}
			}else{
				System.out.println("Wrong");
			}

		}else{
			System.out.println("OK");
		}	
	}
}
