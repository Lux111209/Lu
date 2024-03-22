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

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtBas = findViewById<EditText>(R.id.txtBase)
        val txtArea = findViewById<Button>(R.id.btnArea)
        val txtAlt = findViewById<TextView>(R.id.txtAltura)
        val txtSig = findViewById<Button>(R.id.btnSiguiente)

        val objArea = Area()

        txtArea.setOnClickListener {
            val resul =
                objArea.CalcArea(txtBas.text.toString().toInt(),txtAlt.text.toString().toInt())

            txtArea.text = "El área del triángulo es $resul"
        }

        txtSig.setOnClickListener {
            val siguiente = Intent(this, MainActivity2::class.java)
            startActivity(siguiente)
        }
    }
}