package th.ac.su.wongworrawan.simpleloancalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Second_Activity : AppCompatActivity() {

     var total :Float? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_)

        var tvTotal = findViewById<TextView>(R.id.tvTotal)
        var btBack = findViewById<Button>(R.id. btBack )

        total = intent.getFloatExtra("amount",0.0f)

        tvTotal.setText(total.toString())

        btBack.setOnClickListener {
            var intent = Intent()
            intent.putExtra("a",total.toString())
            setResult(Activity.RESULT_OK,intent)

            finish()

        }




    }
}