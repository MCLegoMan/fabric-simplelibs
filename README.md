# fabric-simplelibs
Compiles [Simple Fabric Libs](https://github.com/magistermaks/fabric-simplelibs) into a single mod.

### build.gradle

```
repositories {
    maven { url 'https://jitpack.io' }
}
```
**Fabric/Quilt**
```
dependencies {
    include(modImplementation "com.github.MCLegoMan:fabric-simplelibs:2.0.0-Fabric")
}
```
**LegacyFabric**
```
dependencies {
    include(modImplementation "com.github.MCLegoMan:fabric-simplelibs:2.0.0-LegacyFabric")
}
```

[fabric-simplelibs](https://github.com/MCLegoMan/fabric-simplelibs) and [Simple Fabric Libs](https://github.com/magistermaks/fabric-simplelibs) are both licensed under the MIT license.
