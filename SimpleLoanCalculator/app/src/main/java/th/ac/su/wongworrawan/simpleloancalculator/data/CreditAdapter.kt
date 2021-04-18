package th.ac.su.wongworrawan.simpleloancalculator.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item_credit.view.*
import th.ac.su.wongworrawan.simpleloancalculator.R

class CreditAdapter(private val context: Context,
                    private val dataSource:ArrayList<Credit>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    
    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item_credit,null)

        rowView.tvTitle.text = dataSource[position].promo_name
        rowView.tvSubtitle.text = dataSource[position].promo_description
        rowView.tvDetail.text = dataSource[position].promo_code.toString()

        val res = context.resources
        val drawableId:Int =
            res.getIdentifier(dataSource[position].imageFile,"drawable",context.packageName)

        rowView.imgThumbnail.setImageResource(drawableId)


        return rowView
    }
}