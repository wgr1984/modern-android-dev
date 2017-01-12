# modern-android-dev

Welcome to the modern android dev repo.
It is intended to provide sample project in the most comon
alternative jvm languages compatible with Android.
Furthermore only such will be selected which play nice with java and provide easy
exchange java api.

For this reason lets keep [Scala](http://scala-android.org/) aside for now as it provide quite high barrier to access it from java, even if it is quite lightwidth in terms of apk-size. Maybe do a extra section at the end.

Languages to be analyzed:
* [Groovy](https://github.com/groovy/groovy-android-gradle-plugin)
* [Kotlin](https://kotlinlang.org/)
* [Xtend](https://eclipse.org/xtend)
* Java + [Retrolambda](https://github.com/evant/gradle-retrolambda) + [ProjectLomkok](https://projectlombok.org/)

# Apk Size (allmost plain beside Swissknife)
On of the most important aspects beside performance (runtime/compile)

| Groovy        | Kotlin        | Xtend         |    _(ref)Java_|
|:-------------:|:-------------:|:-------------:|:--------------|
|3.0MB          |          1.6MB|          2.1MB|          1.4MB|
