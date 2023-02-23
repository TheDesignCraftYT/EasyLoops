[releases-shield]: https://img.shields.io/github/v/release/TheDesignCraftYT/EasyLoops?include_prereleases&label=Download

[download]: #download

[discord-invite]: https://discord.gg/mYKK4BwGxe

[license]: https://github.com/TheDesignCraftYT/EasyLoops/tree/master/LICENSE

[discord-shield]: https://discord.com/api/guilds/1007268691689341030/widget.png

[license-shield]: https://img.shields.io/badge/License-Apache%202.0-white.svg

[stable-releases-shield]: https://img.shields.io/github/v/release/TheDesignCraftYT/EasyLoops?label=Latest%20Stable

[snapshots-shield]: https://img.shields.io/github/v/release/TheDesignCraftYT/EasyLoops?include_prereleases&label=Latest%20Snapshot

[ ![releases-shield][] ][download]
[ ![license-shield][] ][license]
[ ![discord-shield][] ][discord-invite]

# EasyLoops

EasyLoops is a small, simple and easy to use library for creating loops in Java.

## Summary

1. [Implementing EasyLoops into your project](#implementing-easyloops-into-your-project)
2. [Creating a loop](#creating-a-loop)
3. [Download](#download)
4. [License](#license)
5. [Contributing](#contributing)
6. [Contact](#contact)
7. [Credits](#credits)

### Implementing EasyLoops into your project

To activate EasyLoops in your project, you need to add the following code to your project:

```java
new de.thedesigncraft.easyloops.EasyLoops("YOUR_LOOP_PACKAGE_NAME");
```

Be sure to replace `YOUR_LOOP_PACKAGE_NAME` with the name of the package where your loops are located.
For example, you can directly add this code to your main class:

```java
import de.thedesigncraft.easyloops.*;

public class Main {
    public static void main(String[] args) {
        new EasyLoops("com.example.loops");
    }
}
```

### Creating a loop

To create a loop, you need to create a class that implements
the [`ILoop`](https://github.com/TheDesignCraftYT/EasyLoops/blob/main/src/main/java/de/thedesigncraft/easyloops/ILoop.java)
interface.

```java
import de.thedesigncraft.easyloops.*;

public class ExampleLoop implements ILoop {

    @Override
    public boolean activated() {
        return false;
    }

    @Override
    public int secondsInterval() {
        return 0;
    }

    @Override
    public void execute() {

    }
}
```

The `activated()` method is used to activate or deactivate the loop. If the method returns `true`, the loop will be
executed. If the method returns `false`, the loop won't be executed.
The `secondsInterval()` method is used to set the interval in seconds. The loop will be executed
every `secondsInterval()` seconds.
In the `execute()` method, you can write the code that should be executed every `secondsInterval()` seconds.

### Download

[ ![stable-releases-shield][] ](https://github.com/TheDesignCraftYT/EasyLoops/releases/latest)
[ ![snapshots-shield][] ](https://github.com/TheDesignCraftYT/EasyLoops/releases)

Be sure to replace the **`VERSION`** key below with the one of the versions shown above!

#### Maven

If you haven't yet created a `settings.xml` file, or you haven't yet added your GitHub-Authentication in the `settings.xml` file, take a look at [Preparing your `settings.xml` file](#preparing-your-settingsxml-file).

```xml
<repository>
    <id>github</id>
    <name>GitHub TheDesignCraftYT Packages</name>
    <url>https://maven.pkg.github.com/TheDesignCraftYT/EasyLoops</url>
</repository>
```

```xml
<dependency>
    <groupId>de.thedesigncraft</groupId>
    <artifactId>easyloops</artifactId>
    <version>VERSION</version>
</dependency>
```

#### Preparing your `settings.xml` file

If you don't have a `settings.xml` file yet, you can create one in the `.m2` folder in your home directory.
If you are using Windows, the `.m2` folder is located in `C:\Users\YOUR_USERNAME\.m2`.
If you are using Linux, the `.m2` folder is located in `/home/YOUR_USERNAME/.m2`.

In the `settings.xml` file, you need to add the following code in the `<servers>` tag:

```xml
<server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_TOKEN</password>
</server>
```

Be sure to replace `YOUR_GITHUB_USERNAME` with your GitHub username and `YOUR_GITHUB_TOKEN` with a [personal GitHub access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).

### Gradle

If you haven't yet created a `gradle.properties` file, or you haven't yet added your GitHub-Authentication in the `gradle.properties` file, take a look at [Preparing your `gradle.properties` file](#preparing-your-gradleproperties-file).

**Gradle Groovy:**

```groovy
repositories {
    maven {
        url = uri 'https://maven.pkg.github.com/TheDesignCraftYT/EasyLoops'
        credentials {
            username = project.findProperty('gpr.user') ?: System.getenv('USERNAME')
            password = project.findProperty('gpr.key') ?: System.getenv('TOKEN')
        }
    }
}
```

```groovy
dependencies {
    implementation 'de.thedesigncraft:easyloops:VERSION'
}
```

**Kotlin DSL:**

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/TheDesignCraftYT/EasyLoops")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
        }
    }
}
```

```kotlin
dependencies {
    implementation("de.thedesigncraft:easyloops:VERSION")
}
```

#### Preparing your `gradle.properties` file
If you don't have a `gradle.properties` file yet, you can create one in the `gradle` folder in your project directory.

In the `gradle.properties` file, you need to add the following code:

```properties
gpr.user=YOUR_GITHUB_USERNAME
gpr.key=YOUR_GITHUB_TOKEN
```

Be sure to replace `YOUR_GITHUB_USERNAME` with your GitHub username and `YOUR_GITHUB_TOKEN` with a [personal GitHub access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).

### License

This project is licensed under the [Apache 2.0 License](https://github.com/TheDesignCraftYT/EasyLoops/blob/main/LICENSE).

### Contributing

If you want to contribute to this project, you can create a pull request.

### Contact

If you have any questions, you can contact me on Discord: `TheDesignCraft#2977`

### Credits

- [TheDesignCraft](https://github.com/TheDesignCraftYT) - Creator and maintainer
- [JetBrains](https://www.jetbrains.com/) - Providing free licenses for their products
- [GitHub](https://github.com) - Providing free packages for open source projects
- [Maven](https://maven.apache.org/) - Providing free packages for open source projects
- [Gradle](https://gradle.org/) - Providing free packages for open source projects
