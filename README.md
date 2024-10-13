:app/build/ccompose_compiler/app_debug-classes.txt
```
stable class ImmutableListTestModel {
  stable val testList: ImmutableList<String>
  <runtime stability> = 
}
unstable class ListTestModel {
  unstable val testList: List<String>
  <runtime stability> = Unstable
}
stable class ListTestStableModel {
  unstable val testList: List<String>
}
```
