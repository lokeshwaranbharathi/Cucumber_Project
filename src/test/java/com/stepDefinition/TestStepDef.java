package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestStepDef {
 public static WebDriver driver;
@Given("user launch facebook application")
public void user_launch_facebook_application() {
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://www.facebook.com");
}

//@When("user enter below data for login")
//public void user_enter_below_data_for_login(DataTable dataTable) {
//   List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
//	String username = asMaps.get(0).get("Username");
//	String password = asMaps.get(0).get("Password");
//	driver.findElement(By.id("email")).sendKeys(username);
//	driver.findElement(By.name("pass")).sendKeys(password);
//}
//
//@When("user click login button")
//public void user_click_login_button() {
//   driver.findElement(By.name("login")).click();
//}
//
//@Then("user should land into facebook homepage")
//public void user_should_land_into_facebook_homepage() {
//    String title = driver.getTitle();
//    System.out.println(title);
//    String expected_title ="facebook";
//   }
}
