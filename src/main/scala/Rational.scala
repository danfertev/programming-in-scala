/**
 * Denis Anfertev
 * 17.05.13 17:46
 */
object Rational {
  def apply(n: Int, d: Int) = new Rational(n, d)
}

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational) = Rational(
    this.numer * that.denom + that.numer * this.denom,
    this.denom * that.denom
  )

  override def toString: String = s"$numer/$denom"

  override def equals(obj: Any): Boolean = obj match {
    case r: Rational => (this.numer == r.numer) && (this.denom == r.denom)
    case _ => false
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
