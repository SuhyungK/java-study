package egoing.oop;

class Accounting {
    public double valueOfSupply;

    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }

    // 부가가치세율
    public static double vatRate = 0.1;

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp2 {
    // 공급가액

    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);

        Accounting a2 = new Accounting(20000.0);

        System.out.println("Value of Supply : " + a1.valueOfSupply);
        System.out.println("Value of Supply : " + a2.valueOfSupply);

        System.out.println("VAT : " + a1.getVAT());
    }
}
