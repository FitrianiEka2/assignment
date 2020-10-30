
public class resume1 {

	public static void main(String[] args) {
		
		Biodata  b = new Biodata();
		Cgpa c = new Cgpa();
		System.out.println("My name is " + b.name);
		System.out.println("Cgpa from method is "+c.cgpa);
		b.printBiodata();
		c.printCgpa();
		
	}
}
