package problems

import scala.util.Random
import P20._

object P23 {

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def rec(m: Int, acc: List[T], curr: List[T], r: util.Random): List[T] = {
      (m, curr) match {
        case (0, _) | (_, Nil) => acc
        case (x, l) => {
          val i = r.nextInt(curr.length)
          val (left, right) = curr.splitAt(i)
          val el = right.head
          rec(m-1, el::acc, left:::right.tail, r)
        }
      }
    }
    rec(n, Nil, list, new util.Random())
  }

  def randomSelectRemove[T](n: Int, list: List[T]): List[T] = {
    def rec(k: Int, curr: List[T], acc: List[T]): List[T] = {
      (k, curr) match {
        case (0, _) | (_, Nil) =>
          acc
        case (x, l) => {
          val (ls, el) = removeAt(Random.nextInt(curr.length), curr)
          rec(k-1, ls, el.get::acc)
        }
      }
    }
    rec(n, list, Nil)
  }
}
