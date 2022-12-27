import scala.io.StdIn.readDouble

object Main {
  def main(args: Array[String]): Unit = {
    // a.
    var msg = "Hello, Scala!"
    println(msg)
    msg = msg.toLowerCase
    println(msg)
    msg = msg.replace("!", "")
    println(msg)
    msg += " and goodbye python!"
    println(msg)

    // b.
    println("Годовой доход - ")
    val year = readDouble().toInt
    println("Размер премии - ")
    val prem = readDouble().toInt
    println("Питание - ")
    val pit = readDouble().toInt
    val res_month = ((year + (year * prem / 100) + pit) * 0.87) / 12
    println(String.format("%(.3f", res_month))

    // c.
    val list1 = List[Double](100, 150, 200, 80, 120, 75)
    val mean = list1.sum / list1.size
    val dev = ((res_month / mean) * 100) - 100
    println(list1)
    println(String.format("%(.2f", dev) + " %")

    // d.
    val new_item = mean + 10
    val list2 = list1 :+ new_item
    val max = list2.max
    val min = list2.min
    println(list2)
    println("MAX: " + max +", MIN: " + min)

    // e.
    val list_tmp = list2 ++ List[Double](350, 90)
    val list3 = list_tmp.sorted
    println(list3)

    // f.
    val size1 = list3.size - 1
    val new_s = 130.0
    var list4 = List[Double]()
    for (i <- 0 to size1) {
      if (i < size1) {
        if (i == 0 && list3(i) > new_s) {
          list4 = list4 :+ new_s :+ list3(i)
        } else {
          if (list3(i) < new_s && list3(i + 1) > new_s) {
            list4 = list4 :+ list3(i) :+ new_s
          } else {
            list4 = list4 :+ list3(i)
          }
        }
      } else {
        if (list3(i) < new_s) {
          list4 = list4 :+ list3(i) :+ new_s
        } else {
          list4 = list4 :+ list3(i)
        }
      }

    }
    println(list4)

    // g.
    println("Введите минимальную зарплату для уровня middle")
    val x = readDouble()
    println("Введите максимальную зарплату для уровня middle")
    val y = readDouble()
    val size2 = list4.size - 1
    var list5 = List[Double]()
    for (i <- 0 to size2) {
      if (list4(i) >= x && list4(i) <= y) {
        list5 = list5 :+ list4(i)
      }
    }
    println(list5)

    // h.
    println("indexed 7%:")
    val size3 = list4.size - 1
    var list6 = List[Double]()
    var tmp = 0.0
    for (i <- 0 to size3) {
      tmp = list4(i) + list4(i) * 0.07
      list6 = list6 :+ tmp
    }
    println(list6)
  }
}