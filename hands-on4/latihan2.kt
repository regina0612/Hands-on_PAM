data class Transaksi(val id: String, val kategori: String, val nominal: Int)

fun totalPerKategori(transaksi: List<Transaksi>): Map<String, Int> {
  val kelompok = transaksi.groupBy{it.kategori}
  val total = kelompok.mapValues{
    data -> val daftarTransaksi = data.value
    val jumlah = daftarTransaksi.sumOf{transaksi -> transaksi.nominal}
    jumlah
  }
  return total
}

fun transaksiById(transaksi: List<Transaksi>): Map<String, Transaksi> {
  val hasil = transaksi.associateBy{it.id}
    return hasil 
}

fun main() {
    val transaksi = listOf(
        Transaksi("TRX01", "Makanan", 50_000),
        Transaksi("TRX02", "Transportasi", 20_000),
        Transaksi("TRX03", "Makanan", 35_000),
        Transaksi("TRX04", "Hiburan", 100_000),
        Transaksi("TRX05", "Transportasi", 15_000)
    )

    println("Total per kategori: ${totalPerKategori(transaksi)}")

    val byId = transaksiById(transaksi)
    println("Cari TRX03: ${byId["TRX03"]}")
}
