package problems

object P09 {

  def pack[T](list: List[T]): List[List[T]] = {
    if (list.isEmpty) List(List())
    list.foldRight(List[List[T]]()){ (h: T, t: List[List[T]]) =>
      if (t.isEmpty) List(List(h))
      else if (h == t.head.head) (h::t.head)::(t.tail)
      else List(h)::t
    }
  }

}
