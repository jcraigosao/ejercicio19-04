
package Ejercicio_inversiones;

public class DividendStock extends Stock {
    private double dividents;

    public DividendStock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }
    
    @Override
    public double getMarketValue(){
        return (this.totalShares*this.currentPrice)+this.dividents;
    }

    public double getDividents() {
        return dividents;
    }

    public void setDividents(double dividents) {
        this.dividents = dividents;
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
