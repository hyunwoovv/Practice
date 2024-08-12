package quiz;

public class AccountExam {

	public static void main(String[] args) {
		Account a1 = new Account("국민은행");
		a1.view();
		a1.income(10000);
		a1.view();
		a1.outcome(4000);
		a1.view();
		System.out.println("-----------------");
		Account a2 = new Account("신협");
		a2.income(20000);
		a2.outcome(5000);
		a2.view();
	}

}
