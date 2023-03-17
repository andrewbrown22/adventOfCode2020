package adventOfCode2021

object DayFour extends App {

   private val dayFourTestCalls: List[Int] = "7,4,9,5,11,17,23".replace(","," ").split(" ").toList.map(_.toInt)

  private val dayFourTestBoards: List[List[List[Int]]] = "7 4 9 5 11\n 8  2 23  4 24\n21  9 14 16  7"
   .split("\n\n").toList.map(_.split("\n").toList).map(_.map(_.split(" ").toList).map(_.filter(_.nonEmpty).map(_.toInt)))

  println(dayFourTestBoards)
  println(dayFourTestCalls)

  def checkBoard(board: List[List[List[Int]]], calls: List[Int]) = {

    board.foldLeft(calls) { (acc, curr) =>
      curr.filterNot(x => x.contains(acc.head)).flatten
    }
  }

  println(checkBoard(dayFourTestBoards, dayFourTestCalls))




}
