package problems

import P23._

object P25 {

  def randomPermute[T](list: List[T]): List[T] = {
    randomSelect(list.length, list)
  }

}
