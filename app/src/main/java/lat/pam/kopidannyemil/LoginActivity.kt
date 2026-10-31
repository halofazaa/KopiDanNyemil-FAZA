package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val etUsername = findViewById<EditText>(R.id.etUsername)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val username = etUsername?.text?.toString()?.trim()
            if (!username.isNullOrEmpty()) {
                SessionManager(this).userName = username
            } else {
                SessionManager(this).userName = "Faza"
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
