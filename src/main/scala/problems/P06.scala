package problems

object P06 {

  def isPalindrome[T](list: List[T]): Boolean = {

    if (list.isEmpty) true
    else {
      val n = list.length - 1
      val mid = n / 2

      (0 to mid).forall(x => list(x).equals(list(n - x)))
    }
  }

  def isPalindromeBuiltIn[T](list: List[T]): Boolean = list == list.reverse

  /*
   * Optimized variant that should run in O(n). Reverses first half of the list
   * and checks for its equality with the remaining half.
   * Why is it slower???
   */
  def isPalindromeFaster[T](list: List[T]): Boolean = {

    def split[T](list: List[T]): (List[T], List[T]) = {
      val n = list.length
      val mid = n / 2
      def rec[T](acc: List[T], currList: List[T], curr: Int): (List[T], List[T]) ={
        curr match {
          case `mid` if n % 2 == 0 => (acc, currList)
          case `mid` => (acc, currList.tail)
          case _ => rec(currList.head :: acc, currList.tail, curr+1)
        }
      }

      rec(List[T](), list, 0)
    }

    def allEqual(list1: List[T], list2: List[T]): Boolean = {
      list1 match {
        case h :: t if h != list2.head => false
        case _ :: t => allEqual(t, list2.tail)
        case List() => true
      }
    }

    val lists = split(list)
    allEqual(lists._1, lists._2)
  }

}
