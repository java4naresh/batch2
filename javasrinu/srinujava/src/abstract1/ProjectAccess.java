package abstract1;

public class ProjectAccess extends Project{

	
	public void projectManager() {
		System.out.println("only for project manager access");
	}

	
	public void projectClient() {
		System.out.println("only for project client access");
	}

	
	public void teamLead() {
	System.out.println("only for team lead access");
	}

}
