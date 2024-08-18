package getwindowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A167_C51_Amazon_MovingControl_Parent_Child 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes" + Keys.ENTER);
	
	WebElement selectshoe= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[4]"));
	selectshoe.click();
	
	System.out.println(driver.getWindowHandles());
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> id = ids.iterator();
	String parent_Id=id.next();
	String Child_Id=id.next();
	
	System.out.println("parent and child " +ids);
	Thread.sleep(2000);
	driver.close();
	
	driver.switchTo().window(Child_Id);
	
	System.out.println("child converted to parent " +driver.getWindowHandle());
	
	
	
}
}
