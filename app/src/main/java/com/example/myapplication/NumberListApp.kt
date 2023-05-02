package com.example.myapplication

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.databinding.ActivityListOfNumberUsingListViewBinding
import com.example.myapplication.databinding.ActivityNumberListAppBinding

class NumberListApp : AppCompatActivity() {
    private lateinit var binding: ActivityNumberListAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumberListAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var arrayList: ArrayList<Data> = ArrayList()

        arrayList.add(Data("Zero", "zeroaudio"))
        arrayList.add(Data("one", "oneaudio"))
        arrayList.add(Data("Two", "twoaudio"))
        arrayList.add(Data("Three", "threeaudio"))
        arrayList.add(Data("Four", "fouraudio"))
        arrayList.add(Data("Five", "fiveaudio"))
        arrayList.add(Data("Six", "sixaudio"))
        arrayList.add(Data("Seven", "sevenaudio"))
        arrayList.add(Data("Eight", "eightaudio"))
        arrayList.add(Data("Nine", "nineaudio"))
        arrayList.add(Data("Ten", "tenaudio"))

        var adapter: NumberAdapter = NumberAdapter(this, arrayList)
        binding.numberListViewId.adapter = adapter

    }
}

class NumberAdapter : BaseAdapter {

    var arrayList: ArrayList<Data> = ArrayList()
    var context: Context?

    constructor(context: Context, arrayList: ArrayList<Data>) {
        this.arrayList = arrayList
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
        val inflater: LayoutInflater =
            context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val holder: ViewHolder
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_item, parent, false)
            holder = ViewHolder()
            holder.text = view.findViewById(R.id.number_text_view_id)
            holder.image = view.findViewById(R.id.number_image_view_id)

            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }
        val textValue = holder.text
        textValue?.text = arrayList[position].textNumber

        val imageValue = holder.image
        var mediaPlayer: MediaPlayer?
        imageValue?.setOnClickListener {
            mediaPlayer = MediaPlayer.create(
                context,
                context?.resources!!.getIdentifier(
                    arrayList[position].audioNumber,
                    "raw",
                    context?.packageName
                )
            )
            mediaPlayer?.start()
        }
        return view
    }

    private class ViewHolder {
        var text: TextView? = null
        var image: ImageView? = null
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }


}