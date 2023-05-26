package oop;

public class Worker {
	
	String name;
	String surname;
	int no;
	int wage;
	int experience;
	String gender;
	
		
	

	
	public  Worker(String name, String surname, int no, int wage, int experience, String gender) {
		
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.wage = wage;
		this.experience = experience;
		this.gender = gender;
	}


	public void workerPrint() {
		System.out.println("name:"+this.name);
		System.out.println("surname:"+this.surname);
		System.out.println("no:"+this.no);
		System.out.println("wage"+this.wage);
		System.out.println("experience:"+this.experience);
		System.out.println("gender:"+this.gender);
		
	}
	
	public void workersRaise(int raise) {
		System.out.println("your raise amount:"+raise);
		System.out.println("your new wage:"+(wage+raise));
		
	}
	
    public void extraJob(String job,String person) {
    	System.out.println(person+" 's extra job "+job+".");
    }
    
}
