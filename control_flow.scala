import util.control.Breaks._

val x = "hello"

if (x.endsWith("o")){
  println("Yes.")
} else {
  println("No")
}

for (item <- Array.range(0,4)){
  println("Hello")
}


for (num <- Range(0,10)){
  if (num % 2 == 0){
    println(s"$num is even.")
  } else{
    println(s"$num is odd.")
  }
}

val names = List("Yu", "Chen", "Yoo", "Choo")

for (name <- names){
  if (name.startsWith("C")){
    println(name)
  }
}
var y = 0
while (y < 10){
  println(s"y is currently $y")
  y = y + 1
  if (y == 3) break
}
