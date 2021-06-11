<h2>Automation Test for Blinkist Test Task</h2>

<h3> Assumptions and Considerations :</h3>
1. I assumed that viewModel & BooksService is already covered by unit test.
2. Android Instrumentation tests are only responsible to verify user interactions which are not possible by unit test.
3. Placement of views, look & feel can be covered by snapshot tests using external library like karumi/shot.


<h3>Explanation of your configuration and environment</h3>
1. Android tests are currently running with production data coming from  MockBooksApi.class as test double has not been
 implemented yet to inject fake data.

<h3>How to set up and execute test</h3>
1. Android Tests are placed in /app/src/androidTest/...ui directory with below 2 test classes and can be executed by right Click on directory & select
 'run..'':
    a. BooksActivityTest : E2E automated tests for the functionality in book list.
    b. YoutubeVideoPlayTest : E2E automated tests for the Youtube video play functionality.
2. Animations are turned off from build.gradle file.

<h3>How you approached and designed the test scenarios</h3>
1.

The test Strategy for end-to-end is mentioned as below :
<img width="801" alt="image" src="https://user-images.githubusercontent.com/42365090/121757315-5c80e600-cb47-11eb-9847-25264ce40ccc.png">

Few Important thing to note:
1. I didn't include any scenario for webview Interaction as this would be dependent to 3rd party page & test will become very flaky.
2. Sceanrio related to page refresh is not required to be test explicity as this is already covered in unit test & UI related to showing loading indicator is part of Android framework.


<h3>Next possible steps to develop this solution more robust</h3>
1.  Implement Snapshot Test to verify look & feel & view Placements
2.  Inject fake bookingService into viewModel to make the test generic & robust
3.  Build Page Objects & convert into page object framework to make it scalable
4.  Inject the URL into WebViewActivity to make webView testable with any dummy URL.

