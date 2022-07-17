object Q4 {

  val price = 24.95f
  val discount = 0.4f
  val shippingCostForEach__First50 = 3.00f
  val shippingCostForEach__Additional = 0.75f

  def TotalPrice(copies: Int) : Float = copies * price

  def DiscountedPrice(totalPrice: Float) : Float = totalPrice * (1 - discount)

  def ShippingCost(copies: Int) : Float = copies > 50 match {
    case true => 50 * shippingCostForEach__First50 + (copies - 50) * shippingCostForEach__Additional
    case false => copies * shippingCostForEach__First50
  }

  def TotalWholeSaleCost(copies: Int) : Float = {
    val totalPrice = TotalPrice(copies)
    val discountedPrice = DiscountedPrice(totalPrice)
    val shippingCost = ShippingCost(copies)
    discountedPrice + shippingCost
  }

  def main(args: Array[String]): Unit = {
    println(TotalWholeSaleCost(60))
  }

}
