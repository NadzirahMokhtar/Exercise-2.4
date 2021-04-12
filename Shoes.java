
public class Shoes {

	String brand, collection, color, design;
	double weight, price, totalweight, totalprice;
	int noofshoes;
	
	//Create Setter Method
	
	void setBrand(String brand) {
		this.brand = brand;
	} 
	void setCollection(String collection) {
		this.collection = collection;
	} 
	void setColor(String color) {
		this.color = color;
	}
	void setDesign(String design) {
		this.design = design;		
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setNoOfShoes(int noofshoes) {
		this.noofshoes = noofshoes;		
	}
	String getBrand() {
		return this.brand;	
	}
	String getCollection() {
		return this.collection;
	}
	String getColor() {
		return this.color;			
	}
	String getDesign() {
		return this.design;	
	}
	double getWeight() {
		return this.weight;		
	}
	double getPrice() {
		return this.price;	
	}
	int getNoOfShoes() {
		return this.noofshoes;	
	}
	double getTotalWeight() {
		this.totalweight = this.noofshoes * this.weight;
		return this.totalweight;		
	}	
	double getTotalPrice() {
		this.totalprice = this.totalweight * this.price;
		return this.totalprice;
	}
}
