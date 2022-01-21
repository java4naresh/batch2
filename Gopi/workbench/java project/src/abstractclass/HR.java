package abstractclass;

public class HR {

	public static void main(String[] args) {
	 Jobs j = new Student1();
	 
     j.qualification();
     j.experience();
     j.project();
     j.technicalSkills();
     System.out.println("=========");
     Jobs student2 = new Student2();
     student2.qualification();
     student2.experience();
     student2.project();
     student2.technicalSkills();
     
	}

}
