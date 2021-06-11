package com.blinkslabs.blinkist.android.challenge.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.test.espresso.idling.CountingIdlingResource
import com.blinkslabs.blinkist.android.challenge.BlinkistChallengeApplication
import com.blinkslabs.blinkist.android.challenge.R
import com.blinkslabs.blinkist.android.challenge.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*
import javax.inject.Inject

class BooksActivity : AppCompatActivity(), BookListRecyclerAdapter.OnItemClickListener {

    @Inject lateinit var booksViewModelFactory: BooksViewModelFactory

    private val viewModel by viewModels<BooksViewModel> { booksViewModelFactory }

    private lateinit var recyclerAdapter: BookListRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        (application as BlinkistChallengeApplication).component.inject(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = BookListRecyclerAdapter(this)
        recyclerView.adapter = recyclerAdapter

        swipeRefreshView.setOnRefreshListener { viewModel.fetchBooks() }

        viewModel.books().observe(this, Observer { books ->
            showBooks(books)
            hideLoading()
        })

        showLoading()
        viewModel.fetchBooks()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId
        if (id == R.id.youtube) {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showLoading() {
        swipeRefreshView.isRefreshing = true
    }

    private fun hideLoading() {
        swipeRefreshView.isRefreshing = false
    }

    private fun showBooks(books: List<Book>) {
        recyclerAdapter.setItems(books)
        recyclerAdapter.notifyDataSetChanged()
        swipeRefreshView.isRefreshing = false
    }

    override fun alertDialog(title: String) {
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Notice")
        dialog.setMessage("You clicked on the $title")
        dialog.setPositiveButton("OK") { _, _ ->
        }
        dialog.show()
    }
}
