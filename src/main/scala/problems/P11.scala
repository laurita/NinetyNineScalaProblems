package problems

import P09._

object P11 {

  def encodeModified[T](list: List[T]): List[Any] = {
    if (list.isEmpty) List()
    else {
      pack(list).map(ls =>
        ls match {
          case x :: Nil => x
          case y => (y.length, y.head)
        }
      )
    }
  }

}
