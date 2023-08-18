package in.ineuron.main;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Product;

public class TestApp {

	public static void main(String[] args) {

		try {
			// Create Object Mapper
			ObjectMapper mapper = new ObjectMapper();


			Product product = new Product();
			product = getObjectData(product);
			System.out.println("In java format :: " + product);

			// Converting java object into JsonString
			String jsonData = mapper.writeValueAsString(product);
			System.out.println("In json format :: " + jsonData);
			
			mapper.writeValue(new File("product-list.json"), product);
			System.out.println("Wrote the data to json file");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Product getObjectData(Product product) {

		product.setPid(10);
		product.setPname("fossil");
		product.setPrice(24556.0);
		product.setTypes(new String[] { "chronography", "simpledial", "automatic" });

		return product;
	}
}
