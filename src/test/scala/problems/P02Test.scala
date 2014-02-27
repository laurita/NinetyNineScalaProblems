package problems

import org.scalatest._

class P02Test extends FlatSpec with MustMatchers {

  "penultimate" should "return penultimate element" in {
    val lst = List(1, 2, 3)
    P02.penultimate(lst) must be equals(2)
  }

  it should "throw exception if list has 1 element" in {
    evaluating(P02.penultimate(List(1))) must produce [NoSuchElementException]
  }

  it should "throw exception if list is empty" in {
    evaluating(P02.penultimate(List())) must produce [NoSuchElementException]
  }
}
