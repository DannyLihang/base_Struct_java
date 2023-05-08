public class test4 {
    /*
    4.修改程序清单10-2（参见教材P311）中的Loan类，
    如果贷款总额、利率、年数小于或等于零，则抛出IllegalArgumentException异常。
     */

}
class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
        judge();
    }
    public void judge() throws IllegalArgumentException{
        if(this.loanAmount<=0) {
            throw new IllegalArgumentException("贷款总额小于等于0!");
        }
        if(this.annualInterestRate<=0) {
            throw new IllegalArgumentException("利率小于等于0!");
        }
        if(this.numberOfYears<=0) {
            throw new IllegalArgumentException("贷款年数小于等于0!");
        }

    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        judge();
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
        judge();
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
        judge();
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1+monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}

