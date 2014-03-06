package problems

object P16 {

  def drop[T](n: Int, list: List[T]): List[T] = {
    def rec(which: Int, currList: List[T], acc: List[T]): List[T] = {
      currList match {
        case Nil => acc
        case _ :: t if (which % n == 2) => rec(which + 1, t, acc)
        case h :: t => rec(which + 1, t, h :: acc)
      }
    }
    rec(0, list, Nil).reverse
  }

  def dropZip[T](n: Int, list: List[T]): List[T] = {
    list.zipWithIndex.filter( x => (x._2 % n != 2)).unzip._1
  }

}
