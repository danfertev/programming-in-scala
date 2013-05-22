package animal

/**
 * Denis Anfertev
 * 21.05.13 11:31
 */
trait HasLegs extends Animal{
  override def toString: String = super.toString + ":HasLegs"
}
