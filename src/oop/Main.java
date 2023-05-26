package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("*********WELCOME TO APP**********");
		
		System.out.println("enter your name:");
		String name=scan.nextLine();
		System.out.println("enter your surname:");
		String surname=scan.nextLine();
		System.out.println("enter your no:");
		int no=scan.nextInt();
		System.out.println("enter your wage:");
		int wage=scan.nextInt();
		System.out.println("enter your experience:");
		int experience=scan.nextInt();
		scan.nextLine();
		System.out.println("enter your gender:");
		String gender=scan.nextLine();
		
		Worker worker=new Worker(name, surname, no, wage, experience, gender);
		while(true) {
		int menu;
		System.out.println("make a choice:");
		System.out.println("1.show workers info\n2.make raise\n3.enter extra job");
		menu=scan.nextInt();
		switch(menu) {
		case 1:
			System.out.println("**worker info**");
			worker.workerPrint();
			break;
		case 2:
			System.out.println("enter raise amount:");
			int raiseAmount=scan.nextInt();
			worker.workersRaise(raiseAmount);
			break;
		case 3:
			System.out.println("enter name:");
			String person=scan.nextLine();
			
		
			System.out.println("enter extra job:");
			String job1=scan.nextLine();
			worker.extraJob(job1, person);
			break;
			default:
				System.out.println("invalid transaction");
			System.exit(0);
		}		
			
		}
		
		
	
		

	}

}
