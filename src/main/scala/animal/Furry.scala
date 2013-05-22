package animal

/**
 * Denis Anfertev
 * 21.05.13 11:30
 */
trait Furry extends Animal {
  override def toString: String = super.toString + ":Furry"
}
