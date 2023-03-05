public class Main
{
    // application code
	public static void main(String[] args) {
        Student mike = new Student();
        mike.setName("Michael");
        Student adila = new Student();
        adila.setName("Adlin");
        Student imran = new Student();
        imran.setName("Syed Imran");

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike);
        sb2023.add(adila, 0);       
        
        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Adlin");
        
        

        Teacher cikguminah = new Teacher();
        mike.setName("Michael");
        
        for (int i=0; i<5; i++) 
            mike.setMark(100, i)
        
        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);
        
        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());        
	}
}
