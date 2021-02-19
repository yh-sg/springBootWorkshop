package laboneB.ThymeleafWorkshop.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import laboneB.ThymeleafWorkshop.Model.Product;

@Controller
public class BasicController {
	
	@GetMapping("/basic")
	public String getBasic() {
		return "basic";
	}
	
	@GetMapping("/products")
		public String getProducts(Model model) {
			ArrayList<Product> products = new ArrayList<>();
			products.add(new Product("Black Pen", 1.11));
			products.add(new Product("Red Pen", 1.22));
			model.addAttribute("products",products);
			System.out.println(products.toString());
			return "products";
		}
	
   
}
