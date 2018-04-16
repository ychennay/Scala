## Sets

Sets are immutable:
```Scala
var s = Set()
s = Set(1,2,3)
```
```
<console>:25: error: type mismatch;
 found   : Int(3)
 required: Nothing
       s = Set(1,2,3)
```

Sets contain only unique values:

```Scala
val mySet = Set(1,2,3,2,2,3,1)
```
```
mySet: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
```
