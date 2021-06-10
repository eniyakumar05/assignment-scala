object question1{
  def test(country: String): String =
  {
    if (country .length < 2) country
    else country.substring(0, 2) * 4
  }

  def main(args: Array[String]): Unit = {
    println(test("India"));
  }
}
