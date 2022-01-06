package inheritance;

import java.util.Arrays;

public class Parents {
	String[] names;
	int[] ages;
	float[] heights;
	
	public Parents(String[] names,int[] ages,float[] heights) {
		this.names = names;
		this.ages = ages;
		this.heights = heights;
	}

	@Override
	public String toString() {
		return "Parents [names=" + Arrays.toString(names) + ", ages=" + Arrays.toString(ages) + ", heights="
				+ Arrays.toString(heights) + "]";
	}
	
	
	

}
