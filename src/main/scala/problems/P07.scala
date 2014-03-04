package problems

object P07 {

  /*
   * If contains only lists
   */
  def flatten[T](listOfLists: List[List[T]]): List[T] = {

    def rec[T](acc: List[T], lists: List[List[T]]): List[T] = {
      lists match {
        case Nil => acc
        case head :: tail => {
          head match {
            case Nil => rec(acc, tail)
            case h :: t => rec(h :: acc, t :: tail)
          }
        }
      }
    }

    rec(Nil, listOfLists).reverse
  }

  /*
   * If contains nested lists and/or elements
   */
  def flattenAny(lists: List[Any]): List[Any] = {
    lists flatMap {
      case ls: List[_] => flattenAny(ls)
      case l => List(l)
    }
  }
}
