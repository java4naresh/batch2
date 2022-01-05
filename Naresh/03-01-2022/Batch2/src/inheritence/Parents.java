package inheritence;

public class Parents {
	
	public String[] parentsName;
	
	public int[] parentAges;
	
	public float[] parentHeights;
	
	/*public Parents() {
		System.out.println("Parents Cons");
	}*/
	
	public Parents(String[] parentsName, int[] parentAges, float[] parentHeights) {
		this.parentsName = parentsName;
		this.parentAges = parentAges;
		this.parentHeights = parentHeights;
	}
	
	public String[] getParentsDesignation() {
		return new String[] {"Farmer", "House Wife"};
	}
	
}
