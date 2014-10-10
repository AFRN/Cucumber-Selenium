package br.com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.example.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebStepdefs {
	
	private WebDriver driver;
	
	@Before("@web")
	public void before(){
		driver = Driver.getInstance();
	}
	
	@After("@web")
	public void after(){
		driver.quit();
	}
	
	@Given("^I open Bing$")
	public void iOpenBing() throws Throwable{
		driver.get("http://www.bing.com");
	}
	
	@And("^I enter \"([^\"]*)\" in search field$")
	public void iEnter(String text) throws Throwable{
		WebElement searchField = driver.findElement(By.id("sb_form_q"));
		searchField.sendKeys(text);
	}
	
	@When("^I click on search button$")
	public void iClickOnSearchButton(){
		driver.findElement(By.id("sb_form_go")).click();;
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void iShouldSee(String text){
		driver.getPageSource().contains(text);
	}
	
	@And("^I wait for (\\d+)$")
	public void iEnter(int time) throws Throwable{
		Thread.sleep(time);
	}
}
