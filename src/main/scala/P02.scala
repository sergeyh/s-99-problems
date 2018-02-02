import scala.annotation.tailrec

/**
  * P02. (*) Find the last but one element of a list.
  *
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */

object P02 {
  def penultimateBuiltin(list: List[Int]): Int = list.init.last

  @tailrec
  def penultimate(list: List[Int]): Int = list match {
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)
    case Nil => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))

    println(penultimateBuiltin(List(1, 1, 2, 3, 5, 8)))
  }
}
