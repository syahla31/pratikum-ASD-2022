# Laporan Pratikum Pertemuan 4
Syahla' Syafiqah Fayra - (TI - 1F)

## Jawaban Pertanyaan

### 4. 2 Pertanyaan 
1.	Jelaskan mengenai base line algoritma divide conquer untuk melakukan pencarian nilai faktorial!
    
        Jawaban :

        Pada class factorial menggunakan if ( n==1) return 1; yang bisa diartikan dengan jika nilai yang di inputkan bernilai 1 maka hasil yang akan di tampilkan oleh program main nya adalah 1 dan bisa berfungsi sebagai batas perulangan, jadi jika n == 1 maka program berhenti
2.	Pada implementasi algoritma divide and conquer faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing – masing bagiannya pada kode program !

        Jawaban :

        A. Divide = membagi masalah menjadi beberapa upa – masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil 
        
    <img src = "jawaban 1-2 a.PNG">

        Pada percobaan faktorial divide ditujuksn oleh adanya pemecahan masalah yang dibagi menjadi 2 upa – masalah yang ditujukan dengan adanya kondisi if – else dimana id sebagai base case dan else sebagai rekursif call

        B.Conquer = memecahkan masing masing upa – masalah secara Rekursif 

    <img src = "jawaban 1-2 b.PNG">

        Pada percobaan faktorial conquer ditujukan oleh adanya penyelesain masalah secara rekursif dimana upa – masalah diselesaikan secara masing – masing yang telah di tunjukkan pada kodingan else yang berisi rumus int fakto = n * FaktorialDC(n-1); yang berfungsi yaitu setiap upa – masalah akan dikalikan masing – masing.

        C.Combine = Menggabungkan solusi masing – masing upa – masalah sehingga membentuk solusi

    <img src = "jawaban 1-2 c.PNG">
        
         Pada percobaan faktorial combine ditujukan oleh adanya penarikan hasil dari keseluruhan yang berupa pengembalian nilai dari proses rekursif pada tahap conquer yang ditulis dengan return fakto; di else dalam method faktorialDC()


3.	Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for ? Buktikan !

    Jawaban :
    
    Memungkinkan, selama masih termasuk looping maka jenis apapun bisa digunakan dan untuk pembuktian saya menggunakan while dan program masih berjalan dengan lancar.
    
    Code :

    <img src = "jawaban 1-3 a.PNG">

    Output :

    <img src = "jawaban 1-3 b.PNG">

4.	Tambahkan pengecekan waktu eksekusi kedua jenis method tersebut !
    
    Jawaban :

    A. Waktu Mulai

    <img src = "jawaban 1-4 a.PNG">

    B. Waktu Selesai

    <img src = "jawaban 1-4 b.PNG">

    C. Waktu Eksekusi

    <img src = "jawaban 1-4 c.PNG">

5.	Buktikan dengan imputan elemen yang diatas 20 angka, apakah ada perbedaan waktu eksekusi ?

    Jawaban :

    Dibawah 20 Angka

    <img src = "jawaban 1-4 d.PNG">

    Diatas 20 Angka

  <img src = "jawaban 1-5 a.PNG">
    
  <img src = "jawaban 1-5 b.PNG">
    
  <img src = "jawaban 1-5 c.PNG">
    
  <img src = "jawaban 1-5 d.PNG">

    Kesimpulan : Iya memiliki perbedaan waktu eksekusi yang kurang dari 20 lebih cepat daripada yang lebih dari 20

### 4.3 Pertanyaan
1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
    
        Jawaban : 

        a.PangkatBF()
        method ini menggunakan cara brute force yang proses nya dilakukan dengan perulangan dan awalnya akan dideklarasikan hasil = 1, setelah itu dilakukan perulangan sampai batasnya / pangkat dan proses selanjutnya yaitu perulangan tersebut dilakukan perulangan dari hasil tadi dikali dengan bilangan yang akan dipangkatkan dan berhent jika sudah tidak sesuai dengan syarat yaitu < n sehingga bilangan yang dipangkatkan akan menghasilkan nilai dari hasil pangkatnya

        b.PangkatDC()
        method ini menggunakan cara divide conquer yang dilakukan dengan rekursif dan prosesnya dibagi menjadi 3 tahap yaitu :
        
        * Divide – memecah masalah menggunakan pemilihan if – else
        * Conquer – penyelesaian dari setiap upa – masalah pada else
        * Combine – menggabungkan menjadi sebuat solusi yang digunakan pada pengembalian di else

