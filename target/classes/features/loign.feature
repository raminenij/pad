@all

Feature: Login
@login
Scenario: Verification of Login Function  

Given user on the Login Page "https://admin-demo.nopcommerce.com/admin/"
And user enters email address with "admin@yourstore.com" 
And user enters password with "admin"  
And user click "log in" button
Then user should see "Dashboard / nopCommerce administration"
And close browser

@new
Scenario: Create new customer

Given user on the Login Page "https://admin-demo.nopcommerce.com/admin/"
When user logs with user "admin@yourstore.com" and password "admin"
Then selects customers link from home page
And enetrs the all fileds in the new form and save
