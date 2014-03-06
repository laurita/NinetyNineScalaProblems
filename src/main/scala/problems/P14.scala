package problems

object P14 {

  def duplicate[T](list: List[T]): List[T] = {
    list flatMap(x => List.fill(2)(x))
  }

}
