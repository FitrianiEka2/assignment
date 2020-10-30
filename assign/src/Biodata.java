
public class Biodata {

	String name, skills, experiences, talents, results;
	int age;
	
	Biodata() {
		this.name = "Fitriani Eka";
        this.age = 20;
        this.skills = "java, C+";
        this.experiences = "Assistant Scriptwriter";
        this.talents = "Persuasive Communication";
        this.results = "A";
	}

	Biodata (String n, String s, String e, String t, String r, int a) {
		this.name = n;
		this.age  = a;
		this.skills = s;
		this.experiences = e;
		this.talents = t;
		this.results = r;
	}
	
	public void printBiodata () {
		Biodata obj1 = new Biodata();
		Biodata obj2 = new Biodata("Fitriani Eka", "java, C+", "Assistant Scriptwriter", "Persuasive Communication", "A", 20);
		
		System.out.println("Name: "+obj1.name+"\n" + "Age: "+obj1.age+"\n" + "Work Skills: "+obj1.skills+"\n" + "Work Experiences: "+obj1.experiences+"\n" + "Talents: "+obj1.talents+"\n" + "Gred STIA1113: "+obj1.results+"\n");
		System.out.println("Name: "+obj2.name+"\n" + "Age: "+obj2.age+"\n" + "Work Skills: "+obj2.skills+"\n" + "Work Experiences: "+obj1.experiences+"\n" + "Talents: "+obj2.talents+"\n" + "Gred STIA1113: "+obj1.results+"\n");

	}

}
