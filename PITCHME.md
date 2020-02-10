## Introduction to Scala for Java Developers
### Vincent de Haan

---

## Who am I?

---

## Goals for today
- get started with the Scala compiler
- learn some cool features
- build a small application

---

## Introduction

```
Java -----> Scala <----- Haskell
```

---

## Getting started

Install:
- scala
- sbt
- InteliJ (with Scala and Sbt support)

See for the material of this presentation: https://github.com/vincentdehaan/scala-intro

---

## Hello world

---?code=HelloWorld.scala&lang=scala

```
scala HelloWorld.scala

# OR:

scalac HelloWorld.scala
scala HelloWorld
```

---

## Some functional oneliners

---?code=src/main/scala/nl/vindh/scalaintro/Example.scala?lang=scala

@[8,10-11]
@[8,10-12]
@[8,14-15]
@[8,17-18]
@[8,20-21]
@[8,23-24]

---

## Case classes and pattern matching

---?code=src/main/scala/nl/vindh/scalaintro/Example.scala?lang=scala


@[30-31]
@[33-36]
@[38-42]

---

## Exception handling

---?code=src/main/scala/nl/vindh/scalaintro/Example.scala?lang=scala

@[50-54]
@[50-64]
@[66-71]
@[66-78]
@[80-85]

---

## DSLs

- `()` and `{}` mostly interchangeable
- implicits
- operators are functions (`+`, `~`, etc.)

---

## Akka HTTP routing DSL

---?code=src/main/scala/nl/vindh/scalaintro/CounterRoutes.scala?lang=scala

@[8-12]
@[13-23]