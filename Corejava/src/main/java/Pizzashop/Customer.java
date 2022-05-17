package Pizzashop;

public class Customer {

	public  void orderpizza(String pizzatype, boolean tomatoes, boolean corn, boolean mashroom) {
		if(pizzatype.equalsIgnoreCase("Standardbaseprice")) {
			Pizza pizzaorder = new Standardbaseprice();
			System.out.println("Pizzatype : "+ pizzatype +"  price " + pizzaorder.pizzaprice(tomatoes, corn, mashroom));;
		}else if(pizzatype.equalsIgnoreCase("Softbaseprice")) {
			Pizza pizzaorder = new Softbaseprice();
			System.out.println("Pizzatype : "+ pizzatype +"  price " + pizzaorder.pizzaprice(tomatoes, corn, mashroom));;
		}
		else
			System.out.println("Invalid pizza type");

	}
		public static void main(String[] args) {
			Customer customer = new Customer();
			customer.orderpizza("Standardbaseprice", false, true, false);
			customer.orderpizza("Softbaseprice", false, true, true);
		}
}
