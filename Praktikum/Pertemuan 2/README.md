## THE OUTPUT OF RUNNING CODE PROGRAM IN ANDROID STUDIO
<table>
    <thead>
        <tr>
            <td></td>
            <td>NIM</td>
            <td>Name</td>
            <td>Class</td>
            <td>Semester</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>:woman_technologist:</td>
            <td>19104025</td>
            <td>Nabilah Sharfina</td>
            <td>S1 SE-03-A</td>
            <td>5</td>
        </tr>
    </tbody>
</table>

# MODUL 2 - Fundamental Kotlin dan Aplikasi "Hello World!"
A. Fundamental Kotlin
<details>
    <summary>Fundamental Theory</summary>
 
 1. Hello World!
    <img src="https://user-images.githubusercontent.com/58089002/152226909-93583837-f129-43a2-a2b5-fe8bc08aec1d.png"></img>
 2. Data Type
    <img src="https://user-images.githubusercontent.com/58089002/152227145-95da090c-65e2-4d56-b55f-b7afe75f2eb9.png"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152227950-b6bad9da-3315-4449-8a01-5a80e9661a04.png"></img>
 3. Characters
    <img src="https://user-images.githubusercontent.com/58089002/152228365-3d9fb267-0929-492b-8456-51aca448d40a.png"></img>
 4. Array
    <img src="https://user-images.githubusercontent.com/58089002/152229064-c3e8f94e-da01-497b-a8d4-46102a928b2a.png"></img>
 5. Functions
    <img src="https://user-images.githubusercontent.com/58089002/152229259-6237ab3a-7f97-4103-8051-9af4df9dc230.png"></img>
 6. If Expressions
    <img src="https://user-images.githubusercontent.com/58089002/152229666-37856ffa-6ffd-46ee-9565-da0dfcda12e4.png"></img>
 7. Elvis Operator
    <img src="https://user-images.githubusercontent.com/58089002/152230441-79cbaa53-a3c6-4209-9cb8-a0ae6eaeb3d6.png"></img>
 8. String Template
    <img src="https://user-images.githubusercontent.com/58089002/152230705-093e2aef-53cf-4291-bab0-8adef6b2bf2b.png"></img>
 9. When Expressions
    <img src="https://user-images.githubusercontent.com/58089002/152231051-64be7324-d67a-4625-9d73-fc9a5fb20473.png"></img>
 10. While Expressions
    <img src="https://user-images.githubusercontent.com/58089002/152231269-4c43be66-7cfe-44a3-8dd3-ec7a3d98d9da.png"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152231590-37724381-e0ab-4cef-84f5-52aff6a62832.png"></img>
 11. For Loop
    <img src="https://user-images.githubusercontent.com/58089002/152231831-497b5aa5-23f6-4322-8299-ddc9f4d40323.png"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152232016-7015bf86-0e41-435c-8b33-5fdaa94a48f3.png"></img>
</details>

B. Membuat Aplikasi "Hello World!" di Android Studio
<details>
    <summary>Create a Project</summary>

1. Membuka Android Studio versi Arctic Fox 2020.3.1
2. Pada halaman utama pilih "Start New Project"
3. Pilih "Empty Activity", lalu next
4. Beri nama proyek "My Firstapp" dengan nama package "com.nama_nim.myfirstapp" menggunakan bahasa Kotlin
5. Atur menjadi minimum API 21
-  Tampilannya seperti berikut:
   <img src="https://user-images.githubusercontent.com/58089002/152164595-e4668d6d-49a1-4862-bf81-4c3c221550f5.png"></img>
</details>
<details>
    <summary>The Components</summary>

