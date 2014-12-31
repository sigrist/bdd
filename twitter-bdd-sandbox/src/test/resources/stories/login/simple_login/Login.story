Scenario: Login as invalid user

Given the user is on the Twitter home page
When the user enters the login 'invalid@gmail.com' and password 'notvalid'
And do the log in
Then they should see an error message 'The email and password you entered did not match our records. Please double-check and try again.'
