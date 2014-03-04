package problems

import P09._

object P10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    if (list.isEmpty) List()
    else pack(list).map(x => (x.length, x.head))
  }

}
