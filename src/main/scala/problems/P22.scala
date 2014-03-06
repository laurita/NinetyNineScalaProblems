package problems

object P22 {

  def range(from: Int, to: Int): List[Int] = {
    def rec(currTo: Int, acc: List[Int]): List[Int] = {
      currTo match {
        case x if x < from => acc
        case x => rec(currTo - 1, currTo::acc)
      }
    }
    rec(to, Nil)
  }

  // Their. Functional
  // The classic functional approach would be to use `unfoldr`, which Scala
  // doesn't have.  So we'll write one and then use it.
  def unfoldRight[A, B](s: B)(f: B => Option[(A, B)]): List[A] =
    f(s) match {
      case None         => Nil
      case Some((r, n)) => r :: unfoldRight(n)(f)
    }

  def rangeFunctional(start: Int, end: Int): List[Int] =
    unfoldRight(start) { n =>
      if (n > end) None
      else Some((n, n + 1))
    }

}
