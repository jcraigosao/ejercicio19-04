
package Ejercicio_inversiones;

import java.util.HashMap;

public class Bank {
    private HashMap <String, Cliente> clientes;
    
    public Bank(){
        this.clientes=new HashMap<>();
    }
    
    public void addClientes(Cliente cliente){
        this.clientes.put(cliente.getEmail(), cliente);
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public double getAllMarketValue(){
        double total=0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAsset()) {
                total+=asset.getMarketValue();
            }
        }
        return total;
    }
    
    public double getAllProfit(){
        double total=0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAsset()) {
                total+=asset.getProfit();
            }
        }
        return total;
    }
    
    public HashMap getAllByTypeAsset(){
        HashMap<String, Double> total= new HashMap<>();
        for(Cliente cliente: this.clientes.values()){
            for(Asset asset: cliente.getAsset()){
                if(asset instanceof Cash){
                    if(!total.containsKey("cash")){
                        total.put("cash", asset.getMarketValue());
                    }else{
                        Double valorActual= total.get("cash");
                        Double nuevoValor= valorActual + asset.getMarketValue();
                        total.put("cash", nuevoValor);
                    }
                }else if(asset instanceof MutualFund){
                    if(!total.containsKey("MutualFund")){
                        total.put("MutualFund", asset.getMarketValue());
                    }else{
                        Double valorActual= total.get("MutualFund");
                        Double nuevoValor= valorActual + asset.getMarketValue();
                        total.put("MutualFund", nuevoValor);
                    }
                }else if(asset instanceof DividendStock){
                    if(!total.containsKey("DividendStock")){
                        total.put("DividendStock", asset.getMarketValue());
                    }else{
                        Double valorActual= total.get("DividendStock");
                        Double nuevoValor= valorActual + asset.getMarketValue();
                        total.put("DividendStock", nuevoValor);
                    }
                }else if(asset instanceof Stock){
                    if(!total.containsKey("Stock")){
                        total.put("Stock", asset.getMarketValue());
                    }else{
                        Double valorActual= total.get("Stock");
                        Double nuevoValor= valorActual + asset.getMarketValue();
                        total.put("Stock", nuevoValor);
                    }
                }
            }
        }
        return total;
    }
    public Cliente getMaxProfit(){
        Cliente MasBeneficiado=null;
        double total=0;
        for (Cliente cliente : this.clientes.values()) {
            for(Asset asset: cliente.getAsset()){
                total+=asset.getProfit();
            }
        }
    
    return MasBeneficiado;
    }
}
