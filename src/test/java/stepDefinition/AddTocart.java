package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTocart {
	@Given("open any browser")
	public void open_any_browser() {
		
		System.out.println("OPEN ANY BROWSER");
	}

	@When("user enters the url in browser")
	public void user_enters_the_url_in_browser() {
	 System.out.println("OPNE THE URL ");
	}

	@When("user searches for a product")
	public void user_searches_for_a_product() {
     System.out.println("SEARCH FOR THE PRODUCT");
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		System.out.println("CLICK ON THE PRODUCT");
	}

	@Then("user can see the product in the cart")
	public void user_can_see_the_product_in_the_cart() {
	 System.out.println("PRODUCT ADDED TO CART SUCESSFULLY");
	}


}
