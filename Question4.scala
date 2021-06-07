object Question4{
  def test(str: String): String =
  {
    if (str.startsWith("if"))
      str else "if " + str
  }
  def main(args: Array[String]): Unit = {
    println(test("if else"));
    println(test("else"));
  }
}

