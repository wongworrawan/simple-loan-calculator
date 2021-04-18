package th.ac.su.wongworrawan.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import th.ac.su.wongworrawan.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.wongworrawan.simpleloancalculator.data.Credit
import th.ac.su.wongworrawan.simpleloancalculator.data.CreditAdapter

class CreditActivity : AppCompatActivity() {
    var itemList:ArrayList<Credit> = ArrayList<Credit>()
    lateinit var arrayAdapter: ArrayAdapter<Credit>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)


        val jsonFileString = getJsonDataFromAsset(
            applicationContext,
            "credit_data.json"
        )

        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<Credit>>(){}.type
        var CreditList : ArrayList<Credit> = gson.fromJson(jsonFileString,listItemType)

        itemList = CreditList
        val listView = findViewById<ListView>(R.id.listView)
        val adapter = CreditAdapter(this@CreditActivity ,itemList)
        listView.adapter = adapter


    }
}