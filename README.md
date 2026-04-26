====================================================================
           APLIKASI PENGOLAHAN NILAI MAHASISWA - UTS PBO2
====================================================================

[ IDENTITAS MAHASISWA ]
Nama          : Feisal Ramdhani Riyadi
Kelas         : TIF RP 24 CNS
Program Studi : Teknik Informatika
Kampus        : Universitas Teknologi Bandung (UTB)
Dosen         : Bapak Iwan Ridwan, S.T., M.Kom.
Mata Kuliah   : Pemrograman Berorientasi Objek2 (PBO)
--------------------------------------------------------------------

[ VIDEO DEMONSTRASI ]
Untuk melihat bagaimana aplikasi ini berjalan, cara input nilai 
menggunakan Array, hingga sinkronisasi dengan Database Relasional, 
silakan tonton video demo berikut:
👉 https://youtu.be/HzzIkaodiNo

--------------------------------------------------------------------

[ DESKRIPSI APLIKASI ]
Aplikasi ini adalah Sistem Informasi berbasis Java Desktop (Swing) 
untuk mengelola data nilai mahasiswa secara terintegrasi dan 
relasional. Dibuat menggunakan NetBeans IDE dan database MySQL.

[ FITUR UTAMA ]
1. Login System     : Pembatasan hak akses (Admin & Operator).
2. Master Data      : CRUD data Mahasiswa, Dosen, Matkul, dan KRS.
3. Input Array      : Menampung data nilai sementara (maksimal 5) 
                      sebelum disimpan secara massal ke database.
4. Auto Grading     : Hitung otomatis Nilai Akhir (UTS 30%, 
                      Tugas 25%, UAS 30%, Absen 15%) dan Grade (A-E).
5. Kelola Nilai     : Mengedit dan menghapus nilai yang tersimpan, 
                      menampilkan Nama asli & Matkul menggunakan 
                      kueri JOIN antar 4 tabel.
6. Keamanan         : Fitur tambah user baru dan ganti password.

--------------------------------------------------------------------

[ STRUKTUR FOLDER & FILE ]
- /src              : Folder berisi seluruh source code Java
- /img              : Folder berisi screenshot dokumentasi aplikasi
- db_uts_pbo.sql    : File backup database (struktur & data awal)
- readme.txt        : File panduan yang sedang Anda baca

--------------------------------------------------------------------

[ CARA MENGGUNAKAN & MENJALANKAN APLIKASI ]
1. Pastikan XAMPP (Apache & MySQL) sudah berjalan.
2. Buka phpMyAdmin (http://localhost/phpmyadmin).
3. Buat database baru dengan nama: db_uts_pbo
4. Pilih tab "Import", lalu masukkan file "db_uts_pbo.sql" 
   yang ada di dalam folder ini, dan klik "Kirim / Go".
5. Buka NetBeans IDE, pilih "Open Project" dan pilih folder ini.
6. Jalankan (Run) project dari FormLogin atau MenuUtama.
7. Login menggunakan akun yang sudah terdaftar di database.

====================================================================
        Terima Kasih - Dibuat untuk memenuhi tugas UTS PBO 2026
====================================================================
