public class t2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","OracleCorporation",34.5,34.45);
        System.out.println(stock.getChangePercent());
    }
}
class Stock{
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        if(this.currentPrice>=this.previousClosingPrice)
        return (this.currentPrice - this.previousClosingPrice)/this.currentPrice;
        else return (this.previousClosingPrice-this.currentPrice)/this.currentPrice;
    }
}
