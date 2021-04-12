
public class Main {

	public static void main(String[] args) {
		
		Shoes Sarah = new Shoes();
		Sarah.setBrand("=======Adidas=======");
		Sarah.setCollection("Adidas Ultra Boost");
		Sarah.setColor("Black");
		Sarah.setDesign("Casual Sport");
		
		Sarah.setWeight(8.7);
		Sarah.setPrice(399);
		Sarah.setNoOfShoes(3);
		
		System.out.println("Brand: " + Sarah.getBrand());
		System.out.println("Collection: " + Sarah.getCollection());
		System.out.println("Color: " + Sarah.getColor());
		System.out.println("Design: " + Sarah.getDesign());
		
		System.out.printf("Weight: %.2f g %n", Sarah.getWeight());
		System.out.printf("Price: RM %.2f %n", Sarah.getPrice());
		System.out.println("No of Shoes: " + Sarah.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Sarah.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Sarah.getTotalPrice());
		System.out.println();
		
		Shoes Ahmad = new Shoes();
		Ahmad.setBrand("=======Bata=======");
		Ahmad.setCollection("Performance Shoes");
		Ahmad.setColor("Green");
		Ahmad.setDesign("Running Sport");
		Ahmad.setWeight(6.7);
		Ahmad.setPrice(199);
		Ahmad.setNoOfShoes(1);
		
		System.out.println("Brand: " + Ahmad.getBrand());
		System.out.println("Collection: " + Ahmad.getCollection());
		System.out.println("Color: " + Ahmad.getColor());
		System.out.println("Design: " + Ahmad.getDesign());
		System.out.printf("Weight: %.2f g %n", Ahmad.getWeight());
		System.out.printf("Price: RM %.2f %n", Ahmad.getPrice());
		System.out.println("No of Shoes: " + Ahmad.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Ahmad.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Ahmad.getTotalPrice());
		System.out.println();
		
		Shoes Abby = new Shoes();
		Abby.setBrand("=======Vincci=======");
		Abby.setCollection("Stylish Wear");
		Abby.setColor("Nude");
		Abby.setDesign("Heels");
		Abby.setWeight(5.0);
		Abby.setPrice(49);
		Abby.setNoOfShoes(2);
		
		System.out.println("Brand: " + Abby.getBrand());
		System.out.println("Collection: " + Abby.getCollection());
		System.out.println("Color: " + Abby.getColor());
		System.out.println("Design: " + Abby.getDesign());
		System.out.printf("Weight: %.2f g %n", Abby.getWeight());
		System.out.printf("Price: RM %.2f %n", Abby.getPrice());
		System.out.println("No of Shoes: " + Abby.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Abby.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Abby.getTotalPrice());
		System.out.println();
		

	}

}
