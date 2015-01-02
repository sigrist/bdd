Scenario: Login as valid user and check the user name

Given the user is on the Twitter home page
When the user enters the login paulo.sigrist+bdd@gmail.com and password thucydides
And do the log in
Then the user name must be 'BDD'
And the screen name must be 'bddsandbox'


