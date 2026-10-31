package lat.pam.kopidannyemil

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("kopi_prefs", Context.MODE_PRIVATE)

    var userName: String
        get() = prefs.getString("user_name", "Faza") ?: "Faza"
        set(value) {
            prefs.edit().putString("user_name", value).apply()
        }

    var userPhone: String
        get() = prefs.getString("user_phone", "") ?: ""
        set(value) {
            prefs.edit().putString("user_phone", value).apply()
        }

    var userAddress: String
        get() = prefs.getString("user_address", "") ?: ""
        set(value) {
            prefs.edit().putString("user_address", value).apply()
        }
}
