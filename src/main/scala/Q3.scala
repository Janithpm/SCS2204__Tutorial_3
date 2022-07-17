object Q3 {

  def Volume(r: Float) : Double = 4.0f / 3.0f * math.Pi * r * r * r

  def main(args: Array[String]): Unit = {
    println(Volume(5))
  }
}
