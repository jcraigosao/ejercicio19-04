
package Ejercicio_inversiones;

public class Main {
    public static void main(String[] args) {
        Bank banco= new Bank();
        Cliente cliente1= new Cliente("Carlos", "Ardila", 3245987, 50, "carard@hotmail.com");
        Cliente cliente2= new Cliente("Andres", "Perez", 4598746, 32, "sdfghjqjhdfjn.com");
        
        Asset activo1 = new Cash(100);
        Asset activo2 = new Stock(2, "Google", 100, 80);
        
        cliente1.addAsset(activo1);
        cliente2.addAsset(activo2);
        banco.addClientes(cliente1);
        
        Asset activo3= new MutualFund(2,"Samsung", 20, 50);
        cliente2.addAsset(activo3);
        banco.addClientes(cliente2);
        double totalMercado= banco.getAllMarketValue();
        System.out.println("Total: "+ totalMercado);
    }
    
}
