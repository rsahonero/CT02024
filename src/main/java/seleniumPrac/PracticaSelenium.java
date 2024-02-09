package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		//Obtener objetos/WebElements de la pagina web
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Login
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		loginBtn.click();
		
		//Metodos del explorador
		//Obtener el titulo de la pagina
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		
		//Obtener la URL 
		String url = driver.getCurrentUrl();
		System.out.println("La URL de la pagina es: " + url);
		
		Thread.sleep(500);
		//Metodo navegacion
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		//Verifica elemento desplegado en la pagina
		boolean product = driver .findElement(By.className("inventory_item_name")).isDisplayed();
		if(product) {
			System.out.println("El articulo es desplegado");
		}
		
		//Obtener el texto de un webelement
		
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
				
		boolean textCorrect = prodText.contains("Sauce Labs Backpack"); //Contains es un metrod de JAVA que evalua 2 strings
		
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
			
		}else {
			System.out.println("ERROR: El nombre del producto no es correcto");
		}
		Thread.sleep(2000);
		
		//Dropdown
		//Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		//dropdown.selectByValue("lohi");
		
	///************************** PRACTICA AGREGAR COMPRA CARRITO *************************
		//Add to cart
		WebElement addCart =  driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addCart.click();
		Thread.sleep(2000);
		
		//Seleccionar carrito
		WebElement carrito = driver.findElement(By.id("shopping_cart_container"));
		carrito.click();
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		// Llenar el formulario
		WebElement firtName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement zipPostal = driver.findElement(By.id("postal-code"));
		WebElement continueBtn = driver.findElement(By.id("continue"));
		
		firtName.sendKeys("Rosario");
		lastName.sendKeys("Colby");
		zipPostal.sendKeys("5025");
		continueBtn.click();
		
		Thread.sleep(2000);
		
		//Click Finish y Validar el texto
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		
		String orderText = driver.findElement(By.className("complete-header")).getText();
		boolean orderTextCorrect = orderText.contains("Thank you for your order!");
		
		if(orderTextCorrect){
			
			System.out.println("La orden se realizo correctamente");
		}else {
			System.out.println("ERROR: hubo un error al realizar la orden");
		}
		
		Thread.sleep(2000);
		
		
		
		
		driver.close(); //cierra la ventana actual con la que estamos interactuando
		driver.quit(); // cierra todas las ventanas o pestanas que se abrieron 
		
		
	}

}
