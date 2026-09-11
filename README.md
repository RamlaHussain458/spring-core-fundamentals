# Spring Core Fundamentals — IoC, DI & Manual Configuration

A hands-on project exploring core Spring Framework concepts **without relying on Spring Boot's auto-configuration** — wiring beans manually, using XML configuration, and understanding what Spring Boot normally does for you behind the scenes.

## 🎯 Purpose

This repo is the "under the hood" companion to my main Spring Boot project ([springboot-demo-app](https://github.com/RamlaHussain458/Springboot-demo-app)). Here, the goal is to manually do what Spring Boot automates — creating the `ApplicationContext` by hand, wiring beans via XML and Java config, and comparing constructor vs setter injection — to build a solid understanding of what's actually happening beneath `@SpringBootApplication`.

## 🛠️ Tech Stack

- **Language:** Java 21
- **Framework:** Spring Framework (core container — no Spring Boot auto-configuration used)
- **Build tool:** Maven
- **IDE:** IntelliJ IDEA Ultimate

> Note: the `pom.xml` uses `spring-boot-starter-parent` for convenient dependency version management, but the code itself avoids Spring Boot's auto-configuration and `@SpringBootApplication` — beans are wired manually to learn the fundamentals properly.

## 🚀 Getting Started

### Prerequisites
- JDK 21 installed
- Maven (bundled via `mvnw` wrapper)
- IntelliJ IDEA (Community or Ultimate)

### Running the project
```bash
git clone https://github.com/RamlaHussain458/spring-core-fundamentals.git
cd spring-core-fundamentals
./mvnw compile exec:java -Dexec.mainClass="lk.tech.myapp.MainApp"
```
*(Update the main class path above to match wherever your entry point with `main()` lives.)*

## 📚 Concepts Covered / Progress

- [x] What is Spring vs Spring Boot
- [x] IoC (Inversion of Control) — letting the container manage object creation
- [x] DI (Dependency Injection) — how the container hands objects to your classes
- [ ] Manually creating an `ApplicationContext` (no Boot auto-startup)
- [ ] XML-based bean configuration (`applicationContext.xml`)
- [ ] Constructor Injection
- [ ] Setter Injection
- [ ] Comparing Constructor vs Setter Injection — when to use which
- [ ] Autowiring in plain Spring (`byType`, `byName`, `constructor`, `autodetect`)
- [ ] Bean scopes (singleton vs prototype)

## 📁 Project Structure

```
src/
 ├─ main/
 │   ├─ java/lk/tech/myapp/
 │   │   ├─ MainApp.java           # manual entry point, creates ApplicationContext
 │   │   ├─ model/                 # plain POJOs (e.g. Engine, Car)
 │   │   └─ config/                # Java-based @Configuration classes (if used)
 │   └─ resources/
 │       └─ applicationContext.xml # XML bean definitions
 └─ test/
```
*(Structure will evolve as XML config, constructor/setter injection, and autowiring examples are added.)*

## 🔑 Key Takeaways (updated as I learn)

- **IoC** = the principle: your code doesn't create its own dependencies; something external does.
- **DI** = the mechanism: the container actually hands those dependencies to your classes (via constructor, setter, or field).
- **Bean** = any object created and managed by the Spring container instead of manually with `new`.
- Spring Boot's `@SpringBootApplication` + `SpringApplication.run()` is really just automating: *scan → create `ApplicationContext` → configure beans → start*. This project does each of those steps by hand to understand them.

## 🔗 Related Repo

- [springboot-demo-app](https://github.com/RamlaHussain458/Springboot-demo-app) — the full Spring Boot + MVC + JPA + React project, built after these fundamentals.

## 📌 Tutorial Reference

Following a comprehensive Spring & Spring Boot YouTube series, covering core concepts through to a complete REST API with database and frontend integration.