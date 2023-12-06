## Apache Pekko HTTP quickstart in Java

You can use [Giter8][g8] to create your own project from the quickstart.

Prerequisites:
- JDK 8
- sbt 1.9.x or higher

Open a console and run the following command to apply this template:
 ```
sbt new apache/incubabor-pekko-http-quickstart-java.g8
 ```

You can also install [Giter8](http://www.foundweekends.org/giter8/setup.html) and install using:
 ```
g8 apache/incubabor-pekko-http-quickstart-java.g8
 ```

This template will prompt for the following parameters. Press `Enter` if the default values suit you:
- `name`: Becomes the name of the project.
- `organisation`: Provides an organisation name for the project.
- `pekko-http-version`: Specifies which version of Pekko HTTP should be used for this project.
- `pekko-version`: Specifies which version of Pekko should be used for this project.

This template comes with example for an Pekko HTTP server on Java `QuickstartServer`, along with their respective tests.

Once inside the project folder, to run this code, you can issue the following command to run the server:
```
sbt run
```

This template also provides build descriptors for maven and gradle. You can use any of the following commands to run 
the application:
```
mvn compile
mvn exec:java
```
or
```
gradle run
```
Both commands run `QuickstartServer` by default.


Template license
----------------
Written in 2017 by Lightbend, Inc.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[sbt]: http://www.scala-sbt.org/
[sbt_download]: http://www.scala-sbt.org/download.html
