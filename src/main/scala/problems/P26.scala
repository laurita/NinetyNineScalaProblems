package problems

object P26 {

  def combinations[T](n: Int, list: List[T]): List[List[T]] = {

    def rec(list: List[T], acc: List[List[T]], comb: List[T]): List[List[T]] = {
      (comb, list) match {
        case (c, _) if c.length == n => List(c.reverse)
        case (c, Nil) if c.length < n => List()
        case (c, l) => rec(list.tail, acc, list.head::comb) ::: rec(list.tail, acc, comb)
      }
    }
    rec(list, Nil, Nil)

  }

  // Their variant
  private def flatMapSublists[T, V](ls: List[T])(f: List[T] => List[V]): List[V] = {
    ls match {
      case Nil => Nil
      case list@(_ :: t) => f(list) ::: flatMapSublists(t)(f)
    }
  }

  def combinationsFlat[T](n: Int, list: List[T]): List[List[T]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(list) { sl => combinationsFlat(n-1, sl.tail) map (sl.head :: _) }
  }

}
