package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AlamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val session = SessionManager(this)

        val etName = findViewById<EditText>(R.id.etAlamatNama)
        val etPhone = findViewById<EditText>(R.id.etAlamatPhone)
        val etAddress = findViewById<EditText>(R.id.etAlamatLengkap)
        val etNote = findViewById<EditText>(R.id.etAlamatNote)

        if (session.userAddress.isNotEmpty()) {
            etAddress.setText(session.userAddress)
        }
        if (session.userPhone.isNotEmpty()) {
            etPhone.setText(session.userPhone)
        }
        if (session.userName.isNotEmpty()) {
            etName.setText(session.userName)
        }

        val menuTitle = intent.getStringExtra("menu_title") ?: "Kopi Susu Gula Aren"
        val menuPriceStr = intent.getStringExtra("menu_price") ?: "Rp 22.000"
        val menuImage = intent.getIntExtra("menu_image", R.drawable.biscoff_latte)

        val priceNumeric = menuPriceStr.replace("Rp", "").replace(".", "").trim().toIntOrNull() ?: 22000
        val ongkir = 8000
        val total = priceNumeric + ongkir

        findViewById<ImageView>(R.id.ivPesananImage).setImageResource(menuImage)
        findViewById<TextView>(R.id.tvPesananTitle).text = "1× $menuTitle"
        findViewById<TextView>(R.id.tvPesananPrice).text = menuPriceStr.replace("Rp", "").trim()
        findViewById<TextView>(R.id.tvSubtotal).text = "Rp %,d".format(priceNumeric).replace(',', '.')
        findViewById<TextView>(R.id.tvTotalPembayaran).text = "Rp %,d".format(total).replace(',', '.')

        val btnOrderKirim = findViewById<Button>(R.id.btnOrderKirim)
        btnOrderKirim.text = "Pesan dan kirim • Rp %,d".format(total).replace(',', '.') + "  →"

        btnOrderKirim.setOnClickListener {
            session.userAddress = etAddress.text.toString().trim()
            session.userPhone = etPhone.text.toString().trim()
            session.userName = etName.text.toString().trim()

            val intent = Intent(this, KonfirmasiActivity::class.java).apply {
                putExtra("menu_title", menuTitle)
                putExtra("total_price", "Rp %,d".format(total).replace(',', '.'))
                putExtra("menu_image", menuImage)
            }
            startActivity(intent)
        }
    }
}
