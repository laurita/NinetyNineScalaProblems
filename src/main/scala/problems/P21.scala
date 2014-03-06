package problems

object P21 {

  def insertAt[T](el: T, n: Int, list: List[T]): List[T] = {
    def rec(which: Int, curr: List[T], acc: List[T]): List[T] = {
      which match {
        case m if m <= 0 =>
          acc.reverse ::: (el :: curr)
        case m =>
          rec(m-1, curr.tail, curr.head::acc)
      }
    }
    rec(n, list, Nil)
  }

  def insertAtDrop[T](el: T, n: Int, list: List[T]): List[T] = {
    list.take(n) ::: (el :: list.drop(n))
  }

  // Their
  def insertAtTheir[T](el: T, n: Int, list: List[T]): List[T] = {
    list.splitAt(n) match {
      case (pre, post) => pre ::: (el :: post)
    }
  }

}
