package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val etRegisterNama = findViewById<EditText>(R.id.etRegisterNama)

        findViewById<Button>(R.id.btnRegisterSubmit).setOnClickListener {
            val nama = etRegisterNama?.text?.toString()?.trim()
            if (!nama.isNullOrEmpty()) {
                SessionManager(this).userName = nama
            } else {
                SessionManager(this).userName = "Faza"
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
