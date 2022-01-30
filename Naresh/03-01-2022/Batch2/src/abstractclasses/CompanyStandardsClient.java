package abstractclasses;

import oops.interfaceexamples.CompanyStandards;

public class CompanyStandardsClient {

	public static void main(String[] args) {

		CompanyStandards cs = new PerminentEmployee("Naresh", "PerminentEmployee");
		Employee emp = new PerminentEmployee("Naresh", "P");
		PerminentEmployee pe = new PerminentEmployee("Naresh","P");
		cs.annualLeaves();
		cs.benchPolicy();
		cs.work();
		cs.workDaysInWeek();
	}

}
