# Scala Basics

#### 1. What is 2 to the power of 5 ?

```Scala
math.pow(2, 5)
```
```
res1: Double = 32.0
```

#### 2. What is the remainder of 180 divided by 7?

```Scala
180 % 7
```
```
res3: Int = 5
```

#### 3. Given variable pet_name = "Sammy", use string interpolation to print out ``"My dog's name is Sammy."``

```Scala
val name = "Sammy"
```
```
name: String = Sammy
```
```Scala
var statement = "My dog's name is " + name
```
```
statement: String = My dog's name is Sammy
```

#### 4. Use Scala to find out if the letter sequence ``"xyz"`` is contained in:
``"sadfjshfjyuyxyzjkfuidkjklhasyysdfk"``

```Scala
val key = "xyz"
val target = "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
target.contains(key)
```
```
res4: Boolean = true
```

#### 5. What is the difference between a value and a variable?

A **variable** is mutable, while a **value** is immutable in Scala. For instance,

```Scala
val myVal = 4
myVal = 5
```
```
<console>:25: error: reassignment to val
       myVal = 5
             ^
```
But, using variables, this works fine:
```Scala
var myVar = 4
myVar = 5
```
```
myVar: Int = 5
```

#### 6. Given the tuple `(1,2,3,(4,5,6))` retrieve the number 6.

```Scala
val myTuple = (1,2,3,(4,5,6))
myTuple._4._3
```
```
res7: Int = 6
```
