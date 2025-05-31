package uap.interfaces;

// Interface untuk menghitung total harga shipping
public interface ShippingCostCalculator {
    // Harga per kg
    int PRICE_PER_KG = 2000;
    // 
    double calculateCost();
}