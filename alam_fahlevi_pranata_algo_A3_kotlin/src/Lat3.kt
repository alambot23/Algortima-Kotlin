fun main() {
//   judul
    println("tugas kotlin Algo A3")
    println("========================Algoritma==========================")

    /*    a = ?
          b = ?
          c = (a*b)/a
          d = c * a
    */
//    deklarasi variabel a
    print("Masukkan nilai a = ")
    val a : Int = readln()!!.toInt()
//    deklarasi variabel b
    print("masukkan nilai b ")
    val b :  Int = readln()!!.toInt()

//    operaskan (a*b)/a  dan masukkan kedalam variabel c
    val c : Int = (a*b)/a
//    operasikan c * a dan masukkan kedalam variabel d
    val d : Int = c*a

//    ouputkan hasil c dan d

    println("hasil dari $a * $b dan di bagi $a adalah $c")
    println("hasil dari $c * $a adalah $d")
}