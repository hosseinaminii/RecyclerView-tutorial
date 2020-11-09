package ir.apptori.recyclerviewtutotiral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclNews = findViewById<RecyclerView>(R.id.rclNews)
        val adapter = NewsAdapter(createRecyclerViewItems())
        rclNews.layoutManager = LinearLayoutManager(this)
        rclNews.adapter = adapter

    }

    // Create a list of Models
    private fun createRecyclerViewItems(): List<Model> {

        return mutableListOf<Model>().apply {
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_2)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_4)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_5)!!, getString(R.string.text)))
            add(TypeBModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_3)!!))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_5)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_4)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_3)!!, getString(R.string.text)))
            add(TypeBModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_5)!!))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_2)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.image_3)!!, getString(R.string.text)))
        }

    }
}