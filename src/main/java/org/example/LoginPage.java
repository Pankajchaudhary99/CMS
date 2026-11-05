package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

        public LoginPage(){
            System.out.println("Constructor");
        }

        public static void main(String[] args){

                WebDriver driver = new ChromeDriver();
                driver.get("https://www.google.com");

                LoginPage loginPage = new LoginPage();

        }
}
