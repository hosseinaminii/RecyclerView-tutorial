package ir.apptori.recyclerviewtutotiral

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by hosseinAmini.
 * Email: hosseinamiinii@gmail.com
 */
class NameAdapter(private val nameList: List<String>) :
    RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        // Inflating R.layout.name_item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.name_item, parent, false)

        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        // Getting element from names list at this position
        val element = nameList[position]
        // Updating the text of the txtName with this element
        holder.txtName.text = element
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById(R.id.txtName) as TextView
    }
}