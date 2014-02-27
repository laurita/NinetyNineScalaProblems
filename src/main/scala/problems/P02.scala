package problems

import java.util.NoSuchElementException

object P02 {

  def penultimate[T](lst: List[T]): T = {
    lst match {
      case List() | List(_) => throw new NoSuchElementException
      case pen :: ult :: List() => pen
      case head :: tail => penultimate(tail)
    }
  }
}
