package problems

object P05 {

  def reverse[T](list: List[T]): List[T] = {
    def rec(acc: List[T], lst: List[T]): List[T] ={
      lst match {
        case List() => acc
        case h :: t => rec(h :: acc, t)
      }
    }
    rec(List(), list)
  }

  def reverseFold[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]())( (acc, head) => head :: acc)
  }

}
