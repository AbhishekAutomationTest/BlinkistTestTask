package com.blinkslabs.blinkist.android.challenge.snapshotTest

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.IdlingRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.blinkslabs.blinkist.android.challenge.ui.BooksActivity
import com.blinkslabs.blinkist.android.challenge.util.CountingIdlingResourceSingleton
import com.karumi.shot.ScreenshotTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MySnapshotTestsPOCWithShots : ScreenshotTest {

    private lateinit var activity : Activity
    lateinit var recyclerView: RecyclerView

    @Test
    fun doScreenshotWithShots() {

        val scenario = ActivityScenario.launch(BooksActivity::class.java)
        scenario.onActivity {
            activity = it
        }
        IdlingRegistry.getInstance().register(CountingIdlingResourceSingleton.countingIdlingResource)
        compareScreenshot(activity)
    }
}

