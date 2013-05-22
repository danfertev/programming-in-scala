package animal

/**
 * Denis Anfertev
 * 21.05.13 11:31
 */
trait FourLegged extends HasLegs{
  override def toString: String = super.toString + ":FourLegged"
}
