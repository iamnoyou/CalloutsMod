![Compact Powered by OneConfig](https://polyfrost.org/img/compact_vector.svg)
# CalloutsMod
Hypixel CvC `1.8.9 forge` mod to display callouts on hud from player location, similar to CS2.

> [Original mod developed by baseballaholic and others](https://github.com/baseballaholic/callouts-mod/)

## Usage
[Download](https://github.com/iamnoyou/CalloutsMod/releases) `CalloutsMod-1.8.9-forge-<version>.jar` and place it in your mods folder within `.minecraft` mods directory.
- .jar files with `-dev` or `-sources` are not intended for use.

If you don't know where your `.minecraft` directory is, see the below [`Locating .minecraft`](https://github.com/iamnoyou/CalloutsMod#------locating-minecraft----) section.

## Features
`Right Shift` to open OneConfig menu or use `/calloutsmod` to open the config.
> The `Callout:` text is removable by simply removing it from `Title` in the config.

![CalloutsMod Preview](https://i.imgur.com/jDN2G4W.png)
![Config Preview](https://i.imgur.com/z50cbG2.png)

<details open>
  <summary>
    <h2>
      Locating .minecraft
    </h2>
  </summary>

Information taken from [Minecraft Fandom Wiki](https://minecraft.fandom.com/wiki/.minecraft)

Below is a table showing the default directory for .minecraft.

| Os      | Location                                  |
|:--------|:------------------------------------------|
| Windows | `%APPDATA%\.minecraft`                    |
| macOS   | `~/Library/Application Support/minecraft` |
| Linux   | `~/.minecraft`                            |

The location in the table above is just the default case. Launchers can set the .minecraft at any path.

If you're a Windows user and are unfamiliar with how to find your appdata folder, follow these steps:
- Click Start → Run. If you don't see "Run", press `Windows Key` + `R`
- Type `%APPDATA%\.minecraft` and click "OK".

If you're a Mac user, you can open the folder through Spotlight:
- Open Finder and press `Shift` + `Command` + `G` or open the Spotlight popup through the magnifying glass icon on the right of the Menu Bar.
- Type `~/Library/Application Support/minecraft` and hit `Enter`.

On Linux or macOS, the `~` in the path refers to the home directory. Folders starting with a . are hidden by default. 
In most file managers, hitting Ctrl + H toggles their hidden status. In macOS specifically, since version 10.12 (Sierra), the shortcut `Command` + `Shift` + `.` toggles the hidden status of files.
</details>

<details>
  <summary>
    <h2>
      Dev Setup
    </h2>
  </summary>

> Note: Tested in Intellij IDE, information may differ for a different ide.

- Clone this repository.
- Import as an Intellij IDEA Project and let it configure.
- Reload gradle project.

<details>
  <summary>
    <h2>
      Build
    </h2>
  </summary>

> Both tasks will work.
>
> `>= JDK 17`

- Gradle: tasks > build > build
  - `./gradlew build`
- Gradle: 1.8.9-forge > build > build
  - `./gradlew :1.8.9-forge:build`

</details>

<details>
  <summary>
    <h2>
      Run
    </h2>
  </summary>

> Both tasks will work.
>
> `JDK 8`

- Gradle: tasks > loom > runClient
  - `./gradlew runClient`
- Gradle: 1.8.9-forge > loom > runClient
  - `./gradlew :1.8.9-forge:runClient`

</details>

<details>
  <summary>
    <h2>
      Artifacts
    </h2>
  </summary>

- Located in `/versions/1.8.9-forge/build/libs/` after building.
  - `CalloutsMod-1.8.9-forge-<version>.jar` - Place in mods folder
  - `CalloutsMod-1.8.9-forge-<version>-dev.jar` - Shouldn't be used.
  - `CalloutsMod-1.8.9-forge-<version>-sources.jar` - Source Code
  - `CalloutsMod-1.8.9-forge-<version>-sources-dev.jar`

- Can also be found in this repository via [`Actions`](https://github.com/iamnoyou/CalloutsMod/actions) workflows.

</details>

</details>
