package lab_2;

public class Stock {
	//Товарно-материальный запас
	Supplies name;
	double costPrice;
	double sellingPrice;
	int amount;
	
	public Stock(Supplies pName, double pCostPrice, double pSellingPrice, int pAmount) {
		name = pName;
		costPrice = pCostPrice;
		sellingPrice = pSellingPrice;
		amount = pAmount;
	}
}
