public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Copy constructor
    public Stock(Stock other) {
        this.symbol = other.symbol;
        this.name = other.name;
        this.previousClosingPrice = other.previousClosingPrice;
        this.currentPrice = other.currentPrice;
    }

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Calculate price change %
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // toString
    @Override
    public String toString() {
        return "Stock: { Symbol: " + symbol +
                "\nName: " + name +
                "\nClosing Price: " + previousClosingPrice +
                "\nCurrent Price: " + currentPrice + " }";
    }
}