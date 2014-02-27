/**
 * Created by laura on 26/02/14.
 */
object P01 {

  def last[T](lst: List[T]): T = {
    lst match {
      case List() => throw new Exception("Empty list")
      case head :: List() => head
      case _ :: tail => last(tail)
    }
  }

}
