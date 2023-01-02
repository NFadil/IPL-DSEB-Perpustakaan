-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Des 2022 pada 21.30
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `id_user` int(5) NOT NULL,
  `username` varchar(11) NOT NULL,
  `nama_anggota` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(11) NOT NULL,
  `alamat_anggota` varchar(50) NOT NULL,
  `no_hp` decimal(12,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`id_user`, `username`, `nama_anggota`, `jenis_kelamin`, `alamat_anggota`, `no_hp`) VALUES
(1, 'fadil', 'Nurul Fadhilah Anwar', 'Laki-Laki', 'Lemban', '20001201'),
(2, 'Hakim', 'Naufal Hakim', 'Laki-Laki', 'Bandung', '20011201'),
(3, 'Kukuh', 'Kukuh Yulion', 'Laki-Laki', 'Bandung', '20021207'),
(4, 'rizky2', 'RizkyRNK', 'Laki-Laki', 'Bandung', '20020814'),
(5, 'ASEP', 'ASEPP', 'Laki-Laki', 'Bandung', '819154845');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(5) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `jenis_buku` varchar(20) NOT NULL,
  `pengarang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `jenis_buku`, `pengarang`) VALUES
(8001, 'Bumi', 'Novel', 'Tere Liye'),
(8002, 'Bulan', 'Novel', 'Tere Liye'),
(8003, 'Bintang', 'Novel', 'Tere Liye'),
(8004, 'Batman', 'Komik', 'DC');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', '123'),
('admin2', '123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(5) NOT NULL,
  `id_user` int(5) NOT NULL,
  `username` varchar(11) NOT NULL,
  `id_buku` int(5) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `waktu_peminjaman` date NOT NULL,
  `waktu_pengembalian` date NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `id_user`, `username`, `id_buku`, `judul`, `waktu_peminjaman`, `waktu_pengembalian`, `status`) VALUES
(2001, 1, 'fadil', 8001, 'Bumi', '2022-12-03', '2023-01-01', 'Pinjam'),
(2002, 2, 'Hakim', 8002, 'Bulan', '2022-12-28', '2023-01-01', 'Pinjam'),
(2003, 3, 'Kukuh', 8004, 'Batman', '2022-12-28', '2023-01-01', 'Pinjam'),
(2004, 4, 'rizky2', 8003, 'Bintang', '2022-12-28', '2023-01-01', 'Di Kembalikan'),
(2005, 5, 'ASEP', 8004, 'Bulan', '2022-12-28', '2023-01-18', 'Di Kembalikan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `id_pengembalian` int(5) NOT NULL,
  `id_peminjaman` int(5) NOT NULL,
  `id_buku` int(5) NOT NULL,
  `id_user` int(5) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `tanggal_pengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pustakawan`
--

CREATE TABLE `pustakawan` (
  `id_pustakawan` int(5) NOT NULL,
  `username` varchar(11) NOT NULL,
  `nama_pustakawan` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `alamat_pustakwan` varchar(20) NOT NULL,
  `no_hp` decimal(12,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pustakawan`
--

INSERT INTO `pustakawan` (`id_pustakawan`, `username`, `nama_pustakawan`, `jenis_kelamin`, `alamat_pustakwan`, `no_hp`) VALUES
(1, 'admin', 'Nurul Fadilah', 'Laki-Laki', 'Bandung', '81564789545');

-- --------------------------------------------------------

--
-- Struktur dari tabel `registrasi`
--

CREATE TABLE `registrasi` (
  `id_registrasi` int(5) NOT NULL,
  `id_buku` int(5) NOT NULL,
  `id_user` int(5) NOT NULL,
  `id_pustakawan` int(5) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `nama_anggota` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD KEY `username` (`username`),
  ADD KEY `username_2` (`username`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `judul` (`judul`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD UNIQUE KEY `id_user_3` (`id_user`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_peminjaman` (`id_peminjaman`),
  ADD KEY `id_user_2` (`id_user`),
  ADD KEY `id_user_4` (`id_user`);

--
-- Indeks untuk tabel `pustakawan`
--
ALTER TABLE `pustakawan`
  ADD PRIMARY KEY (`id_pustakawan`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `registrasi`
--
ALTER TABLE `registrasi`
  ADD PRIMARY KEY (`id_registrasi`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_pustakawan` (`id_pustakawan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `anggota`
--
ALTER TABLE `anggota`
  MODIFY `id_user` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2006;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `anggota` (`id_user`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`username`) REFERENCES `anggota` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
