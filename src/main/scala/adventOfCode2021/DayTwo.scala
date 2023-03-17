package adventOfCode2021

object DayTwo extends App {
  val input = "forward 1\ndown 6\nforward 8\nup 3\ndown 1\ndown 4\ndown 7\ndown 3\ndown 6\nup 8\ndown 3\nforward 8\nup 4\nforward 8\nup 5\ndown 3\nup 2\nforward 3\nforward 1\nforward 1\nup 4\ndown 6\nforward 5\ndown 7\ndown 1\ndown 5\ndown 6\nup 5\ndown 2\nforward 7\ndown 9\nforward 5\nup 6\nforward 2\ndown 2\ndown 2\ndown 1\nforward 6\nforward 8\nup 5\ndown 6\ndown 7\nforward 5\nup 7\ndown 9\ndown 9\ndown 3\ndown 3\nforward 1\ndown 2\nup 8\ndown 1\ndown 7\ndown 4\nforward 6\nup 8\nup 8\nup 5\nup 4\ndown 9\nforward 4\ndown 3\ndown 8\nup 8\nup 7\ndown 3\nforward 2\nforward 3\nforward 4\nforward 9\nup 2\nforward 9\nup 5\nup 9\ndown 9\nforward 2\ndown 7\ndown 2\nforward 7\ndown 3\ndown 9\ndown 8\nup 3\nup 4\ndown 8\ndown 8\nup 7\nup 7\nup 2\nup 9\nup 6\nforward 7\nforward 9\nforward 1\nup 9\ndown 2\nforward 9\ndown 6\nforward 6\ndown 5\nup 2\nforward 5\nforward 2\ndown 6\ndown 3\nforward 4\nup 9\ndown 8\ndown 1\ndown 9\ndown 2\ndown 5\nforward 6\nforward 2\nforward 4\ndown 5\ndown 8\nforward 2\nforward 1\nforward 3\nforward 4\nup 4\nforward 7\ndown 4\nup 1\nup 2\ndown 5\ndown 7\nup 3\nforward 6\nup 2\ndown 1\ndown 4\ndown 3\nforward 8\nforward 4\ndown 7\nup 8\ndown 8\ndown 1\nforward 9\ndown 3\nforward 1\ndown 2\nup 4\ndown 4\ndown 5\nup 3\nup 1\nup 2\nforward 7\nforward 4\nforward 3\ndown 4\nforward 7\nforward 7\nforward 8\nforward 9\ndown 7\nforward 9\nforward 8\nup 2\nup 9\nforward 3\nforward 1\ndown 3\nforward 3\nup 7\nup 1\nforward 4\ndown 1\nup 9\nup 2\ndown 9\nforward 4\nforward 7\ndown 2\nforward 7\nforward 6\nup 7\nforward 8\nup 7\nup 2\ndown 8\ndown 6\ndown 6\nforward 7\ndown 8\ndown 1\nforward 3\ndown 1\ndown 9\nforward 5\nup 1\nforward 6\nup 8\ndown 1\nforward 4\nforward 6\nup 4\nup 8\nforward 5\nforward 4\nforward 7\ndown 2\nup 6\nforward 7\nforward 1\nforward 5\ndown 6\nforward 3\nforward 4\nforward 2\nforward 8\ndown 5\nforward 2\nup 3\nforward 2\nforward 4\nup 2\ndown 5\ndown 5\nforward 4\nforward 1\ndown 1\nup 9\nforward 4\nforward 9\nup 4\nup 4\nforward 6\ndown 6\nforward 6\nforward 7\ndown 2\nforward 8\nforward 6\ndown 4\ndown 3\ndown 5\ndown 5\nup 2\ndown 6\nup 5\nup 4\ndown 8\ndown 7\ndown 9\ndown 7\nforward 5\nup 5\nforward 4\nforward 8\ndown 4\nup 4\nup 7\nforward 8\nup 4\nup 2\nforward 6\nup 3\ndown 1\nforward 6\nforward 3\nup 2\nforward 2\nforward 8\nforward 8\nforward 2\ndown 9\ndown 4\nforward 8\nforward 9\ndown 3\nforward 5\nup 7\ndown 6\nup 2\nup 6\nup 8\nforward 7\ndown 1\nup 7\ndown 7\nforward 1\nforward 5\nforward 4\ndown 8\nforward 4\ndown 8\nforward 1\ndown 7\ndown 8\nforward 1\nforward 2\ndown 3\ndown 3\nup 4\nforward 7\ndown 2\nforward 9\nup 8\ndown 1\nforward 5\nforward 6\nforward 5\nforward 3\ndown 6\ndown 1\nup 4\ndown 9\nforward 8\nup 2\ndown 5\nforward 1\nup 2\ndown 8\ndown 9\nforward 6\nup 8\ndown 5\ndown 5\ndown 7\nup 6\nup 4\nup 3\nup 7\nup 3\ndown 5\nforward 9\nup 6\ndown 1\ndown 8\ndown 8\nforward 9\nforward 3\nforward 7\nforward 3\nforward 1\nup 7\ndown 3\ndown 6\nforward 8\nup 5\nforward 6\ndown 6\nforward 3\ndown 1\nup 8\nforward 5\nforward 9\nup 1\nup 1\nforward 9\nup 1\nforward 4\nforward 1\nforward 7\ndown 6\nup 1\nforward 4\nup 7\ndown 2\ndown 1\nforward 2\nup 4\nforward 3\ndown 4\nup 7\ndown 9\ndown 9\nforward 8\ndown 4\nup 7\ndown 4\nforward 2\nup 7\nforward 2\nforward 4\ndown 5\nforward 4\ndown 6\nforward 9\nforward 1\nforward 5\nforward 7\nup 5\ndown 9\ndown 5\ndown 5\nup 7\nforward 7\nforward 6\nup 7\nforward 8\nup 2\nforward 5\ndown 9\nup 3\ndown 5\nforward 4\ndown 7\nup 8\nup 8\ndown 3\ndown 2\ndown 7\ndown 9\nforward 6\nforward 9\nforward 9\nforward 2\ndown 2\nforward 4\nforward 7\nup 2\nup 5\nforward 8\ndown 1\ndown 1\ndown 9\ndown 2\nforward 1\nup 5\nforward 6\ndown 1\nforward 8\nup 2\nup 4\ndown 3\nforward 6\nforward 3\ndown 4\nforward 9\ndown 6\ndown 9\nup 2\ndown 4\ndown 6\nforward 3\nup 4\ndown 4\nup 9\nforward 4\nforward 9\nforward 2\nforward 8\ndown 9\nup 5\nforward 8\ndown 1\nforward 8\nup 1\ndown 1\nforward 7\nup 6\ndown 2\nup 1\ndown 8\ndown 4\nforward 3\ndown 3\nforward 6\nforward 1\nforward 9\ndown 5\ndown 9\ndown 6\ndown 2\nforward 4\ndown 6\ndown 5\nup 3\nup 1\ndown 8\nforward 7\nforward 5\ndown 8\ndown 4\ndown 2\nforward 5\nforward 2\nforward 5\ndown 5\nforward 7\ndown 9\ndown 1\nforward 2\ndown 4\ndown 1\nforward 6\nup 2\nup 6\nforward 7\ndown 1\nup 5\ndown 6\nforward 3\nup 3\nforward 5\nforward 5\ndown 4\nforward 4\ndown 8\ndown 2\nup 3\nup 4\ndown 9\nup 5\ndown 6\nforward 6\nforward 6\nup 9\nup 2\nforward 3\ndown 5\ndown 9\nforward 2\nup 3\nforward 7\nforward 1\nup 9\ndown 8\nup 9\nforward 4\nforward 4\nforward 8\ndown 4\ndown 2\ndown 5\ndown 7\ndown 9\nup 2\ndown 1\nforward 7\ndown 4\ndown 1\nforward 2\ndown 3\nup 5\nup 1\ndown 3\ndown 4\nup 4\ndown 7\nforward 6\nforward 3\nforward 4\ndown 5\nup 3\nup 9\nforward 2\ndown 8\nup 2\ndown 7\ndown 2\nup 3\nforward 5\nforward 7\nup 4\ndown 3\ndown 1\nforward 5\nforward 2\nup 3\nup 6\nforward 8\ndown 5\nforward 5\ndown 7\ndown 5\nup 7\ndown 8\nforward 5\ndown 9\nup 5\nforward 8\nforward 6\nforward 7\ndown 9\nup 9\nforward 3\ndown 8\nforward 1\nforward 5\nforward 9\ndown 9\ndown 2\ndown 6\ndown 7\nforward 8\ndown 6\ndown 8\nup 8\ndown 2\nforward 2\nup 5\nup 3\ndown 1\ndown 7\ndown 6\nforward 4\nup 5\nforward 6\nup 8\nforward 3\nup 6\nforward 3\ndown 5\nforward 8\nforward 8\nup 6\nforward 5\ndown 4\ndown 7\ndown 5\ndown 9\nforward 2\nforward 9\ndown 9\nforward 8\ndown 4\nforward 4\nforward 1\ndown 8\ndown 1\ndown 9\ndown 5\nforward 4\nup 6\ndown 7\ndown 1\nup 4\ndown 4\ndown 6\ndown 4\nup 8\ndown 2\nforward 1\nforward 4\ndown 1\ndown 1\nup 2\nforward 5\nup 5\ndown 9\nforward 3\ndown 3\nforward 6\nforward 4\ndown 6\nforward 2\nup 7\nup 8\nup 2\nup 8\nup 8\ndown 8\nforward 4\ndown 1\nforward 2\nforward 9\nup 3\ndown 2\ndown 1\nup 4\ndown 9\ndown 6\nforward 9\ndown 6\ndown 8\ndown 9\nforward 2\nup 7\nforward 1\ndown 8\ndown 7\ndown 8\nup 3\nforward 3\nup 7\nforward 7\ndown 9\ndown 3\ndown 2\ndown 5\nforward 9\nup 1\ndown 7\nforward 5\nforward 4\nforward 8\nup 6\ndown 7\nforward 5\nup 5\ndown 1\nforward 4\nforward 9\ndown 2\nforward 8\nup 9\ndown 8\nforward 8\nup 6\nforward 3\nforward 1\nup 5\ndown 6\nforward 8\nup 7\ndown 1\ndown 7\ndown 3\nforward 7\ndown 9\ndown 5\ndown 2\nforward 2\ndown 4\ndown 1\nforward 8\ndown 4\nup 1\nforward 4\ndown 7\nforward 6\ndown 5\nup 8\nforward 1\nforward 2\nup 5\ndown 7\nforward 6\ndown 7\nforward 6\ndown 8\ndown 2\nup 3\ndown 6\nforward 1\ndown 5\ndown 8\ndown 2\nforward 6\nup 4\nforward 4\ndown 1\nforward 9\nforward 8\nforward 4\nforward 9\ndown 8\ndown 8\nup 1\nup 3\ndown 8\ndown 4\nforward 4\ndown 6\nup 7\ndown 8\ndown 3\ndown 2\ndown 7\ndown 5\ndown 7\nforward 3\ndown 6\nforward 6\ndown 1\nforward 7\ndown 9\nforward 2\ndown 7\nforward 1\nup 9\ndown 5\nup 6\ndown 2\nup 4\nforward 5\nforward 2\nforward 6\ndown 2\nforward 5\ndown 3\nforward 6\nup 7\nup 5\nup 3\nup 5\nup 4\ndown 8\nup 8\nforward 3\ndown 2\ndown 1\nforward 2\ndown 8\ndown 8\ndown 1\nup 7\ndown 1\nforward 6\ndown 5\nforward 7\nup 3\nup 4\nforward 9\ndown 3\ndown 1\ndown 6\nforward 1\nforward 6\nforward 2\nforward 5\ndown 7\ndown 5\ndown 2\nforward 6\ndown 7\nforward 2\ndown 4\ndown 8\nforward 2\nforward 2\nup 5\nforward 5\ndown 5\ndown 4\nup 7\ndown 3\nforward 2\ndown 7\nforward 2\nforward 5\ndown 8\nup 3\nforward 4\nforward 4\ndown 2\ndown 9\ndown 5\nforward 2\nforward 7\ndown 7\ndown 1\ndown 5\ndown 1\ndown 4\ndown 9\ndown 2\nforward 9\nforward 8\ndown 4\nforward 9\ndown 9\ndown 7\ndown 6\ndown 2\nforward 5\ndown 4\nup 3\nforward 2\nup 5\nforward 7\nup 6\nforward 3\nforward 1\nforward 3\ndown 7\nforward 8\ndown 1\nforward 1\nforward 5\nforward 5\nup 4\ndown 7\ndown 8\nforward 4\ndown 6\nforward 1\nforward 7\ndown 5\ndown 9\nforward 2\ndown 3\ndown 5\nforward 4\nforward 5\nforward 1\ndown 1\ndown 6\ndown 9\nforward 1\nforward 1\nup 5\nforward 3\nup 3\nup 5\ndown 2\nforward 6\nforward 3\ndown 4\nup 3\ndown 8\ndown 4\nup 3\ndown 7\nforward 7\nup 3\ndown 3\ndown 8\ndown 4\ndown 5\ndown 3\nup 1\nforward 4\nforward 1\ndown 5\nup 8\nup 9\nforward 1\nup 8\ndown 3\nforward 8\nup 4\nforward 5\nforward 5\nup 1\ndown 6\ndown 2\nup 3\nup 7\nforward 7\ndown 7\nup 9\nforward 2\nforward 8\nforward 2\nup 7\nforward 3\ndown 8\ndown 7\nforward 6\ndown 9\nforward 4\nforward 9\nforward 2\ndown 2\ndown 6\ndown 8\nforward 6\ndown 5\nforward 7\nup 8\ndown 6\nforward 5\ndown 6\nforward 1\nforward 5\nforward 1\nup 9\nforward 3\ndown 9\ndown 7\nforward 3\nup 6\ndown 9\ndown 6\ndown 9\nforward 3\nforward 5\nup 3\nup 9\ndown 1\ndown 8\ndown 4\nforward 6\ndown 9\nforward 4\nforward 3\ndown 8\nforward 5\nforward 6\nforward 5\nforward 1\nforward 7\nforward 8\ndown 4\nforward 9\nup 3\ndown 3\nforward 6\ndown 2\nforward 7\ndown 2\nforward 8\nforward 3"
    .split("\n").toList.map(_.split(" ").toList)

//  val forwardList: Int = input.filter(_.contains("forward")).map(x => x.replace("forward", " ").trim).map(_.toInt).sum
//  val downList: Int = input.filter(_.contains("down")).map(x => x.replace("down", " ").trim).map(_.toInt).sum
//  val upList: Int = input.filter(_.contains("up")).map(x => x.replace("up", " ").trim).map(_.toInt).sum
//
//  val x = downList - upList
//  val y = forwardList * x

//  println(forwardList)
//  println(downList)
//  println(upList)
//  println(y)

  //Part 2
  // down INCREASES aim,
  // up DECREASES aim,
  // forward MULTIPLIES aim, INCREASES horizontal

  val dayTestData: List[List[String]] = "forward 5\ndown 5\nforward 8\nup 3\ndown 8\nforward 2".split("\n").toList.map(_.split(" ").toList)

  val turnToTuple: List[(String, Int)] = input.map {
    case List(a, b: String) => (a, b.toInt)
  }

  private val aim: List[(Int, (String, Int))] = turnToTuple.scanLeft(0){ (acc, curr) =>
    if (curr._1 == "up") acc - curr._2
    else if (curr._1 == "down") acc + curr._2
    else acc
  } zip turnToTuple.map(x => (x._1, x._2))

  val testFilter: List[(Int, (String, Int))] = aim.filter(x =>x._2._1 == "forward")

  val test = testFilter.map { x =>
    if (x._2._1 == "forward") x._1 * x._2._2
  }.map(_.toString.toInt).sum

  private val horizontal = turnToTuple.foldLeft(0) { (acc, curr) =>
    if (curr._1 == "forward") acc + curr._2
    else acc
  }

  println(test * horizontal)




}
