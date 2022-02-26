# Laporan Pratikum Pertemuan 2

Syahla' Syafiqah Fayra - 2141720015 ( TI - 1F )

## Jawaban Pertanyaan

### 2.2.3 Pertanyaan 
1. Sebutkan 2 karakteristik class/objek!? 

        Ada 2 karakteristik class atau objek yaitu atribut dan method.

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class? 

        kata kuncinya yaitu "class". Contoh penggunaanya adalah 
        class namaClass{

        }

3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan? 
    
        Ada 4 atribut yaitu namaBarang, jenisBarang, stok, hargaSatuan. Deklarasi method atribut terdapat Di line 13 dan 14.

4.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?

        Ada 4 method di dalam class tersebut yaitu tampilBarang, tambahStok, kurangiStok, dan hitungHargaTotal.deklarasi method Terdapat di line 16, 23, 27, dan 31.
5.	Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 

    <img src= kurangistok.PNG>

6.	Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int? 
    
        Karena membutuhkan data dari luar. data tersebut merupakan data stok yang akan ditambahkan.
7.	Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int? 

        Karena method hitungHargaTotal() butuh perhitungan antara integer dan akan menghaSIlkan bilangan integer juga
8.	Menurut Anda, mengapa method tambahStok() memiliki tipe data void? 

        Karena method yambahStok() tidak ada data yang akan dikeluarkan dari method itu.

### 2.3.3 Pertanyaan 
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan? 

        Proses Intasiasi ada pada baris 15 dan objek yang dihasilkan adalah b1.

2.	Bagaimana cara mengakses atribut dan method dari suatu objek? 

        Cara mengakses atribut yaitu dengan menuliskan namaObjek.namaAtribut sedangkan untuk mengakses method bisa dengan cara namaObject.namaMethod();.

### 2.4.3 Pertanyaan
1.	Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan? 

        deklarasi konstruktorberparameter dilakukan pada baris ke 18

2.	Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini?

    <img src=gambar2.PNG>

        Yang dilakukan adalah Melakukan proses instasiasi untuk membuat objek dengan nama b2 sekaligus meberikan nilai kepada atribut dengan menggunakan konstruktor yang sudah dibuat sebelumnya.

3.	Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang. 

    <img src=gambar3.PNG>

### 2.5 Latihan Pratikum
1. Buat program berdasarkan diagram class berikut ini!

    <img src=gambar4.PNG>

    - Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan perkalian antara hargaSatuan dengan jumlah barang yang dibeli
    - Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan sbb:

        A. Jika harga total > 100000, akan mendapat diskon 10%

        B. Jika harga total mulai dari 50000 sampai 100000 akan mendapat diskon sebesar 5%

        C. Jika dibawah 50000 tidak mendapat diskon

        D. Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi Diskon

#### Jawaban 
##### CODE : 
1. tugas1.java

    <img src=code1.PNG>
    <img src=code2.PNG>

2. tugas1main.java

    <img src=code3.PNG>

##### Hasil :
<img src = codeHasil.PNG>

2. Buat program berdasarkan diagram class berikut ini!

    <img src =gambar5.PNG>

    - Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari pacman, sedangkan 
atribut y untuk posisi koordinat y (vertikal)
    - Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height untuk menyimpan panjang area
    - Method moveLeft() digunakan untuk mengubah posisi pacman ke kiri (koordinat x akan berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah

        1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari nilai width

    - Method moveUp() digunakan untuk mengubah posisi pacman ke atas (koordinat y akan berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 

        1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari nilai height

#### Jawaban 
##### CODE : 

1. tugas2.java

    <img src =codeNomor2-1.PNG>
    <img src =codeNomor2-2.PNG>

2. tugas2Main.java

    <img src =codeNomor2-3.PNG>
    <img src =codeNomor2-4.PNG>


##### HASIL :

<img src =hasil.PNG>

<img src =hasil2.PNG> 

<img src =hasil3.png>


