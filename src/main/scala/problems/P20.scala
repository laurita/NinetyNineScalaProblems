package problems

object P20 {

  def removeAt[T](k: Int, list: List[T]): (List[T], Option[T]) = {
    if (k >= list.length) (list, None)
    else {
      def rec(which: Int, end: List[T], start: List[T]): (List[T], Option[T]) = {
        (which, end) match {
          case (0, l) => (start.reverse ::: l.tail, Some(l.head))
          case (n, l) => rec(n-1, l.tail, l.head::start)
        }
      }
      rec(k, list, Nil)
    }
  }



}
