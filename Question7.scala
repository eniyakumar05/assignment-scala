object Question7 {
  def test(stng: String, spc: Char): Boolean = {
    var l = stng.length();
    var char_happy = true;
    for (i <- 0 to l - 1) {
      if (stng.charAt(i) == spc) {
        if (i > 0 && stng.charAt(i - 1) == spc)
          char_happy = true;
        else if (i < l - 1 && stng.charAt(i + 1) == spc)
          char_happy = true;
        else
          char_happy = false;
      }
    }
    char_happy;
  }
  def main(args: Array[String]): Unit = {
    var name = "eniya";
    var spc = 'k'
    println("The given string is: " + name);
    println("Is " + spc + " happy in the said string: " + test(name, spc));

    name = "kumar";
    spc = 'a'
    println("The given string is: " + name);
    println("Is " + spc + " happy in the said string: " + test(name, spc));
  }
}

