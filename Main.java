public class Main
{
    // application code
	public static void main(String[] args) {

        Listofcentres Johor = new Listofcentres(); //the state or area that the centers are in
		Centres centrename = new Centres();	//the center
		centrename.setNameofcentre("Pandai Sdn.Bhd");	
		Johor.getCentres().add(0, centrename); //add center to the state or area that it is in

        //teacher
        Teacher Amin = new Teacher();
		Names Tname = new Names();
		Tname.setfName("Mohd");
		Tname.setlName("Amin");
		Amin.setName(Tname);

        Student mike = new Student(); //student in a center
		Names name1 = new Names();
		name1.setfName("Michael");
		mike.setName(name1);
		try {
			mike.setMaxlistMark(3);
			mike.addMarks(30);
			mike.addMarks(30);
			mike.addMarks(40);
			}catch (Exception ex) {//catch block.. action be taken in case of Exception
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    		
	    	}

        Student mika = new Student(); //student in a center
		Names name2 = new Names();
		name2.setfName("Mikail");
		mika.setName(name2);
		try {
			mika.setMaxlistMark(3);
			mika.addMarks(30);
			mika.addMarks(30);
			mika.addMarks(40);
			}catch (Exception ex) {//catch block.. action be taken in case of Exception
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    		
	    	}

        Student mila = new Student(); //student in a center
		Names name3 = new Names();
		name3.setfName("Milani");
		mila.setName(name3);
		try {
			mila.setMaxlistMark(3);
			mila.addMarks(30);
			mila.addMarks(30);
			mila.addMarks(40);
			}catch (Exception ex) {//catch block.. action be taken in case of Exception
	    		System.out.println("Error !!!");
	    		ex.printStackTrace();
	    		
	    	}

        Amin.AddStudent(mike);
		Amin.AddStudent(mika);
        Amin.AddStudent(mila);
		centrename.AddTeacher(Amin);

        System.out.println("Name of center: "+Johor.getCentres().get(0).getNameofcentre()); // display name of tuition center
		System.out.println("Number of tutor: "+centrename.getnumberoftutor());
		centrename.displaytutors();
		centrename.displayaveragemarksforcenter();
		System.out.println("\nTutor: "+Amin.getname().getfName()+" "+Amin.getname().getlName());
		System.out.println("Number of students: "+Amin.getnumberofstudents()+"\n");
		Amin.displaystudents();
		Amin.displayaverageMarkofStudents();   
	}
}
