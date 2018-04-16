## Sets

Sets are immutable, and must contain only unique values:
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
