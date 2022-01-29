package stringClass;

public class AsendingOrderStringName {

	public static void main(String[] args) {
		String[] name = new String[] { "Gopi", "Srinu", "Anil", "Venky", "Naresh", "Balu" };
		// System.out.println(name.length);
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {

				int num = name[i].compareTo(name[j]);
				// System.out.println(num);

				if (num > 0) {
					String tem = name[i];
					name[i] = name[j];
					name[j] = tem;
				}
				if (num == 0) {
					name[i] = name[i];
					name[j] = name[j];
				}
				if (num < 0) {
					 
						name[i] = name[i];
						name[j] = name[j];
					}
				}
			
			// String[] name2 = new String[] {name[i]};
			System.out.println(name[i]);
		}
		}
		
	


	}


