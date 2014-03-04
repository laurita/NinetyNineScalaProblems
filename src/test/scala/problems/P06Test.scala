package problems

import org.scalatest.FunSuite
import scala.util.Random

class P06Test extends FunSuite {

  test("isPalindrome returns true if palindrome for even") {
    assert(P06.isPalindrome(List(1,2,3,3,2,1)))
  }

  test("isPalindrome returns true if palindrome for odd") {
    assert(P06.isPalindrome(List(1,2,3,4,3,2,1)))
  }

  test("isPalindrome returns true if palindrome for empty") {
    assert(P06.isPalindrome(List()))
  }

  test("isPalindrome returns false for non palindrome") {
    assert(!P06.isPalindrome(List(1,2,3,3,3,4,2,1)))
  }

  test("isPalindromeFaster returns true if palindrome for even") {
    assert(P06.isPalindromeFaster(List(1,2,3,3,2,1)))
  }

  test("isPalindromeFaster returns true if palindrome for odd") {
    assert(P06.isPalindromeFaster(List(1,2,3,4,3,2,1)))
  }

  test("isPalindromeFaster returns true if palindrome for empty") {
    assert(P06.isPalindromeFaster(List()))
  }

  test("isPalindromeFaster returns false for non palindrome") {
    assert(!P06.isPalindromeFaster(List(1,2,3,3,3,4,2,1)))
  }

  test("isPalindromeFaster should be faster than isPalindrome") {

    val r = new scala.util.Random

    var total0 = 0L
    var total1 = 0L
    (1 to 1000).foreach{ n =>
      val lst: List[Int] = (1 to 1000).toList.map(x => r.nextInt(20))
      val t10 = System.nanoTime()
      P06.isPalindromeFaster(lst)
      val t11 = System.nanoTime()
      val t00 = System.nanoTime()
      P06.isPalindrome(lst)
      val t01 = System.nanoTime()

      total0 += (t01 - t00)
      total1 += (t11 - t10)
    }

    println(s"isPalindrome total $total0")
    println(s"isPalindromeFaster $total1")
    assert(total0 > total1)

  }

  test("isPalindrome should be faster than isPalindromeBuiltIn") {

    val r = new scala.util.Random

    var total0 = 0L
    var total1 = 0L
    (1 to 1000).foreach{ n =>
      val lst: List[Int] = (1 to 1000).toList.map(x => r.nextInt(20))
      val t10 = System.nanoTime()
      P06.isPalindrome(lst)
      val t11 = System.nanoTime()
      val t00 = System.nanoTime()
      P06.isPalindromeBuiltIn(lst)
      val t01 = System.nanoTime()

      total0 += (t01 - t00)
      total1 += (t11 - t10)
    }

    println(s"isPalindrome total $total0")
    println(s"isPalindromeBuiltIn $total1")
    assert(total0 > total1)

  }
}
