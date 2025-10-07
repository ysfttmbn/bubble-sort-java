# bubble-sort-java

Bubble sort memiliki kompleksitas algoritma O(n²) karena cara kerjanya yang membandingkan setiap elemen dalam array dengan elemen di sebelahnya, dan menukarnya jika urutannya salah. Proses ini diulang terus-menerus sampai seluruh array terurut. 
Contohnya pada kode yang saya buat :

```java
for (int i = 0; i < n - 1; i++) { 		          // loop luar
            for (int j = 0; j < n - 1; j++) {	  // loop dalam
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
```
    
Loop luar: menentukan jumlah pass (sekitar n kali).

Loop dalam: membandingkan elemen bersebelahan pada setiap pass.

Karena ada dua loop bersarang (nested loop), jumlah operasi Bubble Sort bertambah sebanding dengan n² saat jumlah data membesar, atau Operasinya tumbuh secara kuadratik seiring pertambahan jumlah elemen n
Itulah sebabnya kompleksitas Bubble Sort adalah O(n²).
