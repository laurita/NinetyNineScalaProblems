package problems

import org.scalatest.FunSuite

class P07Test extends FunSuite {

  test("flatten should return one list consisting of elements from nested lists") {
    assert(P07.flatten(List(List(1,2), List(3), List(4,5))).equals(List(1,2,3,4,5)))
  }

  test("flatten should return empty list if contains only empty lists") {
    assert(P07.flatten(List(List())).equals(List()))
  }

  test("flattenAny should return one list consisting of elements from nested lists") {
    assert(P07.flattenAny(List(List(1,2), List(3), List(4,5))).equals(List(1,2,3,4,5)))
  }

  test("flattenAny should return empty list if contains only empty lists") {
    assert(P07.flattenAny(List(List())).equals(List()))
  }

  test("flattenAny should return a flat list consisting of elements from deeper nested lists") {
    assert(P07.flattenAny(List(1, List(List(1),2), List(3), List(), List(List(4),List(5)))).equals(List(1, 1,2,3,4,5)))
  }

}
