<h1 style="font-weight:normal">
  &nbsp;xpo.network&nbsp;
</h1>

A visual profile for software engineers.


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
* gradle

After matching above requirements , follow below commands

Usage
=====
To install run the following command in bash:
````
$ curl -sSL https://xpo-img.s3-us-west-2.amazonaws.com/install.sh | bash
```
Use parameter --help for additional info.

Build
=====
To build and run this application locally, you'll need latest versions of Git, Gradle and JDK installed on your computer. From your command line:

```
# Clone this repository
$ git clone https://github.com/Prism-Labs/xpo-source-app

# Go into the repository
$ cd xpo-source-app

# Build
$ gradle build -Penv=production

# Run the app
$ java -jar build/libs/analyser-app.jar
```

Internals
=========
The app looks at repos locally on your machine, and then sends stats to our server. The best way to verify is to look at the code.
This app does **NOT** upload source code anywhere, and it **NEVER** will.

FAQ
===
### How can I process private repos?
To process private repos you need to run this app locally. See [Get started](#get-started) for instructions. This app sends only statistical information to our servers and never sends code.



Contributing
============



License
=======
This app is under the MIT license. See the [LICENSE](https://github.com/Prism-Labs/xpo-source-app/blob/develop/LICENSE.md) for more information.

Links
=====
* [XPO Site](https://xpo.network/)

