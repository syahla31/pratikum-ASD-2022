# Laporan Praktikum Pertemuan 3
Syahla' Syafiqah Fayra - 2141720015 - (TI - 1F)

## Jawaban Pertanyaan

### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!

        Harus memiliki atribut tapi tidak wajib ada method.  Karena atribut dibutuhkan untuk menampung nilai yang akan dimasukkan sedangkan method tidak karena program akan tetap berjalan sesuai dengan main program

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
<img src =3.2-1.PNG>

        Karena kode program tersebut digunakan untuk deklarasi dari array yang berisi pembuatan objek PersegiPanjang pada ppArray index ke-1

3. Apa yang dimaksud dengan kode berikut ini:

      <img src=3.2-2.PNG>

        Untuk membuat array baru dari objek PersegiPanjang. Kode tersebut juga akan membuat array ppArray yang dapat menampung 3 objek PersegiPanjang tapi array tersebut belum ada isinya

4. Apa yang dimaksud dengan kode berikut ini:

      <img src = 3.2-3.PNG>

        Kode tersebut adalah proses intansiasi sebuah persegi panjang pada array yang telah di buat sebelumnya dengan panjang 80 dan lebar 40.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
        
        Karena merupakan berbasis objek maka dibuat class sendiri dengan adanya atribut yang dimiliki


### 3.3.3 Pertanyaan

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

        Iya Bisa.

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
        
    a. code
    
    ``` java
    
        public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        
        persegiPanjang[][] ppArray = new persegiPanjang[2][2];
        
        ppArray[0][1] = new persegiPanjang();
        ppArray[0][1].panjang = 200;
        ppArray[0][1].lebar = 20;
        
        ppArray[1][1] = new persegiPanjang();
        ppArray[1][1].panjang = 100;
        ppArray[1][1].lebar = 10;
        
        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang Array 2 Dimensi ke-" +(i+1));
            System.out.println("Panjang: " + ppArray[i][1].panjang + ", lebar: " + ppArray[i][1].lebar);
            System.out.println("======================================");
        }
        
    }
    ```

    b. Hasil :

      <img src = 3.3-4-jaw.PNG>

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa? 
<img src = 3.3-1.PNG>

        Karena tidak adanya pembuatan objek persegi pada pgArray index ke-5. Untuk mengisikan atribut pada objek didalam array, sebelumnya harus dibuat objeknya terlebih dahulu.

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
<img src = 3.3-2-jaw.PNG>
<img src = 3.3-3-jaw.PNG>

Hasil : 

<img src = 3.3-4-jaw.PNG>

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

        Tidak boleh, karena instansiasi array of object hanya bisa dilakukan satu per satu, tetapi instansiiasi bisa menggunakan perulangan.

### 3.4.3 Pertanyaan

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

2. Jika diketahui terdapat class Segitiga seperti berikut ini:

    <img src = 3.4-1.PNG>

   Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

    <img src = 3.4-2-jaw.PNG>

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut.

    <img src = 3.4-3-jaw.PNG>

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:

      sgArray ke-0 alas: 10, tinggi: 4
      
      sgArray ke-1 alas: 20, tinggi: 10
      
      sgArray ke-2 alas: 15, tinggi: 6
      
      sgArray ke-3 alas: 25, tinggi: 10

    <img src = 3.4-4-jaw.PNG>

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().

    <img src = 3.4-5-jaw.PNG>

   Hasil

   <img src = 3.4-6-jaw.PNG>

### 3.5 Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang (minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.

**JAWABAN**
### code :
a. tabung.java
``` java
public class tabung {
    public int jari, tinggi;
    
    public tabung(int rT, int tT){
        jari = rT;
        tinggi = tT;
    }
    
    public double volume(){
        return 3.14*jari*jari*tinggi;
    }
    
    public double luasPermukaan(){
        double selimut = 2*3.14*jari*tinggi;
        double alas = 2*3.14*jari*jari;
        return selimut*alas;
    }
}
```
b. bola.java
``` java
public class bola {
    public int jari;
    
    public bola(int r){
        jari = r;
    }
    
    public double volume(){
        return (4/3)*3.14*jari*jari*jari;
    }
    
    public double luasPermukaan(){
        return 4*3.14*jari*jari;
    }
}
```
c. kerucut.java
``` java
public class kerucut {
    public int jari, garisPelukis, tinggi;
    
    public kerucut(int rK, int sK, int tK){
        jari = rK;
        garisPelukis = sK;
        tinggi = tK;
    }
    
    public double volume(){
        return 1/ (double)3 *3.14*(jari*jari)*tinggi;
    }
    
    public double luasPermukaan(){
        return 3.14 * jari * (jari + garisPelukis);
    }
}
```
d. bangunRuang.java
``` java
public class bangunRuang {
    
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~ T A B U N G ~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Tabung : ");
        int tabungS = scS.nextInt();
        int rT, tT;
        
        tabung[] tbArrayS = new tabung[tabungS];
        System.out.println("====================================");
        for (int i = 0; i < tbArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rT = scS.nextInt();
            System.out.print("Masukkan tinggi "+(i+1)+": ");
            tT = scS.nextInt();
            tbArrayS[i] = new tabung(rT, tT);
            System.out.println("====================================");
        }
        for (int i = 0; i < tbArrayS.length; i++){
            System.out.println("Tabung ke - "+(i+1));
            System.out.println("Jari - jari : "+tbArrayS[i].jari);
            System.out.println("Tinggi : "+tbArrayS[i].tinggi);
            System.out.println("------------------------------------");
            System.out.println("Volume tabung "+(i+1)+": "+tbArrayS[i].volume());
            System.out.println("Luas Permukaan tabung "+(i+1)+": "+tbArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~ B O L A ~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Bola : ");
        int bolaS = scS.nextInt();
        int rB;
        
        bola[] bArrayS = new bola[bolaS];
        System.out.println("====================================");
        for (int i = 0; i < bArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rB = scS.nextInt();
            bArrayS[i] = new bola(rB);
            System.out.println("====================================");
        }
        
        for (int i = 0; i < bArrayS.length; i++){
            System.out.println("Bola ke - "+(i+1));
            System.out.println("Jari - jari : "+bArrayS[i].jari);
            System.out.println("------------------------------------");
            System.out.println("Volume Bola "+(i+1)+": "+bArrayS[i].volume());
            System.out.println("Luas Permukaan Bola "+(i+1)+": "+bArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~ K E R U C U T ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Kerucut : ");
        int keS = scS.nextInt();
        int rK, sK, tK;
        
        kerucut[] kArrayS = new kerucut[keS];
        System.out.println("====================================");
        for (int i = 0; i < kArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rK = scS.nextInt();
            System.out.print("Masukkan Garis Pelukis "+(i+1)+": ");
            sK = scS.nextInt();
            System.out.print("Masukkan Tinggi "+(i+1)+": ");
            tK = scS.nextInt();
            System.out.println("====================================");
            kArrayS[i] = new kerucut(rK,sK,tK);
        }
        
        for (int i = 0; i < kArrayS.length; i++){
            System.out.println("====================================");
            System.out.println("Kerucut ke- "+(i+1));
            System.out.println("Jari - jari : "+kArrayS[i].jari);
            System.out.println("Garis Pelukis : "+kArrayS[i].garisPelukis);
            System.out.println("Tinggi : "+kArrayS[i].tinggi);
            System.out.println("------------------------------------");
            System.out.println("Volume Kerucut "+(i+1)+": "+kArrayS[i].volume());
            System.out.println("Luas Permukaan Kerucut "+(i+1)+": "+kArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
    }
}
```
### Hasil : 
<img src = tabung.PNG> <img src = bola.PNG> <img src = kerucut.PNG>

