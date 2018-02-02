import scala.annotation.tailrec

/**
  * P01. (*) Find the last element of a list.
  *
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
object P01 {
  def lastBuiltin(list: List[Int]): Int = list.last

  @tailrec
  def last(list: List[Int]): Int = list match {
    case head :: Nil => head
    case _ :: tail => last(tail)
  }

  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))

    println(lastBuiltin(List(1, 1, 2, 3, 5, 8)))
  }
}
