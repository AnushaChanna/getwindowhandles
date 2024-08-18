package getwindowhandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A168_C51_Naukri_Reg_ClickOnGoogle 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
	WebElement reg=driver.findElement(By.linkText("Register"));
	reg.click();
	
	WebElement g=driver.findElement(By.name("google-register"));
	g.click();
	
	
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> id= s1.iterator();
	
	String pid=id.next();
	String cid=id.next();
	driver.close();
	driver.switchTo().window(cid);
	driver.manage().window().maximize();
	
}
	
	
	
}
