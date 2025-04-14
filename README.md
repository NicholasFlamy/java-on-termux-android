# Java on Termux (Android)
Bash script that compiles java files with `ecj`, converts to dex with `dx`, and runs with `dalvikvm`
## Setup
### Dependencies
```
pkg install ecj dx termux-tools
```
Clone the repo and enter
```
git clone https://github.com/NicholasFlamy/java-on-termux-android.git
cd java-on-termux-android
```
Move the bash script to the Termux `bin`
```
mv java /data/data/com.termux/files/usr/bin/java
```
## Usage
To run `Thing.java` in the current directory
```
java Thing .
```
To run `HelloWorld.java` in the `program/` directory
```
java HelloWorld program/
```
