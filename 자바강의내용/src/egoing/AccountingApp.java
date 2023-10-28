class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply : " +valueOfSupply);
		System.out.println("VAT: :  " + getVAT());
		System.out.println("total: :  " + getTotal());
		System.out.println("Expense: :  " + getExpense());
		System.out.println("Income: :  " + getIncome());
		System.out.println("Dividend 1 :  " + getDiviend1());
		System.out.println("Dividend 2 :  " + getDiviend2());
		System.out.println("Dividend 3 :  " + getDiviend3());
		
	}
	
	public double getDiviend1() {
		return getIncome()*0.5;
	}
	public double getDiviend2() {
		return getIncome()*0.3;
	}
	public double getDiviend3() {
		return getIncome()*0.2;
	}
	public double getIncome() {
		return valueOfSupply - getExpense(); 
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public double getVAT() {
		return valueOfSupply*0.1;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingApp {

	public static void main(String[] args) {
		// 나의 앱 만들기
		// 인스턴스 :하나의 클래스를 복제해서 서로 다른 데이터 값과 서로 같은 메서드를 가진 복제본 만드는 

//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();

		// instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.5;
		a2.expenseRate = 0.2;
		
		a2.print();
	}

}
