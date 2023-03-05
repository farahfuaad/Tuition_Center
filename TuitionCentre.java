import java.text.DecimalFormat;
import java.util.ArrayList;

public class TuitionCentre {
    private String Nameofcentre;
	 private Address centreAddress;
	 private Director Head;
	 private ArrayList<Teacher> tutors= new ArrayList<Teacher>();
	 private static final DecimalFormat df = new DecimalFormat("0.00");

	 public void setNameofcentre(String Nameofcentre) {
		 this.Nameofcentre = Nameofcentre;
	 }
	 
	 public String getNameofcentre() {
		 return Nameofcentre;
	 }
	 
	 public void setAddress(Address centreAddress) {
		 this.centreAddress = centreAddress;
	 }
	 
	 public Address getAddress() {
		 return centreAddress;
	 }
	 
	 public void setDirector(Director Head) {
		 this.Head=Head;
	 }
	 
	 public Director getDirector() {
		 return Head;
	 }

	public ArrayList<Teacher> getTeacher() {
		return tutors;
	}
	
	public void AddTeacher(Teacher tutor) {
		this.tutors.add(tutor);
	}
	
	public void RemoveTeacher(Teacher tutor) {
		this.tutors.remove(tutor);
	} 
	
	public int getnumberoftutor() {
		return this.tutors.size();
	}
	
	public void displaytutors() {
		for(int i=0;i<this.tutors.size();i++) {
			System.out.println("Tutor-"+(i+1)+": "+this.tutors.get(i).getname().getlName());
		}
	}
	
	public void displayaveragemarksforcenter() {
		double average=0;
		for(int i=0;i<this.tutors.size();i++) {
			average+=this.tutors.get(i).getaverageMarkofStudents();
		}
		
		System.out.println("Average marks of students in this center: "+df.format(average));
	}
	 
}
