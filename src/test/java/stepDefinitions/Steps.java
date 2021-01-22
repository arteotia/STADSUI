package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;


import org.junit.Assert;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 



public class Steps {
     
	 String sonyAmount;
	 String parentWindow;
	 private static WebDriver driver;
	 static {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ArpanaTeotia\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.demoblaze.com/index.html");
	 
	 }
	
	
	@Given("the end user is on home page")
	public void the_end_user_is_on_home_page() {
	   System.out.println(driver.getTitle());
	}

	@When("the end user navidates to laptops")
	public void the_end_user_navidates_to_laptops() {
		WebElement laptops = driver.findElement(By.linkText("Laptops"));
		laptops.click();
	}

	@Then("the laptops page is displayed")
	public void the_laptops_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

	@When("the end user clicks on first laptop sony")
	public void the_end_user_clicks_on_first_laptop_sony() {
		WebElement sony = driver.findElement(By.linkText("Sony vaio i5"));
		sony.click();
	}

	@Then("the sony laptop page is displayed")
	public void the_sony_laptop_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

	@When("the end user clicks on Add to Cart button")
	public void the_end_user_clicks_on_Add_to_Cart_button() {
		parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement sonyCart = driver.findElement(By.linkText("Add to cart"));
		sonyCart.click();
		//Thread.sleep(10);
	}

	@When("the end user accepst the pop up")
	public void the_end_user_accepst_the_pop_up() throws AWTException, InterruptedException {
		Thread.sleep(20);
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10);
		//driver.switchTo().window(parentWindow);
	driver.switchTo().alert().dismiss();
	
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
	}

	@Then("the laptop is added to cart")
	public void the_laptop_is_added_to_cart() {
	    System.out.println("the laptop is added to cart");
	}

	@When("the end user clicks on home page icon")
	public void the_end_user_clicks_on_home_page_icon() {
		driver.get("https://www.demoblaze.com/index.html");
	}

	@Then("the home page is displayed again")
	public void the_home_page_is_displayed_again() {
		System.out.println(driver.getTitle());
	}

	@When("the end user navidates to laptops2")
	public void the_end_user_navidates_to_laptops2() {
		WebElement laptops = driver.findElement(By.linkText("Laptops"));
		laptops.click();
	}

	@Then("the laptops page is displayed2")
	public void the_laptops_page_is_displayed2() {
		System.out.println(driver.getTitle());
	}

	@When("the end user clicks on second laptop dell")
	public void the_end_user_clicks_on_second_laptop_dell() {
		WebElement dell = driver.findElement(By.linkText("Dell i7 8gb"));
		dell.click();
	}

	@Then("the dell laptop page is displayed")
	public void the_dell_laptop_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

	@When("the end user clicks on Add to Cart button2")
	public void the_end_user_clicks_on_Add_to_Cart_button2() {
		parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement dellCart = driver.findElement(By.linkText("Add to cart"));
		dellCart.click();
	}

	@When("the end user accepst the pop up2")
	public void the_end_user_accepst_the_pop_up2() throws AWTException, InterruptedException {
		Thread.sleep(20);
		Robot robot1 = new Robot();
		robot1.delay(5000);
		robot1.keyPress(KeyEvent.VK_TAB);
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10);
		driver.switchTo().window(parentWindow);
		//driver.switchTo().activeElement();
		driver.switchTo().alert().dismiss();
	}

	@Then("the laptop is added to cart2")
	public void the_laptop_is_added_to_car2t() {
	    System.out.println("the laptop is added to cart2");
	}

	@When("the end user clicks on Cart link")
	public void the_end_user_clicks_on_Cart_link() {
		driver.switchTo().activeElement();
		driver.get("https://www.demoblaze.com/cart.html");
	}

	@Then("the shopping cart page is displayed")
	public void the_shopping_cart_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

	@When("the end user clicks on Delete link for second laptop dell")
	public void the_end_user_clicks_on_Delete_link_for_second_laptop_dell() throws InterruptedException {
	    Thread.sleep(100);
		WebElement dellDelete = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[4]/a"));
	    dellDelete.click();
	    Thread.sleep(3000);
	}

	@Then("the dell laptop is deleted")
	public void the_dell_laptop_is_deleted() {
		System.out.println("the dell laptop is deleted");
	}

	@When("the end user clicks on Place Order")
	public void the_end_user_clicks_on_Place_Order() {
		WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
		placeOrder.click();
	}

	@When("fill in the form")
	public void fill_in_the_form() {
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Arpana");
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Gurgaon");
		WebElement card = driver.findElement(By.id("card"));
		card.sendKeys("1234123412341234");
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("01");
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("22");
			
		
	}

	@When("clicks on Purchase")
	public void clicks_on_Purchase() {
		WebElement purchase = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
		purchase.click();
		
		WebElement clos = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]"));
		clos.click();	
	}

	@Then("capture amount and purchase id")
	public void capture_amount_and_purchase_id() {
		//System.out.println(driver.switchTo().alert().getText());
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parentWindow.equals(child_window))
		{
		driver.switchTo().window(child_window);
		
		}}
		WebElement purchaseId = driver.findElement(By.xpath("/html/body/div[9]/p"));
		//WebElement amount = driver.findElement(By.xpath("/html/body/div[11]/p/text()[2]"));
		String purchaseIdText = purchaseId.getText();
		System.out.println(purchaseIdText);
		String[] extractAmount = purchaseIdText.split("\n");
		String[] as = extractAmount[1].split(" ");
		sonyAmount = as[1]; 
		
		
	}

	@Then("assert the amount")
	public void assert_the_amount() {
		int i=Integer.parseInt(sonyAmount);
		Assert.assertEquals(700, sonyAmount);
	}

	@When("the end user clicks on OK")
	public void the_end_user_clicks_on_OK() {
	    WebElement ok = driver.findElement(By.xpath("/html/body/div[9]/div[7]/div/button"));
	    ok.click();
	}

	@Then("the home page is displayed again2")
	public void the_home_page_is_displayed_again2() {
		System.out.println(driver.getTitle());
		driver.close();
	}

	
}
