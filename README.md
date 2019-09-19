<h1 style="font-weight:normal">
  &nbsp;xpo.network&nbsp;
</h1>

A visual profile for software engineers.
<br>

<p align="center">
  <img alt="sergey" src="https://user-images.githubusercontent.com/20287615/47371068-c70f5a00-d6ef-11e8-8988-dcdca71bf83c.gif">
</p>

Features
========

* Support of 100 languages (even exotic ones like COBOL)
* Detection of more than 1,000 libraries in code with per-line statistics
* Visual presentation your development experience
* *Finally!* Summary of all repositories you've contributed to 
* Interesting facts about yourself

Creating your profile is just the first step for us at XPO.NETWORK. Some of the things on our roadmap include:
* Engineers to follow and learn from
* Technology and libraries you should know about
* Projects that could use your help

Get started
===========
 
For closed/private source repos, You will need a new account, which you can get at [https://xpo.network/create-account](https://xpo.network/create-account).


* Linux or macOS or Windows
* Java 8+ Platform ([JRE](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) for Linux and Windows or [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) for macOS)
* Bash for Windows (`git bash` should suffice)

Usage
=====

To run wizard use `sourcerer` command for macOS and Linux, `java -jar sourcerer.jar` in folder `Users\user\.sourcerer` for Windows.

Use parameter `--help` for additional info.


Internals
=========
The app looks at repos locally on your machine, and then sends stats to sourcerer.io. The best way to verify is to look at the code. Protobuf messages declared in `src/main/proto/sourcerer.proto` is a good start as it describes the client-server protocol.
This app does **NOT** upload source code anywhere, and it **NEVER** will.

FAQ
===
### How can I process private repos?
To process private repos you need to run this app locally. See [Get started](#get-started) for instructions. Sourcerer app sends only statistical information to our servers and never sends code.



Contributing
============


Build
=====
To build and run this application locally, you'll need latest versions of Git, Gradle and JDK installed on your computer. From your command line:

```
# Clone this repository
$ git clone https://github.com/sourcerer-io/sourcerer-app.git

# Go into the repository
$ cd sourcerer-app

# Build
$ gradle build -Penv=production

# Run the app
$ java -jar build/libs/sourcerer-app.jar
```

License
=======
This app is under the MIT license. See the [LICENSE](https://github.com/Prism-Labs/xpo-source-app/blob/develop/LICENSE.md) for more information.

Links
=====
* [XPO Site](https://xpo.network/)

