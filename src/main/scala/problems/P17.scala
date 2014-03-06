package problems

object P17 {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    def rec(which: Int, acc: (List[T], List[T]), curr: List[T]): (List[T], List[T]) = {
      (which, curr) match {
        case (0, _) | (_, Nil) => (acc._1.reverse, curr)
        case (w, h :: t) => rec(which-1, (h::acc._1, acc._2), t)
      }
    }
    rec(n, (Nil, Nil), list)
  }

  def splitDrop[T](n: Int, list: List[T]): (List[T], List[T]) = {
    (list.take(n), list.drop(n))
  }

}
