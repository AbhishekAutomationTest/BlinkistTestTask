package com.blinkslabs.blinkist.android.challenge.ui

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.web.assertion.WebViewAssertions.webMatches
import androidx.test.espresso.web.model.Atoms.getCurrentUrl
import androidx.test.espresso.web.sugar.Web.onWebView
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.blinkslabs.blinkist.android.challenge.R
import com.blinkslabs.blinkist.android.challenge.util.CountingIdlingResourceSingleton
import junit.framework.TestCase
import org.hamcrest.CoreMatchers.containsString
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class YoutubeVideoPlayTest : TestCase() {

    @Before
    public override fun setUp() {
        val scenario = ActivityScenario.launch(BooksActivity::class.java)
        IdlingRegistry.getInstance().register(CountingIdlingResourceSingleton.countingIdlingResource)
    }

    @Test
    fun testYoutubeVideoPlayFunctionality(){
        onView(withId(R.id.youtube)).perform(ViewActions.click())
        onView(withId(R.id.webview)).check(matches(isDisplayed()))
        onWebView(withId(R.id.webview)).check(webMatches(getCurrentUrl(), containsString("https://m.youtube.com/watch?v=2jg33NUsCAg")))
        Espresso.pressBack()
        onView(withId(R.id.youtube)).check(matches(isDisplayed()))
    }

    @After
    public override fun tearDown() {
        IdlingRegistry.getInstance().unregister(CountingIdlingResourceSingleton.countingIdlingResource)
    }
}
