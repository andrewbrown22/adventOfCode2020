import scala.{List => _, Nil => _}

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ints: List[Double]): Double = ints match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }

  def apply[A](xs: A*): List[A] = ???

  def tail[A](xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case Cons(x, xs) => xs
  }

  def setHead[A](xs: List[A], newHead: A): List[A] = xs match {
    case Nil => Nil
    case Cons(x, xs) => Cons(newHead, xs)
  }

  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Nil => Nil
  }


}

List.tail(List(1,2,3,4))


