package problems

object P08 {

  // tail recursive
  def compress[T](list: List[T]): List[T] = {
    def rec(acc: List[T], curr: List[T]): List[T] = {
      curr match {
        case Nil => acc.reverse
        case h :: Nil =>rec(h :: acc, Nil)
        case a :: b :: tail if (a != b) => rec(a::acc, b::tail)
        case a :: b :: tail => rec(acc, b::tail)
      }
    }

    rec(Nil, list)
  }

  // using foldRight
  def compressFold[T](list: List[T]): List[T] = {
    list.foldRight(List[T]()){ (h: T, t: List[T]) =>
      if (t.isEmpty || (h != t.head)) h::t
      else t
    }
  }

}
