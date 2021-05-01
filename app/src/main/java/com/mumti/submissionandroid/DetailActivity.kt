package com.mumti.submissionandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvPrice: TextView = findViewById(R.id.tv_item_price)
        val tvDescription: TextView = findViewById(R.id.product_description)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)

        val aProductName:String? = intent.getStringExtra("SkincareName")
        val aProuctPrice:String? = intent.getStringExtra("SkincarePrice")
        val aProuctDescription:String? = intent.getStringExtra("SkincareDescription")
        val aProductImage:Int = intent.getIntExtra("SkincarePhoto", 0)

        tvName.text = aProductName
        tvPrice.text = aProuctPrice
        tvDescription.text = aProuctDescription
        imgPhoto.setImageResource(aProductImage)
    }
}