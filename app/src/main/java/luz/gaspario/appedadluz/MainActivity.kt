package luz.gaspario.appedadluz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val naci = findViewById<EditText>(R.id.txtAño)
        val btnEd = findViewById<Button>(R.id.btnEdad)
        val txtEd = findViewById<TextView>(R.id.txtEdad)
        val btnSi = findViewById<Button>(R.id.btnSig)

        val objEdad = Edad()

        btnEd.setOnClickListener {
            val resultado =
                objEdad.CalcEdad(naci.text.toString().toInt())

            txtEd.text = "Tienes $resultado años"
        }

        btnSi.setOnClickListener {
            val siguiente = Intent(this,MainActivity2::class.java)
            startActivity(siguiente)
        }
    }
}