import java.util.ArrayList;
import java.util.List;

public class ProductService {
	List<Product>products=new ArrayList<>();
    public void addProduct(Product p) {
    	products.add(p);
    }
    public List<Product>getAllProducts(){
    	return products;
    }
	public List<Product> getProductsWithPlace(String place) {
		/* INITIALISING... empty list to store Products with Place */
		List<Product>ans=new ArrayList<>();  
        /*	USING STREAM API AND LAMBDA EXPRESSION  */
		products.stream().filter(p->p.getPlace().equalsIgnoreCase(place)).forEach(p->ans.add(p));  
		return ans;
	}
	public List<Product> getProductsOutOfWarranty() {
		/* INITIALISING... empty list to store products that are OUT OF WARRANTY */
		List<Product>result=new ArrayList<>();  
        /*	USING STREAM API AND LAMBDA EXPRESSION  */
		products.stream().filter(p->p.getWarranty()<2023).forEach(p->result.add(p));  //assumed current year as 2023
		return result;
	}
}
