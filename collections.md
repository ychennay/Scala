## Sets

Sets are by default immutable:
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

However, you can create a **mutable** version of a set with the `collection.mutable.Set` class:
```Scala
val s = collection.mutable.Set(1,2,3)
s += 4
```
```
s.type = Set(1, 2, 3, 4)
```
```Scala
s.add(5)
s
```
```
scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)
```

Sets contain only **unique** values:

```Scala
val mySet = Set(1,2,3,2,2,3,1)
```
```
mySet: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
```

Sets are **unordered**, so it does not make sense to index the different elements inside a set.

You can easily cast a `List` into a `Set`:

```Scala
val myList = List(1,2,3,1,3,2)
```
```
myList: List[Int] = List(1, 2, 3, 1, 3, 2)
```
```Scala
myList.toSet
```
```
res11: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
```

## Maps

Maps allow for a key-value pair storage structure.
```Scala
val mymap = Map(("a", 1), ("b",2), ("c", 3))
```
```
mymap: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)
```
You can retrieve the values my passing in a key:
```Scala
mymap("a")
```
```
res12: Int = 1
```
Attempting to look up a key that does not exist will result in a Java `NoSuchElementException`:
```Scala
mymap("d")
```
```
java.util.NoSuchElementException: key not found: d
  at scala.collection.MapLike$class.default(MapLike.scala:228)
  at scala.collection.AbstractMap.default(Map.scala:59)
  at scala.collection.MapLike$class.apply(MapLike.scala:141)
  at scala.collection.AbstractMap.apply(Map.scala:59)
  ... 49 elided
```
When you use the Map's `get()` method, however, it will return a `None` Option:
```Scala
mymap.get("a")
```
```
Option[Int] = Some(1)
```
```Scala
mymap.get("d")
```
```
Option[Int] = None
```
To get the keys of a map, use the `.keys` property:
```Scala
mymap.keys
```
```
Iterable[String] = Set(a, b, c)
```
Note that `.keys` returns an `Iterable` object, in this case a `Set`.

To get the values of a map, use the `.values` property:
```Scala
mymap.values
```
```
Iterable[Int] = MapLike(1, 2, 3)
```

### Mutable Maps

```Scala
val myMutableMap = collection.mutable.Map(("a", 1), ("b", 2))
```
```
scala.collection.mutable.Map[String,Int] = Map(b -> 2, a -> 1)
```

You can add in a new key-value pair entry:
```Scala
myMutableMap += ("c" ->  3)
```
```
myMutableMap.type = Map(b -> 2, a -> 1, c -> 3)
```
Be careful not to confuse the syntax here:
```Scala
myMutableMap += ("c",  3)
```
```
error: type mismatch;
 found   : Int(3)
 required: (String, Int)
       myMutableMap += ("c", 3)
                             ^
```
