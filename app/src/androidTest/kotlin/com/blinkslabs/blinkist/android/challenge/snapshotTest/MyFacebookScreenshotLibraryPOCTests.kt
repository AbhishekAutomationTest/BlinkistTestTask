
package com.blinkslabs.blinkist.android.challenge.snapshotTest

import android.app.Activity
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import com.blinkslabs.blinkist.android.challenge.R
import com.blinkslabs.blinkist.android.challenge.ui.BooksActivity
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Test

class MyFacebookScreenshotLibraryPOCTests {

    @Test
    fun doScreenshot_youtubeLink() {
        /*

     * Create and set up your view some how. This might be inflating,
     * or creating from a view class. You might want to set properties
     * on the view.
     */


        lateinit var view: View
        lateinit var activity : Activity

        val scenario = ActivityScenario.launch(BooksActivity::class.java)
        scenario.onActivity {
            activity = it
            view = activity.findViewById<RecyclerView>(R.id.youtube)
        }

/*
     * Measure and layout the view. In this example we give an exact
     * width but all the height to be WRAP_CONTENT.
     */
ViewHelpers.setupView(view)
            .setExactWidthDp(300)
            .layout()

/*
     * Take the actual screenshot. At the end of this call the screenshot
     * is stored on the device, and the gradle plugin takes care of
     * pulling it and displaying it to you in nice ways.
     */
Screenshot.snap(view)
            .record()
    }

    @Test
    fun doScreenshot_fullActivity() {
/*
     * Create and set up your view some how. This might be inflating,
     * or creating from a view class. You might want to set properties
     * on the view.
     */


        lateinit var activity : Activity

        val scenario = ActivityScenario.launch(BooksActivity::class.java)
        Thread.sleep(5000)
        scenario.onActivity {
            activity = it
        }

/*
     * Measure and layout the view. In this example we give an exact
     * width but all the height to be WRAP_CONTENT.
     */
/*ViewHelpers.setupView(view)
            .setExactWidthDp(300)
            .layout()*/


/*
     * Take the actual screenshot. At the end of this call the screenshot
     * is stored on the device, and the gradle plugin takes care of
     * pulling it and displaying it to you in nice ways.
     */
Screenshot.snapActivity(activity).record()
    }
}


