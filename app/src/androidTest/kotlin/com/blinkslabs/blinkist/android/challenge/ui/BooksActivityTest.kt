package com.blinkslabs.blinkist.android.challenge.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.blinkslabs.blinkist.android.challenge.R
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BooksActivityTest : TestCase() {

    @Before
    public override fun setUp() {
        ActivityScenario.launch(BooksActivity::class.java)
    }

    @Test
    fun testUserCanSeeBookList(){
        onView(withId(R.id.youtube)).check(matches(isDisplayed()))
        Thread.sleep(5000)

        onView(withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                hasDescendant(withText("The Secret Life of Sleep")), click()))

        onView(withText("You clicked on the The Secret Life of Sleep")).check(matches(isDisplayed()));

        Espresso.pressBack()
        onView(withId(R.id.youtube)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10, click()))
        onView(withText("You clicked on the A Book With a Very Long Title, Veeeeeeeeeeeeeeeeery Long, Possibly the Most Long Title For a Book You've Ever Seen In Your Entire Life")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click())
        onView(withId(R.id.youtube)).check(matches(isDisplayed()))
    }

    @After
    public override fun tearDown() {}
}
