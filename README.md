Automation Test for 

- assumptions and considerations :
Assumed that viewModel & BooksService is already covered by unit test.
Android tests are only responsible to verify user interactions which are not possible by unit test.
Placement of views, look & feel can be covered by snapshot tests using external library like karumi/shot


- Explanation of your configuration and environment
1. Android tests are currently running with production data coming from  MockBooksApi.class as no double has been
 implemented yet to inject fake data.

- How to set up and execute test
1. Android Tests are placed in /app/src/androidTest/...ui directory with below 2 classes and can be executed by right Click on directory & select
 'run..'':
    a. BooksActivityTest : E2E automated tests for the functionality in book list.
    b. YoutubeVideoPlayTest : E2E automated tests for the Youtube video play functionality.
2. Animations are turned off from build.gradle file.

- How you approached and designed the test scenarios
The test Strategy for end-to-end is mentioned as below :


- Next possible steps to develop this solution more robust
1.  Implement Snapshot Test to verify look & feel & view Placements
2.  Inject fake bookingService into viewModel to make the test generic & robust
3.  Build Page Objects & convert into page object framework to make it scalable
4.  Inject the URL into WebViewActivity to make webView testable with any dummy URL.

