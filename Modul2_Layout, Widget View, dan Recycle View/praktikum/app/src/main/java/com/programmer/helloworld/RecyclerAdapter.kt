package com.programmer.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    //Image list
    private val images = intArrayOf(
        R.drawable.unocard_1,
        R.drawable.unocard_2,
        R.drawable.unocard_3,
        R.drawable.unocard_4,
        R.drawable.unocard_5,
        R.drawable.unocard_6)
    //Title list
    private val titles = arrayOf(
        "Kartu Wild Two (+2)",
        "Kartu Reverse",
        "Kartu Skip",
        "Kartu Wild",
        "Kartu +4",
        "Kartu Angka Biasa")
    //Detail list
    private val details = arrayOf(
        "Pemain yang mengeluarkan kartu ini, pemain sesudahnya harus mengambil dua kartu dari kartu ambilan.",
        "Kartu ini hanya mengubah arah permainan,misalnya yang awalnya searah jarum jam menjadi berlawanan arah jarum jam.",
        "Apabila ada pemain yang mengeluarkan kartu ini, maka pemain sesudahnya akan dilewati atau di-skip, jadi dia kehilangan kesempatan membuang kartu.",
        "Enaknya dari kartu ini adalah kartu ini bisa digunakan untuk warna apa saja.",
        "Pemain berikutnya harus mengambil empat kartu dari kartu ambilan.",
        "Kartu dengan empat warna bernomor 0 sampai 9")
    //ViewHolder class
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init{
            itemImage = itemView.findViewById(R.id.cardImage)
            itemTitle = itemView.findViewById(R.id.cardTitle)
            itemDetail = itemView.findViewById(R.id.cardDetail)

            itemView.setOnClickListener { v: View ->
                var position: Int = getAdapterPosition()
                Snackbar.make(v, "Click on item ${titles[position]}",
                    Snackbar.LENGTH_LONG).setAction("Action",null).show()
            }
        }

    }

    //onCreateViewHolder()
    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.card_layout, ViewGroup, false)
        return ViewHolder(v)
    }
    //onBindViewHolder()
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }
    //getItemCount()
    override fun getItemCount(): Int {
        return titles.size
    }
}