object Q5 {

  val minPerKm__EasyPace = 8
  val minPerKm__TempoPace = 7

  def RunningTime(pace: Array[Int], minPerKm: Int) : Int = {
    var temp = 0
    for (d <- pace) temp = temp + (d * minPerKm)
    temp
  }

  def TotalRunningTime(easyPace: Array[Int], tempoPace: Array[Int]): Int = RunningTime(easyPace, minPerKm__EasyPace) + RunningTime(tempoPace, minPerKm__TempoPace)

  def main(args: Array[String]): Unit = {
    val easy = Array(2, 2)
    val tempo = Array(3)

    println(TotalRunningTime(easy, tempo))
  }
}
