package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KonfirmasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val session = SessionManager(this)
        val tvHaloKonfirmasi = findViewById<TextView>(R.id.tvHaloKonfirmasi)
        tvHaloKonfirmasi.text = "Makasih, ${session.userName}!\nPesananmu diterima."

        val menuTitle = intent.getStringExtra("menu_title") ?: "Kopi Susu Gula Aren"
        val totalPrice = intent.getStringExtra("total_price") ?: "Rp 30.000"
        val menuImage = intent.getIntExtra("menu_image", R.drawable.biscoff_latte)

        findViewById<ImageView>(R.id.ivKonfirmasiImage).setImageResource(menuImage)
        findViewById<TextView>(R.id.tvKonfirmasiItem).text = "1× $menuTitle"
        findViewById<TextView>(R.id.tvKonfirmasiTotal).text = totalPrice
        findViewById<TextView>(R.id.tvKonfirmasiAlamat).text = "📍  ${session.userName} • Rumah"
        findViewById<TextView>(R.id.tvKonfirmasiAlamatDetail).text = session.userAddress.ifEmpty { "Jl. Melati No. 12, Cipete Selatan, Jakarta Selatan" }

        findViewById<Button>(R.id.btnOkSelesai).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}
