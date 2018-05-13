def simple(): Unit = {
  println("simple print")
}

def adder(num1: Int, num2: Int): Int = {
  return num1 + num2
}

def greetName(name: String): String = {
  return s"Hello $name"
}

val numbers = List(1,2,3,4,5)

def check(nums: List[Int]): List[Int] = {
  return nums
}

def checkForSingleEven(target: Int): Boolean = {
  return (target % 2 == 0)
}

def checkForEvensInList(numbers: List[Int]): Boolean = {
  for (num <- numbers){
    if (num % 2 > 0){
      return false
    }
  }
  return true
}

def lucky(nums: List[Int]): Int = {
  var output = 0
  for (num <- nums){
    if (num == 7){
      output = output + 14
    } else{
      output = output + num
    }
  }
  return output
}

simple()
adder(2,3)
greetName("Yu")
check(numbers)
checkForSingleEven(4)
val myList = List(2,3,4,5,1)
checkForEvensInList(myList)
lucky(myList)