2.	Pada method PangkatDC() terdapat potongan program sebagai berikut
 
    <img src = "3 - 2.PNG">
    Jelaskan arti potongan kode tersebut

        Jawaban 

        •Jika n atau pangkat bilangan di modulus 2 hasilnya adalah 1 maka pengembalian nilai nya adalah hasil dari (pangkatDC(a,n/2)*pangkatDC(a, n/2)*a) karena n nya adalah bilangan ganjil

        •Jika n atau pangkat bilangan dimodulus 2 hasilnya tidak 1 maka pengembalian nilai nya adalah hasil dari (pangkatDC(a,n/2)*pangkatDC(a, n/2) karena n nya adalah bilangan genap
3.	Apakah tahap combine sudah termasuk dalam kode tersebut ? Tunjukkan !

        Jawaban :

        Sudah termasuk Tahap Combine di implementaikan pada kode return atau pengembalian nilai yang dimana hasil dari penyelesaian upa – masalah sebelumnya di kembalikan semua dan dalam tahap ini dilakukan pemanggilan hasil
4.	Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor
        
        Jawaban : 
        
        - Code Pangkat

    ``` java 
    public class pangkat {
    public int nilai, pangkat;
    
    public pangkat(int n, int p){ // Konstruktor
        nilai = n;
        pangkat = p;
    }
    
    public int pangkatBP(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }
    
    public int pangkatDC(int a, int n){
        if(n==0) {
            return 1;
        } else {
            if(n%2==1)//bilangan ganjil
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else//bilangan genap
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
    }
    ```

        - Hasil
    <img src = "jawaban 2-4  a.PNG"> 


5.	Tambahkan menu agar salah satu method yang terpilih saja yang akan dilakukan !

    Jawaban :

    - Code :


``` java
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char keluar;
        
    do {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~ MENGHITUNG PANGKAT  ~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
        System.out.println("Menghitung menggunakan :");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu ke (1-3) : ");
        int menu= sc.nextInt();
        
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        int n, p;

        pangkat []png = new pangkat[elemen];
        
        switch(menu){
            case 1 :
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~ menghitung pangkat Brute Force  ~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                for(int i = 0; i < png.length; i++){
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    p = sc.nextInt();
                    png[i] = new pangkat(n,p);
                }

                System.out.println("===============================================");
                System.out.println("====== Hasil Pangkat dengan Brute Force =======");
                System.out.println("===============================================");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBP(png[i].nilai,png[i].pangkat));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                break;
            case 2 :
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~ menghitung pangkat Divide Conquer ~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                
                for(int i = 0; i < png.length; i++){
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    p = sc.nextInt();
                    png[i] = new pangkat(n,p);
                }
                
                System.out.println("===============================================");
                System.out.println("=== Hasil Pangkat dengan Divide and Conquer ===");
                System.out.println("===============================================");
                
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }

                break;
            case 3 :
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~ T E R I M A - K A S I H ~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            default :
                System.out.println("Anda Salah Memasukkan angka !");
                break;
        } if (menu == 3){
            keluar = 'T';
        } else {
            System.out.print("Kembali ke Menu ? (Y/T) : ");
            keluar = sc.next().charAt(0);
        }
    } while (keluar == 'Y' || keluar == 'y');
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
```
    - Hasil Output :

<img src = "jawaban 2-5  a.PNG">

<img src = "jawaban 2-5  b.PNG">


### 4.4 Pertanyaan 
1.	Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()

        Jawaban : 
        
        •TotalBF() menggunakan fungsi perulangan untuk melakukan proses penjumlahan semua elemen array[i] yang akan di inputkan pada operasi penjumlahan variabel total dan kemudian di return atau dikembalikan variabel total yang berupa hasil penjumlahan semua array[i].

        •TotalDC() menggunakan fungsi rekursif untuk melakukan proses penjumlahan semua elemen array [i] yang diimplementasikan dengan if – else if else yang berfungsi untuk membagi masalah menjadi upa – masalah dimana jika 1 == r maka return arr[1], dan jika 1 < r maka terdapat variabel baru yang bernama mid yang merupakan proses perhitungan dari (i+r)/2 maka return hasil penjumlahan 1sum + rsum + arr[mid], dan jika bukan diantara keduanya maka return 0. Pada tahap combine semua penyelesain menjadi sebuah solusi.
2.	Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana memebatasi output dibelakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.

        a. Brute Force

    <img src = "jawaban 3 - 2 b.PNG">

        b. Divide Conquer

    <img src = "jawaban 3 - 2 a.PNG">

        c. Hasil Output
    <img src = "jawaban 3 - 2 c.PNG">


3.	Mengapa terdapat formulasi return value berikut ? Jelaskan !
 ![1](https://user-images.githubusercontent.com/90373287/159505547-434ff7ac-3684-4a5d-aef7-8f9308262dad.PNG)

        Jawaban : 
        Untuk mengembalikan hasil dari semua penjumlahan dari 1sum (kiri), rsum (kanan), dan arr[mid] (tengah) sehingga dari semua penjumlahan tersebut bisa dihitung semua keuntungan yang didapat dari perusahaan dalam waktu tertentu

4.	Kenapa dibutuhkan variable mid pada method TotalDC() ?

        Karena pada medhod tersebut dibagi bagian menjadi kiri dan kanan serta dibutuhkan variable mid untuk menghitung nilai tengah ( antara kiri dan kanan )

5.	Program perhitungan keuntungan suatu perusahan ini hanya satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan. (Setiap perusahaan bisa saja memiliki jumlah bulan berbeda – beda)? Buktikan dengan program !

        - Code Main

``` java
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta Misal 5.9)");
        System.out.println("");
        System.out.print("Masukkaan Jumlah Perusahaan : ");
        int perS = sc.nextInt();
        
        sum sm[] = new sum[perS];
        for (int i = 0; i < sm.length; i++){
            sm[i] = new sum();
            
            System.out.println("============================================================");
            System.out.println("Perusahaan ke- "+(i+1));
            System.out.print("Masukkan Jumlah bulan : ");
            sm[i].elemen = sc.nextInt();
            
            System.out.println("");
            sm[i].keuntungan = new double [sm[i].elemen];
            for (int j = 0; j<sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        sum data = new sum();
        for (int i=0 ; i< sm.length; i++){
            System.out.println("============================================================");
            System.out.println("Perusahaan ke- "+(i+1));
            System.out.println("Jumlah Bulan : "+ sm[i].elemen);
            System.out.println("");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen + " bulan adalah = %.2f ",data.totalBF(sm[i].keuntungan));
            System.out.println("");
            System.out.println("");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen + " bulan adalah = %.2f ", data.totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            System.out.println("");
        }
    }
}
```

    - Hasil Output

<img src = "3 - 5.PNG">

