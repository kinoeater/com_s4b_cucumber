

Feature: Login successfully to S4B

  
  Scenario: Login to S4B with correct credentials
  
    Given S4B is launched   
    When Enter valid UC_username
    And Enter valid UC_paserword
    And Click on UC_login button
    Then application navigates to  S4B skype login page
    And Enter valid skype_username
    And Enter valid skype_pasword
    When Click on skype_login button
    Then save credentials  message appears 
    When Click Ok button
    Then user reaches the main page  
    And Click on settings_button    
    And Click on logout_button
    And Click on popup_logout_button 
    Given S4B is launched 
    Then quit the app 
    

