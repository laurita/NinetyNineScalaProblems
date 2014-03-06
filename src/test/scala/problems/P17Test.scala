package problems

import org.scalatest.FunSuite
import P17._

class P17Test extends FunSuite {

  test("split return a tuple of two lists made by splitting first one at index") {
    val x = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(split(3, x).equals(res))

  }

  test("split return same as splitDrop") {
    val x = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(split(3, x).equals(splitDrop(3, x)))

  }
}
