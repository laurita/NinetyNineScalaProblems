package problems

import org.scalatest.FunSuite
import P25._

class P25Test extends FunSuite {

  test("random permutation") {

    val list = List(1,2,3,4,5,6)
    assert(randomPermute(list).forall(list.contains(_)))
  }

}
