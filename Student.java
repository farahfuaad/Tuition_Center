// created by team in KL
public class Student {
    // data/attributes
    private Names Name;
	private String IC;
	private int Year;
	private String schoolName;
	private Address studAddress;
	private double Marks[];
	private int currsz=0;
	
	public void setNames(Names Name) {
		this.Name = Name;
	}
	
	public Names getName() {
		return Name;
	}

	public void setIC(String IC) {
		this.IC = IC;
	}
	
	public String getIC() {
		return IC;
	}
	
	public int getYear() {
		return Year;
	}

	public void setYear(int Year) {
		this.Year = Year;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Address getstudAddress() {
		return studAddress;
	}

	public void setstudAddress(Address Address) {
		studAddress = Address;
	}

	public void setMaxlistMark(int i) {
		Marks = new double[i];
	}

	public void addMarks(double Marks) throws Exception {
		if(currsz<this.Marks.length) {
			if(Marks>100||Marks<0) { 
				throw new Exception("Error in mark detected");
				// show error when keyed in outside mark range
			}
			else {
				
				this.Marks[currsz++]=Marks;
			}
			
		}
		else {
			System.out.println("Reached maximum amount of marks.");
			return;
		}
	}
	
	public void editMark(double Marks,int index) {
		this.Marks[index]=Marks;
	}
	
	public void displaymarks() {
		for(int i=0;i<currsz;i++) {
			System.out.println("Mark-"+(i+1)+": "+Marks[i]);
		}
	}
	
	public double gethighestMark() {
		double highest=this.Marks[0];int top=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(highest<this.Marks[i]) {
				top=i;
				highest=this.Marks[i];
			}
		}
		return this.Marks[top];
	}
	
	public int gethighestMarknumber() {	//get the highest Mark index number
		double highest=this.Marks[0];int top=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(highest<this.Marks[i]) {
				top=i;
				highest=this.Marks[i];
			}
		}
		return top+1;
	}
	
	public double getlowestMark() {
		double lowest=this.Marks[0];int bottom=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(lowest>this.Marks[i]) {
				bottom=i;
				lowest=this.Marks[i];
			}
		}
		return this.Marks[bottom];
	}
	
	public int getlowestMarknumber() {	//get the lowest Mark index number
		double lowest=this.Marks[0];int bottom=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(lowest>this.Marks[i]) {
				bottom=i;
				lowest=this.Marks[i];
			}
		}
		return bottom+1;
	}
	
	public double getaverageMark() {
		double average;double sum=0;
		for(int i=0;i<this.Marks.length;i++) {
			sum+=this.Marks[i];
		}
		average = sum/this.Marks.length;
		return average;
	}

}