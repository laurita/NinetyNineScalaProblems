package problems

object P03 {

  def nth[T](n: Int, lst: List[T]): T = {
    if (n >= lst.length | n < 0 | lst.isEmpty)
      throw new NoSuchElementException

    def rec(which: Int, rem: List[T]): T = {
      which match {
        case `n` => rem.head
        case _ => rec(which + 1, rem.tail)
      }
    }

    rec(0, lst)
  }
}
