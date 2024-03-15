package ch06.practice.exam18;

public class ShopService {
	// field
	private static ShopService shopService = new ShopService();
	
	
	// constructor
	private ShopService() {
		
	}
	
	// method
	public static ShopService getInstance() {
		return shopService;
	}

}
