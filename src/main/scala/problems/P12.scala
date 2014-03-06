package problems

object P12 {

  def decode[T](list: List[(Int, T)]): List[T] = {
    def createList(n: Int, x: T): List[T] = {
      def rec(n: Int, acc: List[T]): List[T] = {
        n match {
          case 0 => acc
          case m => rec(m-1, x::acc)
        }
      }
      rec(n, List())
    }

    list.flatMap(x => createList(x._1, x._2))
  }

  def decodeFill[T](ls: List[(Int, T)]): List[T] =
    ls flatMap { e => List.fill(e._1)(e._2) }

}
