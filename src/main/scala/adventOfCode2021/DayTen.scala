package adventOfCode2021

object DayTen extends App {

  val testInput = "[<([((<(<<{{{[{}[]][<>{}]}[{[]()}{[]<>}]}<({(){}}<()<>>]"

  def replacePairs(input: String): String = {
    if (input.contains("()")) {
     val x = input.replace("()", "").trim
      replacePairs(x)
    } else if (input.contains("{}")) {
     val y = input.replace("{}", "").trim
      replacePairs(y)
    } else if (input.contains("[]")) {
      val z = input.replace("[]","").trim
      replacePairs(z)
    } else if (input.contains("<>")) {
      val zz = input.replace("<>","").trim
      replacePairs(zz)
    } else input
  }


  println(replacePairs(testInput))
  println(testInput)

}
