package Maven.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Base extends App{
	
App app;
public void initialise() {
	App app=new App();
	//app.setup();
//}
//@Test
//public void panchang() {
	driver.get("https://www.drikpanchang.com/index.html?geoname-id=5012639&date=06/06/2019");
	driver.findElement(By.partialLinkText("Panchang"));
	Select s=new Select( driver.findElement(By.partialLinkText("Panchang")));
	s.selectByVisibleText("Telugu Panchang");
}
	

	}


