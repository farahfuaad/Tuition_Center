import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Listofcentres Johor = new Listofcentres(); //the state or area that the centers are in
		Centres centrename = new Centres();	//the center
		centrename.setNameofcentre("Pandai Sdn.Bhd");	
		Johor.getCentres().add(0, centrename); //add center to the state or area that it is in

        //teacher 1
        Teacher Amin = new Teacher();
		Names Tname = new Names();
		Tname.setfstName("Mohd");
		Tname.setlstName("Amin");
		Amin.setName(Tname);

		//teacher 2
		Teacher Tina = new Teacher();
		Names Tname2 = new Names();
		Tname2.setfstName("Tina");
		Tname2.setlstName("Turner");
		Tina.setName(Tname2);

        //students
        Student mike = new Student(); 
		Names name1 = new Names();
		name1.setfstName("Michael");
		mike.setNames(name1);
		try {
			mike.setMaxlistMark(3);
			mike.addMarks(60);
			mike.addMarks(40);
			mike.addMarks(25);
			}catch (Exception ex) {
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    	}

		Student mila = new Student();
		Names name2 = new Names();
		name2.setfstName("Milani");
		mila.setNames(name2);
		try {
			mila.setMaxlistMark(3);
			mila.addMarks(98);
			mila.addMarks(92);
			mila.addMarks(74);
		}catch (Exception ex) {
			System.out.println("Error !!!");
			ex.printStackTrace();
		}

        Student mika = new Student();
		Names name3 = new Names();
		name3.setfstName("Mikail");
		mika.setNames(name3);
		try {
			mika.setMaxlistMark(3);
			mika.addMarks(65);
			mika.addMarks(100);
			mika.addMarks(82);
			}catch (Exception ex) {
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    	}

		Student ally = new Student();
		Names name4 = new Names();
		name4.setfstName("Allya");
		ally.setNames(name4);
		try {
			ally.setMaxlistMark(3);
			ally.addMarks(65);
			ally.addMarks(74);
			ally.addMarks(45);
			}catch (Exception ex) {
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    	}

        Amin.AddStudent(mike);
		Amin.AddStudent(mika);
		Amin.AddStudent(ally);
		Tina.AddStudent(mila);
		centrename.AddTeacher(Amin);
		centrename.AddTeacher(Tina);

		
		Scanner scanner = new Scanner(System.in);
		//choosing which tutor
    	
		System.out.println("\nCentre Name: "+Johor.getCentres().get(0).getNameofcentre());
		System.out.println("Number of Teachers available: "+centrename.getnumberoftutor());
		centrename.displaytutors();
		centrename.displayaveragemarksforcenter();

		System.out.println("\nEnter the Teacher's No. :");

		String num = scanner.nextLine();

			if (num.equals("1")){
				System.out.println("\nTeacher's Name: "+Amin.getname().getfstName()+" "+Amin.getname().getlstName());
				System.out.println("Number of Students: "+Amin.getnumberofstudents()+"\n");
				Amin.displaystudents();
				Amin.displayaverageMarkofStudents();
			}
			else if(num.equals("2")){
				System.out.println("\nTeacher's Name: "+Tina.getname().getfstName()+" "+Tina.getname().getlstName());
				System.out.println("Number of Students: "+Tina.getnumberofstudents()+"\n");
				Tina.displaystudents();
				Tina.displayaverageMarkofStudents();
			}
			else if(num.equals("3")){
				System.out.println("-- Error 404 --");
				return;
			}


           
	}
}
