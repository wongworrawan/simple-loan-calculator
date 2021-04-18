package th.ac.su.wongworrawan.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import th.ac.su.wongworrawan.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.wongworrawan.simpleloancalculator.data.Credit
import th.ac.su.wongworrawan.simpleloancalculator.data.CreditAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val edtMoney = findViewById<EditText>(R.id.edtMoney)
        val edtInterest = findViewById<EditText>(R.id.edtInterest)
        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btSubmit = findViewById<Button>(R.id.btSubmit)
        val btCredit = findViewById<Button>(R.id.btCredit)

        btSubmit.setOnClickListener() {



            var money: Float =  edtMoney.text.toString().toFloat()
            var interest: Float = edtInterest.text.toString().toFloat()
            var time:Int = edtTime.text.toString().toInt()

            var amount = (money + (money*(interest/100)*time)) / (time*12)
            var intent = Intent(this@MainActivity, Second_Activity::class.java)
            intent.putExtra("amount",amount!!)




            startActivity(intent)





        }



        btCredit.setOnClickListener() {



            var intent = Intent(this@MainActivity, CreditActivity::class.java)



            startActivity(intent)





        }



    }
}