package ir.apptori.recyclerviewtutotiral

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by hosseinAmini.
 * Email: hosseinamiinii@gmail.com
 */
class NewsAdapter(private val items: List<Model>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is TypeAModel -> 1
            is TypeBModel -> 2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.type_a_item, parent, false)
            TypeAViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.type_b_item, parent, false)
            TypeBViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TypeAViewHolder) {
            val item = items[position] as TypeAModel
            holder.imgNews.setImageDrawable(item.image)
            holder.txtNews.text = item.text
        } else if (holder is TypeBViewHolder) {
            val item = items[position] as TypeBModel
            holder.imgBanner.setImageDrawable(item.image)
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    class TypeAViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgNews = itemView.findViewById<ImageView>(R.id.imgNews)
        val txtNews = itemView.findViewById<TextView>(R.id.txtNews)
    }

    class TypeBViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBanner = itemView.findViewById<ImageView>(R.id.imgBanner)
    }

}