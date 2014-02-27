package problems

import org.scalatest.{MustMatchers, FlatSpec}

class P03Test extends FlatSpec with MustMatchers {

  "nth" should "return nth element of a list if it exists" in {
    val lst = List(1, 2, 3, 4, 5)
    P03.nth(4, lst) must be equals(5)
  }

  it should "throw an exception if n larger than length of the list" in {
    evaluating(P03.nth(5, List(1,2,3,4,5))) must produce [NoSuchElementException]
  }

  it should "throw an exception if n < 0" in {
    evaluating(P03.nth(-1, List(1,2,3,4,5))) must produce [NoSuchElementException]
  }

}
