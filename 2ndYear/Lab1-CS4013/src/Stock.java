public class Stock {


    private String symbol, stockName;
    private double previousClosingPrice, currentPrice;

    public Stock(String newStockName, String newSymbol ) {
        stockName = newStockName;
        symbol = newSymbol;
    }
    public String getStockName() {
        return stockName;
    }
    public String getSymbol() {
        return symbol;
    }

    public double getChangePercent(double currentPrices, double previousClosingPrices) {
        currentPrice = currentPrices;
        previousClosingPrice = previousClosingPrices;
        double change =  (((currentPrice - previousClosingPrice)/(previousClosingPrice)) * 100);
        return change;
    }


}
