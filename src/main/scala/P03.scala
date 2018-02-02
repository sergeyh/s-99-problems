import scala.annotation.tailrec

/**
  * P03. (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  *
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object P03 {
  def nthBuiltin(n: Int, list: List[Int]): Int = list(n)

  @tailrec
  def nth(n: Int, list: List[Int]): Int = (n, list) match {
    case (0, head :: _) => head
    case (num, _ :: tail) => nth(num - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))

    println(nthBuiltin(2, List(1, 1, 2, 3, 5, 8)))
  }
}
