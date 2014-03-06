package problems

object P19 {

  def rotate[T](n: Int, list: List[T]): List[T] = {
    if (n > 0) {
      list.drop(n) ::: list.take(n)
    } else if (n < 0) {
      val l = list.length
      val nAbs = n.abs
      list.drop(l-nAbs) ::: list.take(l-nAbs)
    } else list
  }

  def rotateReverse[T](n: Int, list: List[T]): List[T] = {
    if (n > 0) list.drop(n) ::: list.take(n)
    else if (n < 0) {
      val ls = list.reverse
      rotateReverse(n.abs, ls).reverse
    } else list
  }

  // Their variant
  def rotateTheir[A](n: Int, ls: List[A]): List[A] = {
    val nBounded = if (ls.isEmpty) 0 else n % ls.length
    if (nBounded < 0) rotateTheir(nBounded + ls.length, ls)
    else (ls drop nBounded) ::: (ls take nBounded)
  }

}
