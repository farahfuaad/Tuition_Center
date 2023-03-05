import java.util.Scanner;

public class Main
{
    // application code
	public static void main(String[] args) {

        Listofcentres Johor = new Listofcentres(); //the state or area that the centers are in
		Centres centrename = new Centres();	//the center
		centrename.setNameofcentre("Pandai Sdn.Bhd");	
		Johor.getCentres().add(0, centrename); //add center to the state or area that it is in

        //teachers
        Teacher Amin = new Teacher();
		Names Tname = new Names();
		Tname.setfstName("Mohd");
		Tname.setlstName("Amin");
		Amin.setName(Tname);

        //students in that center
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

        Student mika = new Student();
		Names name2 = new Names();
		name2.setfstName("Mikail");
		mika.setNames(name2);
		try {
			mika.setMaxlistMark(3);
			mika.addMarks(65);
			mika.addMarks(100);
			mika.addMarks(82);
			}catch (Exception ex) {
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    		
	    	}

        Student mila = new Student();
		Names name3 = new Names();
		name3.setfstName("Milani");
		mila.setNames(name3);
		try {
			mila.setMaxlistMark(3);
			mila.addMarks(98);
			mila.addMarks(92);
			mila.addMarks(74);
			}catch (Exception ex) {
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    		
	    	}

        Amin.AddStudent(mike);
		Amin.AddStudent(mika);
        Amin.AddStudent(mila);
		centrename.AddTeacher(Amin);

		try (//select teacher
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Select Teacher's Name");
			String num = scanner.nextLine();

				if (num.equals("1")){
					System.out.println("Name of center: "+Johor.getCentres().get(0).getNameofcentre());
					System.out.println("Number of tutor: "+centrename.getnumberoftutor());
					centrename.displaytutors();
					centrename.displayaveragemarksforcenter();
					System.out.println("\nTeacher's Name: "+Amin.getname().getfstName()+" "+Amin.getname().getlstName());
					System.out.println("Number of students: "+Amin.getnumberofstudents()+"\n");
					Amin.displaystudents();
					Amin.displayaverageMarkofStudents();  
				}
				else if(num.equals("2")){
					System.out.println("k bye ");
					return;
				}
		}

		 
	}
}
