import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

// createed by team in Bangalore
public class Teacher {
    // data
    private Names Name;
	private String IC;
	private Address T_Address;
	private int yearOfexp;
	private Date date_joined;
	private int yearsincenter;
	private String background;
	private ArrayList<Student> students= new ArrayList<Student>();
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public void setName(Names Name) {
		this.Name = Name;
	}
	
	public Names getname() {
		return Name;
	}
	
	public void setIC(String IC) {
		this.IC=IC;
	}
	
	public String getIC() {
		return IC;
	}
	
	public void setAddress(Address T_Address) {
		this.T_Address = T_Address;
	}
	
	public Address getT_Address() {
		return T_Address;
	}
	
	public void setyearOfexp(int yearOfexp) {
		this.yearOfexp=yearOfexp;
	}
	
	public int getyearOfexp() {
		return yearOfexp;
	}
	
	public int getYearsincenter() {
		return yearsincenter;
	}

	public void setYearsincenter(int yearsincenter) {
		this.yearsincenter = yearsincenter;
	}

	public void setdate_joined(Date date_joined) {
		this.date_joined=date_joined;
	}
	
	public Date getdate_joined() {
		return date_joined;
	}
	
	public void setbackground(String background) {
		this.background=background;
	}
	
	public String getbackground() {
		return background;
	}
	
	public Student getStudent(int i) {
		return this.students.get(i);
	}
	
	public void AddStudent(Student student) {
		this.students.add(student);
	}
	
	public void RemoveStudent(Student student) {
		this.students.remove(student);
	}
	
	public int getnumberofstudents() {
		return this.students.size();
	}
	
	public void displayaverageMarkofStudents() { // display the results of students under the tutor
		double average;double sum=0;
		for(int i=0;i<this.students.size();i++) {
			sum+=this.students.get(i).getaverageMark();
		}
		average = sum/this.students.size();
		System.out.println("Average mark of students under tutor "+this.getname().getlName()+": "+df.format(average));
	}
	
	public double getaverageMarkofStudents() { // get results of students under the tutor
		double average;double sum=0;
		for(int i=0;i<this.students.size();i++) {
			sum+=this.students.get(i).getaverageMark();
		}
		average = sum/this.students.size();
		return average;
	}
	
	public void displaystudents() { // display students progress 
		for(int i=0;i<this.students.size();i++) {
			System.out.println("Student: "+this.students.get(i).getName().getfName());
			System.out.println("Average mark: "+df.format(this.students.get(i).getaverageMark()));
			System.out.println("Highest mark: "+this.students.get(i).gethighestMark());
			System.out.println("Lowest mark: "+this.students.get(i).getlowestMark()+"\n");
		}
	}

    
    
}