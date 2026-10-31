package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val session = SessionManager(this)
        val tvHaloNama = findViewById<TextView>(R.id.tvHaloNama)
        tvHaloNama.text = "Mau ngopi apa, ${session.userName}?"

        // Bottom Nav
        findViewById<View>(R.id.navHome).setOnClickListener {
            // Already on home
        }

        findViewById<View>(R.id.navOrder).setOnClickListener {
            // "alamat pengiriman yang di navbar itu harusnya jangan ada bagian pesanan, kecuali pencetnya dari menunya baru boleh"
            Toast.makeText(this, "Silakan pilih menu terlebih dahulu di Beranda untuk memesan", Toast.LENGTH_SHORT).show()
        }

        findViewById<View>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        val rvMenu = findViewById<RecyclerView>(R.id.rvMenu)
        rvMenu.layoutManager = LinearLayoutManager(this)

        val allMenu = listOf(
            MenuItem("Biscoff Latte", "• Espresso, fresh milk, biscoff spread", "Rp 28.000", R.drawable.biscoff_latte, "Kopi"),
            MenuItem("Butterscotch Latte", "• Espresso, milk, butterscotch syrup", "Rp 26.000", R.drawable.butterscotch_latte, "Kopi"),
            MenuItem("Caramel Iced Coffee", "• Espresso, milk, caramel drizzle", "Rp 24.000", R.drawable.caramel_iced_coffee, "Kopi"),
            MenuItem("Cold Brew", "• Smooth steeped coffee", "Rp 20.000", R.drawable.cold_brew, "Kopi"),
            MenuItem("Creamy Latte Vanilla", "• Espresso, steamed milk, vanilla bean", "Rp 25.000", R.drawable.creamy_latte_vanilla, "Kopi"),
            MenuItem("Hot Americano", "• Rich espresso with hot water", "Rp 18.000", R.drawable.hot_americano, "Kopi"),
            MenuItem("Macchiato", "• Espresso marked with foam", "Rp 22.000", R.drawable.macchiato, "Kopi"),
            MenuItem("Classic Cheesecake", "• Rich and creamy cheese cake slice", "Rp 32.000", R.drawable.cheesecake, "Camilan"),
            MenuItem("Butter Croissant", "• Freshly baked buttery pastry", "Rp 22.000", R.drawable.img, "Camilan")
        )

        fun updateMenu(category: String) {
            val filtered = if (category == "Semua") allMenu else allMenu.filter { it.category == category }
            rvMenu.adapter = MenuAdapter(filtered) { menuItem ->
                val intent = Intent(this, AlamatActivity::class.java).apply {
                    putExtra("menu_title", menuItem.title)
                    putExtra("menu_price", menuItem.price)
                    putExtra("menu_desc", menuItem.description)
                    putExtra("menu_image", menuItem.imageRes)
                }
                startActivity(intent)
            }
        }

        updateMenu("Semua")

        // Filter clicks (Semua, Kopi, Camilan - Non-kopi removed)
        val chipSemua = findViewById<TextView>(R.id.chipSemua)
        val chipKopi = findViewById<TextView>(R.id.chipKopi)
        val chipCamilan = findViewById<TextView>(R.id.chipCamilan)

        val selectChip: (TextView, String) -> Unit = { selected, cat ->
            listOf(chipSemua, chipKopi, chipCamilan).forEach {
                it.setBackgroundResource(R.drawable.bg_edittext)
                it.setTextColor(android.graphics.Color.parseColor("#4B3621"))
            }
            selected.setBackgroundResource(R.drawable.bg_circle_primary)
            selected.setTextColor(android.graphics.Color.parseColor("#FFFFFF"))
            updateMenu(cat)
        }

        chipSemua.setOnClickListener { selectChip(chipSemua, "Semua") }
        chipKopi.setOnClickListener { selectChip(chipKopi, "Kopi") }
        chipCamilan.setOnClickListener { selectChip(chipCamilan, "Camilan") }
    }
}
