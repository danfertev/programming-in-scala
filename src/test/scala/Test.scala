import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Denis Anfertev
 * 17.05.13 17:38
 */

@RunWith(classOf[JUnitRunner])
class Test extends FunSuite {
  test("1/2 == 1/2") {
    assert(Rational(1, 2) === Rational(1, 2))
  }

  test("1/2 != 1/3") {
    assert(Rational(1, 2) != Rational(1, 3))
  }

  test("1/2 == 2/4") {
    assert(Rational(1, 2) === Rational(2, 4))
  }

  test("1/2 != null") {
    assert(Rational(1, 2) != null)
  }
}
