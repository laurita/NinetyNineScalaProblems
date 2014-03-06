package problems

object P13 {

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def rec(acc: List[(Int, T)], currList: List[T]): List[(Int, T)] = {
      currList match {
        case Nil => acc
        case h :: t if (acc.isEmpty || h != acc.head._2) => rec((1, h) :: acc, t)
        case h :: t  => rec((acc.head._1 + 1, h) :: acc.tail, t)

      }
    }
    rec(Nil, list).reverse
  }

  // their solution
  def encodeDirectPack[A](ls: List[A]): List[(Int, A)] =
  if (ls.isEmpty) Nil
  else {
    val (packed, next) = ls span { _ == ls.head }
    (packed.length, packed.head) :: encodeDirectPack(next)
  }

}
