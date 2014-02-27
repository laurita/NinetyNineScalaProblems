package problems

object P01 {

  def last[T](lst: List[T]): T = {
    lst match {
      case List() => throw new NoSuchElementException("Empty list")
      case head :: List() => head
      case _ :: tail => last(tail)
    }
  }

}
