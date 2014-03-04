package problems

object P04 {

  def length[T](list: List[T]): Int = {
    list match {
      case List() => 0
      case _ :: t => 1 + length(t)
    }
  }

  def tailRecLength[T](list: List[T]): Int = {
    def rec(acc: Int, lst: List[T]): Int = {
      lst match {
        case h :: t => rec(acc+1, t)
        case List() => acc
      }
    }

    rec(0, list)
  }

}
