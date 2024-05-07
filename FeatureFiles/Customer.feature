@tag
Feature: As a admin user validate customer module

  @customer
  Scenario Outline: Validate Customer with multiple data
    Given User launch Browser
    When user Enter url as "http://webapp.qedgetech.com/" in a browser
    When user Wait for username with "xpath" and "//input[@id='username']"
    When user enter user name with "xpath" and "//input[@id='username']" and "admin"
    When user enter password with "xpath" and "//input[@id='password']" and "master"
    When user click login with "id" and "btnsubmit"
    When user Wait for customer link with "xpath" and "(//a[@href='a_customerslist.php'])[2]"
    When user click customer link with "xpath" and "(//a[@href='a_customerslist.php'])[2]"
    When Wait for Add+icon with "xpath" and "(//span[@data-phrase='AddLink'])[1]"
    When click Add+icon with "xpath" and "(//span[@data-phrase='AddLink'])[1]"
    When Wait for Customer Number with "xpath" and "//input[@id='x_Customer_Number']"
    When capture customer number with "xpath" and "//input[@id='x_Customer_Number']"
    When Enter in "<CustomerName>" with "xpath" and "//input[@id='x_Customer_Name']"
    When Enter in "<Address>" with "xpath" and "//textarea[@id='x_Address']"
    When Enter in "<City>" with "xpath" and "//input[@id='x_City']"
    When Enter in "<Country>" with "xpath" and "//input[@id='x_Country']"
    When Enter in "<ContactPerson>" with "xpath" and "//input[@id='x_Contact_Person']"
    When Enter in "<PhoneNumber>" with "xpath" and "//input[@id='x_Phone_Number']"
    When Enter in "<Email>" with "xpath" and "//input[@id='x__Email']"
    When Enter in "<MobileNumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
    When Enter in "<Notes>" with "xpath" and "//input[@id='x_Notes']"
    When click Add button with "id" and "btnAction"
    When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
    When Wait for Alert ok button with "xpath" and "(//button[normalize-space()='OK'])[6]"
    When click for Alert ok button with "xpath" and "(//button[normalize-space()='OK'])[6]"
    When validate customer table
    When click logout link with "xpath" and "(//a[@href='logout.php'])[2]"
    When close Browser

    Examples: 
      | CustomerName | Address     | City | Country | ContactPerson | PhoneNumber | Email           | MobileNumber | Notes  |
      | tatac1       | sanathnagar | hyd  | india   | Qedge         |   123456565 | latha@gmail.com |    123456786 | hello1 |
      | tatac2       | sanathnagar | hyd  | india   | Qedge         |   123456566 | latha@gmail.com |    123456787 | hello2 |
      | tatac3       | sanathnagar | hyd  | india   | Qedge         |   123456564 | latha@gmail.com |    123456788 | hello3 |
      | tatac4       | sanathnagar | hyd  | india   | Qedge         |   123456568 | latha@gmail.com |    123456789 | hello4 |
