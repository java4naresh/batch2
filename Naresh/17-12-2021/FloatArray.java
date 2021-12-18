class FloatArray 
{
	public static void main(String[] args) 
	{
		/*float[] amounts = new float[4];
		amounts[0] = 100.00f;
		amounts[1] = 100.00f;
		amounts[2] = 100.00f;
		amounts[3] = 100.00f;*/
		float[] amounts = {100.05f, 100.00f, 200.00f, 500.00f};
		for(int i=0; i < amounts.length; i++) {
		System.out.print(amounts[i] + ", ");
		}
	}
}
