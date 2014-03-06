package problems

import org.scalatest.FunSuite
import P18._

class P18Test extends FunSuite {

  test("normal slice") {
    assert(sliceDrop(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)).equals(List('d, 'e, 'f, 'g)))
  }

  test("slice when from >= to") {
    assert(sliceDrop(2, 2, List(1,2,3,4)).equals(Nil))
  }

  test("slice when from >= list.length") {
    assert(sliceDrop(2, 3, List(1,2)).equals(Nil))
  }

  test("normal sliceSplit") {
    assert(sliceSplit(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)).equals(List('d, 'e, 'f, 'g)))
  }

  test("sliceSplit when from >= to") {
    assert(sliceSplit(2, 2, List(1,2,3,4)).equals(Nil))
  }

  test("sliceSplit when from >= list.length") {
    assert(sliceSplit(2, 3, List(1,2)).equals(Nil))
  }

  test("normal sliceRecursive") {
    assert(sliceRecursive(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)).equals(List('d, 'e, 'f, 'g)))
  }

  test("sliceRecursive when from >= to") {
    assert(sliceRecursive(2, 2, List(1,2,3,4)).equals(Nil))
  }

  test("sliceRecursive when from >= list.length") {
    assert(sliceRecursive(2, 3, List(1,2)).equals(Nil))
  }

}
