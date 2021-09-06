package com.example.educationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.gallery_thumbnail.view.*
import java.io.IOException


class gallery_activity : AppCompatActivity() {

    var gallery_recyclerView: RecyclerView? = null
    var gallery_Adapter: GalleryAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        gallery_recyclerView = findViewById(R.id.gallery_recyclerview);
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(applicationContext, 2)

        val actionBar=supportActionBar

        if (actionBar!=null){
            actionBar.title="Gallery" //title for actionbar
        }
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val main = MainActivity()
        val jsonString = main.getJSONFromAssets(this,"Images.json")
        val gson = Gson()
        val Gallery_Model = gson.fromJson(
            jsonString,
            ImagesClass::class.java
        )
        val college_name_list:ArrayList<String> = ArrayList<String>()
        val image_url_list:ArrayList<String> = ArrayList<String>()
        try{
//            var i:Int=0
//            for(i in 0 until Gallery_Model.data[0].gallery.size) {
//                college_name_list.add(Gallery_Model.data[0].gallery[i].college_name)
//                image_url_list.add(Gallery_Model.data[0].gallery[i].image_url)
//            }
            //Changes needs to be made
            val Item_Adapter = GalleryAdapter(applicationContext,Gallery_Model.data[0].gallery)

        }catch (ex: IOException){
            ex.printStackTrace()
        }
    }
}
