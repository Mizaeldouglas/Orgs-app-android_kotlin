package br.com.mizaeldouglas.orgs.ui.recycleView.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.mizaeldouglas.orgs.R
import br.com.mizaeldouglas.orgs.model.Product

class ListProductAdapter(private val contex: Context ,private val products : List<Product>) : RecyclerView.Adapter<ListProductAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(product: Product) {
            val name = itemView.findViewById<TextView>(R.id.name)
            name.text = product.name

            val description = itemView.findViewById<TextView>(R.id.description)
            description.text = product.description

            val price = itemView.findViewById<TextView>(R.id.price)
            price.text = product.price.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contex)
        val view = inflater.inflate(R.layout.product_item, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.vincula(product)

        return
    }

}
