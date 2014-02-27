package problems

import org.scalatest._

class P01Test extends FlatSpec with MustMatchers {

  "last" should "return last element of a list" in {

    val lst = List(1, 2, 3)
    P01.last(lst) must be equals(3)
  }

  it should "throw Exception if a list is empty" in {
    evaluating(P01.last(List())) must produce [NoSuchElementException]
  }
}
