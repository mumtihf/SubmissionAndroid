package com.mumti.submissionandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class ListSkincareAdapter(private var listSkincare: ArrayList<Skincare>) : RecyclerView.Adapter<ListSkincareAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_skincare, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSkincare.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val skincare = listSkincare[position]

        Glide.with(holder.itemView.context)
            .load(skincare.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = skincare.name
        holder.tvPrice.text = skincare.price

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listSkincare[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Skincare)
    }
}