1. Folder "app", menampilkan hierarki file dari aplikasi dengan beberapa tampilan. Folder ini mencakup 4 folder, sebagai berikut:
   
    a. manifests

    Pada folder ini berisi AndroidManifest.xml. File ini berisi semua komponen dari aplikasi android dan akan di baca oleh android runtime ketika aplikasi di eksekusi.

    b. java
    
    Semua file dengan bahasa kotlin ada pada folder ini. Pada folder ini terdapat 3 subfolder :
      - com.example.myfirstapp (sesuai dengan nama project yang dibuat, folder ini berisikan file kotlin source code dari project.
      - com.example.myfirstapp (androidTest), folder ini digunakan untuk meletakan instrument testing.
      - com.example.myfirstapp (test), folder ini digunakan untuk meletakan unit tests
  
    c. java (generated)
    
    d. res

    Folder ini berisikan semua berkas pada project, diantaranya gambar, layout file, strings, icons, dan styling.
      - Drawable, semua gambar pada project ada pada folder ini.
      - Layout, semua layout activity ada pada folder ini.
      - Mipmap, folder ini berisikian icons aplikasi.
      - Value, beriskikan beberapa berkas seperti strings dan colors.
    
    e. res (generated)

    f. gradle

2. Tab "Project", menyembunyikan dan menampilkan project view.
3. Tampilan "Android", menampilkan project yang digunakan saat ini.
</details>
<details>
    <summary>View Emulator / Layout Validation</summary>

1. Sambungkan smartphone ke laptop menggunakan USB.
2. Aktifkan USB Debugging  pada fiitur Developer Options.
3. Pilih menu "View" -> "Tools Windows" -> "Emulator" atau pilih folder "res" -> "layout" -> "activity_main.xml" -> "Layout Validation".
   - Tampilannya seperti berikut:
    <img src="https://user-images.githubusercontent.com/58089002/152237589-07077c8d-cd20-415e-b816-2d12a73ce345.jpeg"></img>
</details>

# MODUL 3 - "Hello World!" dan Activity Lifecycle
<details>
    <summary>Hello, World!</summary>
    <img src="https://user-images.githubusercontent.com/58089002/152237580-199f912b-8f6c-4a61-932c-9cab1ca43935.jpeg"></img>
</details>
<details>
    <summary>Activity Lifecycle</summary>

   - Fungsi untuk menampilkan Toast dan Logcat

       - Toast adalah sebuah UI yang mampu menampilkan pesan output menggunakan popup kecil, memiliki batasan sesuai panjang pesan yang di informasikan dan akan menghilang otomatis setelah waktu tertentu [1].

       - Logcat adalah Jendela Android Studio untuk menampilkan pesan sistem, seperti kapan pembersihan sampah memori dilakukan, dan pesan yang telah ditambahkan ke aplikasi dengan class Log. Jendela ini menampilkan pesan secara real time dan menyimpan histori sehingga pesan dapat dlilihat lebih lama. Untuk menampilkan informasi yang diminati saja dapat dibuat sebuah filter, memodifikasi banyaknya informasi yang ditampilkan dalam pesan, menetapkan tingkat prioritas, menampilkan pesan yang dihasilkan oleh kode aplikasi saja, dan menelusuri log. Secara default, logcat menampilkan output log yang terkait dengan aplikasi yang baru saja dijalankan [2].
    <img src="https://user-images.githubusercontent.com/58089002/152242707-54e9ac5d-2a1f-44cd-a397-c8877310cf5b.jpeg"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152242886-1b6afda3-b52a-42c5-b5b7-726c041794f3.png"></img>
</details>
<details>
    <summary>Activity Two Page</summary>
    <img src="https://user-images.githubusercontent.com/58089002/152244239-66c362b2-70bb-4d47-be58-bc01699be012.png"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152244687-864dd62d-3a3b-4f8f-8ee8-081204b74799.png"></img>

   - Output:
    <img src="https://user-images.githubusercontent.com/58089002/152258212-7a496cbf-3f44-4736-a3d5-7cf4f49df435.jpeg"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152258223-d6f47fb2-b9e1-4151-a9dd-c31f248934ff.jpeg"></img>
    <img src="https://user-images.githubusercontent.com/58089002/152258093-f800feec-7e81-4fd1-9587-79d25b372132.png"></img>
</details>
