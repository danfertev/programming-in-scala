val xs = List(-1, 2, 3)

xs.filter(_ > 0).map(_ * 2)

xs.withFilter(_ > 0).map(_ * 2)

xs.foreach(println)






var more = 10

val add = (x: Int) => x + more

add(1)

more += 1

val add1 = (x: Int) => x + more

add(1)
add1(1)

var sum = 0

xs.foreach(sum += _)

sum

42.hashCode

(new animal.Cat).toString