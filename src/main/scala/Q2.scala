object Q2 {

  def ToFahrenheit(celsius: Float) : Float = (celsius * 1.800f) + 32.00f

  def main(args: Array[String]): Unit = {
    println(ToFahrenheit(35))
  }
}
