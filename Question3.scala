object Question3{
  def test(str1: String): String =
  {
    val len = str1.length
    val last = str1.charAt(len - 1)
    last + str1 + last
  }
  def main(args: Array[String]): Unit = {
    println(test("Scala"))
  }
}

