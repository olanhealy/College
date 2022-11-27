public class TestStock {
    public static void main(String[] args) {
     Stock limStock = new Stock("Limerick Software Solutions", "LKSS");
     System.out.println("STOCK NAME: " + limStock.getStockName());
     System.out.println("STOCK SYMBOL: " + limStock.getSymbol());
     System.out.println("PERCENTAGE CHANGE " + limStock.getChangePercent(79.65, 79.45) + "%");

    }
}
