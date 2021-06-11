package com.blinkslabs.blinkist.android.challenge.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.blinkslabs.blinkist.android.challenge.R
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class YoutubeVideoPlayTest : TestCase() {

    @Before
    public override fun setUp() {
        ActivityScenario.launch(BooksActivity::class.java)
    }

    @Test
    fun testYoutubeVideoPlayFunctionality(){
        onView(withId(R.id.youtube)).perform(ViewActions.click())
        Thread.sleep(5000)
        Espresso.pressBack()
        onView(withId(R.id.youtube)).check(matches(isDisplayed()))
    }

    @After
    public override fun tearDown() {}
}
