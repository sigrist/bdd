Scenario: Login as invalid user

Given the user is on the Twitter home page
When the user enters the login $email and password $password
And do the log in
Then they should see an error message $message

Examples:
|email|password|message|
|invalid@gmail.com|notvalid|The email and password you entered did not match our records. Please double-check and try again.|
|thisIsNotAnEmail|notvalid|The username and password you entered did not match our records. Please double-check and try again.|

Scenario: Do not fill email and password and click submit button

Given the user is on the Twitter home page
When do the log in
Then they should see an error message The username and password you entered did not match our records. Please double-check and try again.
