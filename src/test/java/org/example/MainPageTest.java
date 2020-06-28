package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
  private final WebDriver browser = new FirefoxDriver();

  @Test
  void fillInputFields() throws InterruptedException {
    browser.get("http://localhost:8000/");

    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");

    WebElement nameInput = browser.findElement(By.id("nameInput"));
    WebElement rgInput = browser.findElement(By.id("rgInput"));
    WebElement cpfInput = browser.findElement(By.id("cpfInput"));
    WebElement addressInput = browser.findElement(By.id("addressInput"));
    WebElement birthDateInput = browser.findElement(By.id("birthDateInput"));
    WebElement interestingLink = browser.findElement(By.id("interestingLink"));

    nameInput.sendKeys("Rick Astley");
    rgInput.sendKeys("45.771.484.6");
    cpfInput.sendKeys("192.168.254-32");
    addressInput.sendKeys("4830  Cerullo Road, Louisville, KY");
    birthDateInput.sendKeys("01/01/1900");

    TimeUnit.SECONDS.sleep(3);

    interestingLink.click();
  }
}