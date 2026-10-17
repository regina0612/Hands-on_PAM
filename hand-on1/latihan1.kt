fun describeProfile(nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {
    val umurteks = umur?.toString()?.plus("tahun") ?: "tidak diketauhi"
    return "Nama: $nama, Umur: $umurteks, Kota: $kota"
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}
