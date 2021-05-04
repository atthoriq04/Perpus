-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Bulan Mei 2021 pada 13.09
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `noanggota` int(11) NOT NULL,
  `nis` int(11) NOT NULL,
  `namaanggota` varchar(100) NOT NULL,
  `tempatlahir` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `status` int(3) NOT NULL,
  `petugaskonfir` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`noanggota`, `nis`, `namaanggota`, `tempatlahir`, `jurusan`, `status`, `petugaskonfir`) VALUES
(1, 1000001, 'Atthoriq', 'Jakarta, 22 Oktober 2000', 'TKJ', 2, 'Gilang'),
(2, 1000002, 'Sudirman', 'Solo, 28 Februari 2004', 'TKJ', 2, 'Gilang'),
(3, 1000003, 'Jaka', 'Palembang, 20 Agustus 2004', 'TKJ', 2, 'Gilang'),
(4, 1000004, 'Joko', 'jakarta, 15 Juni 2001', 'TKJ', 1, NULL),
(5, 1000010, 'Putri', 'Bekasi, 12 Januari 2005', 'TKJ', 2, 'Gilang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `idbuku` int(11) NOT NULL,
  `kategoribuku` varchar(100) NOT NULL,
  `judulbuku` varchar(255) NOT NULL,
  `nomorlemari` varchar(100) NOT NULL,
  `lokasirak` varchar(100) NOT NULL,
  `sisabuku` int(100) NOT NULL,
  `jumlahbuku` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`idbuku`, `kategoribuku`, `judulbuku`, `nomorlemari`, `lokasirak`, `sisabuku`, `jumlahbuku`) VALUES
(1112, 'Pelajaran', 'Modul TKJ kelas 11', '4', '02', 10, 10),
(11111, 'Pelajaran', 'Modul Teknik Komputer Jaringan Kelas 12', '4', '01', 9, 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjam`
--

CREATE TABLE `peminjam` (
  `id` int(11) NOT NULL,
  `Idbuku` int(11) NOT NULL,
  `judulbuku` varchar(255) NOT NULL,
  `noanggota` int(11) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `tanggalpinjam` varchar(100) NOT NULL,
  `tenggatkembali` varchar(100) NOT NULL,
  `status` int(3) NOT NULL,
  `petugaskonfirpinjam` varchar(255) DEFAULT NULL,
  `tanggalkembali` varchar(11) DEFAULT NULL,
  `petugaskonfirkembali` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjam`
--

INSERT INTO `peminjam` (`id`, `Idbuku`, `judulbuku`, `noanggota`, `Nama`, `tanggalpinjam`, `tenggatkembali`, `status`, `petugaskonfirpinjam`, `tanggalkembali`, `petugaskonfirkembali`) VALUES
(1, 11111, 'Modul Teknik Komputer Jaringan Kelas 12', 2, 'Sudirman', '01 Mei 2021', '15 Mei 2021', 4, 'Gilang', '5 Mei 2021', 'Gilang'),
(2, 11111, 'Modul Teknik Komputer Jaringan Kelas 12', 3, 'Jaka', '1 Mei 2021', '8 Mei 2021', 4, 'Gilang', '5 Mei 2021', 'Gilang'),
(3, 1112, 'Modul TKJ kelas 11', 1, 'Atthoriq', '01 Mei 2021', '12 Mei 2021', 4, 'Darwin', '04 Mei 2021', 'Gilang'),
(4, 11111, 'Modul Teknik Komputer Jaringan Kelas 12', 4, 'Joko', '01 Mei 2021', '8 Mei 2021', 2, 'GIlang', NULL, NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `Username`, `Password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`noanggota`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idbuku`);

--
-- Indeks untuk tabel `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `anggota`
--
ALTER TABLE `anggota`
  MODIFY `noanggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `peminjam`
--
ALTER TABLE `peminjam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
