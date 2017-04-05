<b>This is a test automation framework which uses the following concepts/tools to automate tests on the Binary site:</b>
- Selenium Webdriver
- Page Object Model
- JAVA
- TestNG
- Maven for Project Build
- Travis CI for continuous integration
- Headless Browser Testing

<b>Currently the following tests are covered for Binary site:</b>
- Login and Logout
- Login with Incorrect Passsword
- Set Financial Assessment
- Validate fields in Financial Assessment form

<b>Running the tests:</b>

Project can be cloned/downloaded from github url https://github.com/binary-com/binary-static-ci.git.

Each test will be automatically triggered by Travis CI upon each code push to the repository and build status can be viewed at the below url: https://travis-ci.org/binary-com/binary-static-ci/builds.

<b>Browsers:</b>

Currently tests are running on Chrome Headless Browser using xvfb (X Virtual Framebuffer) provided by Travis CI.


