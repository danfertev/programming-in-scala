package animal

/**
 * Denis Anfertev
 * 21.05.13 11:32
 */
class Cat extends Animal with Furry with FourLegged {
  override def toString: String = super.toString + ":Cat"
}
