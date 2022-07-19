object Q5 {

  val minPerKm__EasyPace = 8
  val minPerKm__TempoPace = 7

  def RunningTime(distance: Int, minPerKm: Int) : Int = distance * minPerKm

  def TotalRunningTime(): Int = RunningTime(2, minPerKm__EasyPace) + RunningTime(3, minPerKm__TempoPace) + RunningTime(2, minPerKm__EasyPace)

  def main(args: Array[String]): Unit = {
    println(TotalRunningTime())
  }
}
