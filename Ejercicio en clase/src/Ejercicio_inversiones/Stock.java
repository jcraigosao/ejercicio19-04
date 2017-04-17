
package Ejercicio_inversiones;

public class Stock extends ShareAsset {

    protected int totalShares;

    public Stock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }
    @Override
    public double getMarketValue() {
    return this.totalShares*this.currentPrice;     
    }

    @Override
    public double getProfit() {
        return (this.totalShares*this.currentPrice)-this.totalCost;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
   
}
