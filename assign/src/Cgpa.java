
public class Cgpa {
	double cgpa;
	double[] gpa = new double [5];
	double sum = 0;
	double finalcgpa = 0;
	
	Cgpa() {
		this.cgpa = 3.5;
		this.gpa[0] = 3.0;
		this.gpa[1] = 3.2;
		this.gpa[2] = 3.8;
		this.gpa[3] = 2.6;
		this.gpa[4] = 3.8;
	
	}
	
	Cgpa (double cgpa, double gpa[]) {
		this.cgpa = 1;
		this.gpa = 2;
		
	}
	
	public void printCpa () {
		System.out.println("Cgpa from method is "+cgpa);
	
	}
	
	public void printCgpa() {
		System.out.println("Sem 1: " + gpa[0]+" Sem 2: " + gpa[1]+" Sem 3: " + gpa[2]+" Sem 4: " +gpa[3]+" Sem 5: " +gpa[4]);
		for(int i=0; i<gpa.length; i++) 
			System.out.println("Sem "+ (i+1) +" " + gpa[i]);
	}
}
