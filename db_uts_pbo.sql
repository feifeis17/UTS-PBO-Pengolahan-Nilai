-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Apr 2026 pada 13.49
-- Versi server: 10.4.32-MariaDB-log
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uts_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dosen`
--

CREATE TABLE `dosen` (
  `kode_dosen` varchar(10) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL,
  `jabatan` enum('Kaprodi','Dosen wali','Dosen biasa') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `krs`
--

CREATE TABLE `krs` (
  `id_krs` int(11) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `kode_mk` varchar(10) DEFAULT NULL,
  `semester_aktif` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `alamat`) VALUES
('26772000555', 'Budi', 'Street:  Jl Tanjungsari 3-5 D/4, Jawa Timur\n\nCity:   Jawa Timur\n\nState/province/area:    Surabaya\n\nPhone number:  0-31-749-2261\n\nZip code:  60187\n\nCountry calling code:  +62\n\nCountry:  Indonesia'),
('26772000556', 'Budi Siregar', 'Street:  Jl Kertamurti 2, Dki Jakarta\n\nCity:   Dki Jakarta\n\nState/province/area:    Jakarta\n\nPhone number:  0-21-749-3934\n\nZip code:  15419\n\nCountry calling code:  +62\n\nCountry:  Indonesia'),
('26772000558', 'Andika Permata', 'Street:  Jl Medan Merdeka Brt 3, Dki Jakarta\n\nCity:   Dki Jakarta\n\nState/province/area:    Jakarta\n\nPhone number:  0-21-345-8423\n\nZip code:  10110\n\nCountry calling code:  +62\n\nCountry:  Indonesia'),
('26772000559', 'Khoirul Insan', 'Street:  Jl Raden Saleh 16, Dki Jakarta\n\nCity:   Dki Jakarta\n\nState/province/area:    Jakarta\n\nPhone number:  021-31902073\n\nZip code:  10430\n\nCountry calling code:  +62\n\nCountry:  Indonesia'),
('26772000560', 'indah kusuma', 'Street:  Jl Tanjungsari 3-5 D/5, Jawa Timur\n\nCity:   Jawa Timur\n\nState/province/area:    Surabaya\n\nPhone number:  0-31-749-2261\n\nZip code:  60187\n\nCountry calling code:  +62\n\nCountry:  Indonesia'),
('26772000561', 'Restu Imam', 'Street:  Jl Tanjungsari 3-5 D/7, Jawa Barat\n\nCity:   Jawa Timur\n\nState/province/area:    Surabaya\n\nPhone number:  0-31-749-2261\n\nZip code:  60187\n\nCountry calling code:  +62\n\nCountry:  Indonesia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kode_mk` varchar(10) NOT NULL,
  `nama_mk` varchar(100) NOT NULL,
  `sks` int(11) NOT NULL,
  `semester` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai`
--

CREATE TABLE `nilai` (
  `id_nilai` int(11) NOT NULL,
  `id_krs` int(11) NOT NULL,
  `nilai_uts` int(11) NOT NULL,
  `nilai_tugas` int(11) NOT NULL,
  `nilai_uas` int(11) NOT NULL,
  `nilai_absen` int(11) NOT NULL,
  `nilai_akhir` int(11) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `kode_mk` varchar(10) DEFAULT NULL,
  `nilai_huruf` enum('A','B','C','D','E') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `level` enum('admin','operator') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `password`, `level`) VALUES
('admin1', 'admin', 'admin'),
('Gurame', 'Gurame1234', 'operator');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`kode_dosen`);

--
-- Indeks untuk tabel `krs`
--
ALTER TABLE `krs`
  ADD PRIMARY KEY (`id_krs`),
  ADD KEY `nim` (`nim`),
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kode_mk`);

--
-- Indeks untuk tabel `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `nim` (`nim`),
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `krs`
--
ALTER TABLE `krs`
  MODIFY `id_krs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `nilai`
--
ALTER TABLE `nilai`
  MODIFY `id_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `krs`
--
ALTER TABLE `krs`
  ADD CONSTRAINT `krs_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE,
  ADD CONSTRAINT `krs_ibfk_2` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`) ON DELETE CASCADE;

--
-- Ketidakleluasaan untuk tabel `nilai`
--
ALTER TABLE `nilai`
  ADD CONSTRAINT `nilai_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE,
  ADD CONSTRAINT `nilai_ibfk_2` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
