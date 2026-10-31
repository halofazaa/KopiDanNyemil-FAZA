package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val session = SessionManager(this)
        val tvProfileHalo = findViewById<TextView>(R.id.tvProfileHalo)
        tvProfileHalo.text = "Halo, ${session.userName}!"

        val etProfileNama = findViewById<EditText>(R.id.etProfileNama)
        etProfileNama.setText(session.userName)

        findViewById<Button>(R.id.btnSaveProfile).setOnClickListener {
            val newName = etProfileNama.text.toString().trim()
            if (newName.isNotEmpty()) {
                session.userName = newName
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<View>(R.id.navProfileHome).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<View>(R.id.navProfileOrder).setOnClickListener {
            Toast.makeText(this, "Silakan pilih menu terlebih dahulu di Beranda untuk memesan", Toast.LENGTH_SHORT).show()
        }

        findViewById<View>(R.id.navProfileSelf).setOnClickListener {
            // Already on profile
        }
    }
}
