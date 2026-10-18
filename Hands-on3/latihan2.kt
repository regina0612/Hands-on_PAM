fun <T :  Comparable<T>> findMax(items: List<T>): T {
  if (items.isEmpty()){
    throw IllegalArgumentException("List ga boleh kosong")
  }
  var max = items[0]
    for(i in items) {
      if(i.compareTo(max) > 0){
        max = i
      }
    }
    return max
}

fun main() {
    println(findMax(listOf(3, 7, 2, 9, 4)))          
    println(findMax(listOf(1.5, 2.8, 0.3)))        
    println(findMax(listOf("apel", "jeruk", "duku"))) 
}
