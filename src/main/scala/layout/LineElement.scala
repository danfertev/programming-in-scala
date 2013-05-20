package layout

/**
 * Denis Anfertev
 * 20.05.13 16:57
 */
class LineElement(s: String) extends Element {

  val contents: Array[String] = Array(s)

  override val height: Int = s.length

  override val width: Int = 1
}
