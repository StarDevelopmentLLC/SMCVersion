# SMCVersion
A simple library for Minecraft Versions, some wrappers based on Versions and some reflection utilities
## Installation
### Maven
```xml
<repository>
    <id>stardev-releases</id>
    <url>https://repo.stardevllc.com/releases</url>
</repository>
```
```xml
<dependency>
    <groupId>com.stardevllc</groupId>
    <artifactId>StarLib</artifactId>
    <version>{VERSION}</version>
    <scope>provided</scope>
</dependency>
```
### Gradle
```groovy
maven { url 'https://repo.stardevllc.com/releases' }
```
```groovy
compileOnly 'com.stardevllc:StarLib:{VERSION}'
```
## Usage
### MinecraftVersion
This enum allows for version checking
The `MinecraftVersion.CURREN_VERSION` gets the current version that is detected
## MCWrappers
This is a collection of wrappers do to things across versions
