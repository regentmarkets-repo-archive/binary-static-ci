<b>This is a test automation framework which uses the following concepts/tools to automate tests on the Binary site:</b>
- Selenium Webdriver
- Page Object Model
- JAVA
- TestNG
- Maven for Project Build
- Travis CI for continuous integration
- Headless Browser Testing

<b>Currently automated tests are already developed for following pages in binary.com:</b>
- Login Page
- Financial Assessment Page
- Personal Details Page
- Login History Page
- Change Password Page
- Cashier Password Page
- API Token Page
- Authorized Applications Page
- Limits Page
- Login History Page
- Self Exclusion Page
- Trading Page
- Portfolio Page
- Profit Table Page
- Links Validation
- Resources Page


<b>Running the tests:</b>

Project can be cloned/downloaded from github url https://github.com/binary-com/binary-static-ci.git.

Each test will be automatically triggered by Travis CI upon each code push to the repository and build status can be viewed at the below url: https://travis-ci.org/binary-com/binary-static-ci/builds.

<b>Browsers:</b>

Currently tests are running on Chrome Headless Browser using xvfb (X Virtual Framebuffer) provided by Travis CI.

<b>Integration with binary-static</b>

Whenever any change is pushed to binary-static/gh-pages it automatically submits a commit to binary-static-ci and triggers the tests here.

Tests are running against binary staging site and whenever any tests fail on binary-static-ci it will send an email notification to concerned persons.Front-end team will make the fix the issues in staging itself before any release to production.


