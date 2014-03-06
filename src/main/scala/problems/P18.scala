package problems

import P17._

object P18 {

  def sliceDrop[T](from: Int, to: Int, list: List[T]): List[T] = {
    if (from >= to || from >= list.length) Nil
    else {
      list.drop(from).take(to - from)
    }
  }

  def sliceRecursive[T](from: Int, to: Int, list: List[T]): List[T] = {
    if (from >= to || from >= list.length) Nil
    def rec(from: Int, to: Int, currList: List[T], acc: List[T]): List[T] = {
      (from, to, currList) match {
        case (0, 0, _) | (_, _, Nil) => acc.reverse
        case (0, n, h::t) => rec(0, n - 1, t, h::acc)
        case (m, n, h::t) => rec(m-1, n-1, t, acc)
      }
    }
    rec(from, to, list, Nil)
  }

  def sliceSplit[T](from: Int, to: Int, list: List[T]): List[T] = {
    split(to-from, split(from, list)._2)._1
  }

  def sliceBuiltin[T](from: Int, to: Int, list: List[T]): List[T] = {
    list.slice(from, to)
  }
}
