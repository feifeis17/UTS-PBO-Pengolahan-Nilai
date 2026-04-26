# 🎓 APLIKASI PENGOLAHAN NILAI MAHASISWA - UTS PBO2

### 👤 IDENTITAS MAHASISWA
* **Nama:** Feisal Ramdhani Riyadi
* **Kelas:** TIF RP 24 CNS
* **Program Studi:** Teknik Informatika
* **Kampus:** Universitas Teknologi Bandung (UTB)
* **Dosen Pengampu:** Bapak Iwan Ridwan, S.T., M.Kom.

---

### 🎥 VIDEO DEMONSTRASI
Untuk melihat bagaimana aplikasi ini berjalan (termasuk fitur input array dan sinkronisasi database relasional), silakan tonton video demo berikut:

👉 **[Tonton Video Demo di YouTube](https://youtu.be/HzzIkaodiNo)**

---

### 🚀 FITUR UTAMA APLIKASI
1. **Login System:** Pembatasan hak akses untuk Admin dan Operator.
2. **Master Data:** CRUD data Mahasiswa, Dosen, Matkul, dan KRS.
3. **Input Data Array:** Menampung data nilai sementara (maksimal 5) sebelum disimpan secara massal ke database.
4. **Auto Grading:** Perhitungan otomatis Nilai Akhir dan penentuan Grade (A-E).
5. **Kelola Nilai:** Edit & Hapus nilai dengan teknologi **JOIN Query** antar 4 tabel untuk menampilkan detail mahasiswa secara akurat.

---

### 🛠️ STRUKTUR DIREKTORI
* `/src` : Berisi seluruh source code Java Desktop (GUI Swing).
* `/img` : Berisi screenshot antarmuka aplikasi.
* `db_uts_pbo.sql` : File export database MySQL.

---

### 🔧 CARA MENJALANKAN APLIKASI
1. Hidupkan Apache & MySQL di XAMPP.
2. Buat database baru bernama `db_uts_pbo` di phpMyAdmin.
3. Import file `db_uts_pbo.sql` ke dalam database tersebut.
4. Buka folder project ini menggunakan NetBeans IDE.
5. Jalankan (Run) dari file `FormLogin.java` atau `MenuUtama.java`.