2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang ada. Contoh output program: 

   <img src =  3.5-2.PNG>

**JAWABAN**
### code :
a. tanah.java
``` java
public class tanah {
    public int panjang, lebar;
    
    public int luasTanah(){
        return panjang*lebar;
    }
    
    public int tanahTerluas(int luas[]) {
        int terluas = 0;
        int s = 0;
        
        for(int i = 0; i < luas.length; i++){
            if(luas[i]>terluas){
                terluas = luas[i];
                s = i;
            }
        }
        return s;
    }
}
```
b. arrayTanah.java
``` java
public class arrayTanah {
    
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println("|||||||| Jual Beli Tanah ||||||||");
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.print("Masukkan Jumlah Tanah : ");
        int n = scS.nextInt();
        tanah[] tArrayS = new tanah[n];
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            tArrayS[i] = new tanah();
            System.out.println("===========================");
            System.out.println("Tanah "+(i+1));
            System.out.println("---------------------------");
            System.out.print("Masukkan Panjang : ");
            tArrayS[i].panjang = scS.nextInt();
            System.out.print("Masukkan Lebar : ");
            tArrayS[i].lebar = scS.nextInt();
            System.out.println("---------------------------");
        }
        
        System.out.println();
        for( int i = 0; i < n; i++){
            
            System.out.println("Luas Tanah "+(i+1)+": " +tArrayS[i].luasTanah());
        }
        
        System.out.println();
        int s = 0;
        int luas[] = new int[n];
        
        for(int i = 0; i < n; i++){
            luas[i] = tArrayS[i].luasTanah();
        }
        
        s = tArrayS[0].tanahTerluas(luas);
        System.out.println("Tanah Terluas Adalah : Tanah " +(s+1));
    }
}
```
### Hasil :
<img src = tanah.PNG>

3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

   <img src = 3.5-3.PNG>

**JAWABAN**
### code :
a. Mahasiswa.java
``` java
public class mahasiswa {
    public int NIM;
    public String nama, jenisKelamin;
    public double IPK;
    
    public mahasiswa(int nim, String nm, String jk, double ipk){
        NIM = nim;
        nama = nm;
        jenisKelamin = jk;
        IPK = ipk;
    }
}
```
b. arrayMahasiswa.java
``` java
public class arrayMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~ DATA MAHASISWA ~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int ms = sc.nextInt();
        int nim;
        String nm,jk;
        double ipk;
        
        System.out.println();
        
        mahasiswa[] msArrayS = new mahasiswa[ms];
        
        
        for (int i = 0; i < msArrayS.length; i++) {
            System.out.println("Data Mahasiswa "+(i+1));
            System.out.print("Masukkan Nama : ");
            nm = sc.next();
            System.out.print("Masukkan NIM : ");
            nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            jk = sc.next();
            System.out.print("Masukkan IPK : ");
            ipk = sc.nextDouble();
            msArrayS[i] = new mahasiswa(nim,nm,jk,ipk);
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < msArrayS.length; i++) {
            System.out.println("Data Mahasiswa "+(i+1));
            System.out.println("Nama : "+msArrayS[i].nama);
            System.out.println("NIM : "+msArrayS[i].NIM);
            System.out.println("Jenis Kelamin : "+msArrayS[i].jenisKelamin);
            System.out.println("Nilai IPK : "+msArrayS[i].IPK);
            System.out.println("================================");
        }
    }
}
```
### Hasil :
<img src = mahasiswa1.PNG> <img src = mahasiswa2.PNG>