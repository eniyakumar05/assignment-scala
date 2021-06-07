object Question2 {
  def test(str: String, n: Int): String =
  {
    str.take(n) + str.drop(n + 1)
  }
  def main(args: Array[String]): Unit = {
    println(test("Scala", 1))
    println(test("Scala", 0))
    println(test("Scala", 4))
  }
}



