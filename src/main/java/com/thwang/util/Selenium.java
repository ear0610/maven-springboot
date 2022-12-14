package com.thwang.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
  public static void main(String[] args) {
    // 若瀏覽器安裝位置為預設則webDriver會自動搜尋path設定的位置，也可以使用System.setProperty 來指定路徑
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    // System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    // Selenium對不同瀏覽器提供了不同的webDriver
    WebDriver driver = new ChromeDriver(); // googleChrome
    // Firefox
    // WebDriver firefoxDriver = new FirefoxDriver();
    // 到Google首頁
    driver.get("https://www.google.com.tw/");
    // 取得pageTitle
    String title = driver.getTitle();
    System.out.print(title);
  }
}
