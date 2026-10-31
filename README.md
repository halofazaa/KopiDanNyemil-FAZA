# ☕ Kopi dan Nyemil — Aplikasi Pemesanan Kopi & Camilan Android

Aplikasi mobile Android modern yang dirancang untuk memberikan pengalaman pemesanan kopi dan camilan lezat secara praktis, cepat, dan estetik. Dikembangkan menggunakan **Kotlin** dan **Material Design**, aplikasi ini mengusung antarmuka yang hangat (*warm coffee theme*), bersih, dan ramah pengguna (*user-friendly*).

---

## 📱 Fitur Utama & Alur Layar (Screens)

1. **Selamat Datang (Splash Screen)**
   * Tagline: *"Secangkir hangat. Sebungkus bahagia."*
   * Dilengkapi foto atmosfer kedai kopi yang hangat dan tombol navigasi utama **"Mulai sekarang"**.

2. **Pilihan Masuk / Daftar**
   * Tagline: *"Jeda yang enak, dimulai di sini."*
   * Menyediakan opsi cepat untuk mendaftar akun baru atau masuk bagi pengguna lama.

3. **Masuk Akun (Login)**
   * Ilustrasi estetik *menu kopi* di bagian header.
   * Input bersih untuk Username/Email dan Kata Sandi, serta opsi **"Lanjutkan dengan Google"**.

4. **Daftar Akun (Register)**
   * Formulir pendaftaran lengkap: Nama Lengkap, Username, Email, dan Kata Sandi.
   * Fitur persetujuan Syarat & Ketentuan serta Kebijakan Privasi.

5. **Beranda & Katalog Menu (Home)**
   * **Header Lokasi**: *"ANTAR KE • Rumah • Jl. Melati No. 12"*.
   * **Sapaan Dinamis**: Memanggil nama pengguna secara otomatis (*"Mau ngopi apa, Nadia?"*).
   * **Pencarian & Banner Promo**: Banner promosi *"Ngopi + nyemil, lebih hemat."*.
   * **Filter Kategori**: Menyaring menu berdasarkan *Semua*, *Kopi*, *Non-Kopi*, dan *Camilan*.
   * **Daftar Favorit**: Menampilkan item favorit lengkap dengan foto, deskripsi singkat, rating bintang, dan harga (seperti *Kopi Susu Gula Aren*, *Donat Cokelat*, *Croissant Keju*, *Cappuccino*, dan *Matcha Latte*).
   * **Bottom Navigation Bar**: Navigasi mudah antar *Beranda*, *Pesanan*, dan *Profil*.

6. **Profil Saya**
   * Avatar inisial dinamis (*NP*) dan lencana keanggotaan (*"Teman ngopi sejak..."*).
   * Form ubah informasi pribadi (Nama Lengkap, Email, Nomor Telepon).
   * Akses cepat ke *Alamat tersimpan* dan *Riwayat pesanan*.

7. **Alamat Pengiriman & Ringkasan Pesanan (Order)**
   * Pemilihan alamat utama pengiriman (*Rumah / Kantor*).
   * Input detail catatan untuk kurir (misal: *"Pagar putih, rumah di samping toko bunga"*).
   * **Ringkasan Pesanan Dinamis**: Kalkulasi otomatis Subtotal, Ongkos Kirim, dan Total Pembayaran.

8. **Konfirmasi Pesanan (Success Screen)**
   * Status pesanan interaktif (*"Makasih, Faza! Pesananmu diterima."*).
   * Nomor pesanan unik (*#KN-241026*), rincian item yang dibeli, total pembayaran, serta estimasi waktu pengantaran (20–30 menit).

---

## 🛠️ Teknologi yang Digunakan

* **Bahasa Pemrograman**: Kotlin
* **UI Toolkit**: Android Views (XML Layouts, ConstraintLayout, CardView, RecyclerView, Custom Drawable Resources)
* **Manajemen Sesi**: SharedPreferences (`SessionManager` helper class untuk data user dinamis)
* **Build System**: Gradle (`build.gradle.kts`)
* **Minimum SDK**: Android 7.0 (API Level 24) atau lebih tinggi

---

## 🚀 Cara Menjalankan Aplikasi

1. **Clone & Buka Proyek**:
   * Download atau clone repository ini.
   * Buka **Android Studio**, pilih **Open**, lalu arahkan ke folder proyek `KopiDanNyemil`.
2. **Sinkronisasi Gradle**:
   * Tunggu proses *Gradle Sync* selesai otomatis. Jika diperlukan, klik ikon **Sync Project with Gradle Files** di pojok kanan atas.
3. **Persiapkan Device**:
   * Sambungkan smartphone Android fisik (USB Debugging aktif) atau gunakan **Android Emulator (AVD)**.
4. **Build & Run**:
   * Tekan tombol **Run 'app'** (`Shift + F10`) untuk memasang dan menjalankan aplikasi.

---

## 📸 Tampilan Antarmuka 
<img width="576" height="1280" alt="selamat datang UI" src="https://github.com/user-attachments/assets/74fb4bd5-04e7-4a09-b701-67e895d19443" />
<img width="576" height="1280" alt="pilihan masuk atau daftar UI" src="https://github.com/user-attachments/assets/831ca638-970d-4135-9a9a-1391fc556edd" />
<img width="576" height="1280" alt="daftar akun UI" src="https://github.com/user-attachments/assets/9db7258a-2fcc-4ce8-8236-2d3db1531b17" />
<img width="576" height="1280" alt="masuk akun UI" src="https://github.com/user-attachments/assets/a09ced83-80a7-4de6-ba95-1dfbd6259784" />
<img width="576" height="1280" alt="berandaa kopi UI" src="https://github.com/user-attachments/assets/3f1b1515-6c73-44cd-b544-3b794457d15d" />
<img width="576" height="1280" alt="beranda camilan UI" src="https://github.com/user-attachments/assets/89b6921d-893d-4d8a-8e63-912e47e0886c" />
<img width="576" height="1280" alt="alamat pengiriman UI" src="https://github.com/user-attachments/assets/81699b4c-fa6e-49a3-96a9-9f09afb08327" />
<img width="576" height="1280" alt="detail pesanan UI" src="https://github.com/user-attachments/assets/38474007-8761-4f2d-b2cd-72ce1e8c70c0" />
<img width="576" height="1280" alt="konfirmasi pesanan UI" src="https://github.com/user-attachments/assets/ff000f3b-8b12-4b6d-8942-5b0a655d18b3" />
<img width="576" height="1280" alt="profilll" src="https://github.com/user-attachments/assets/efb9c129-c063-4450-8563-024465b3fa3b" />
