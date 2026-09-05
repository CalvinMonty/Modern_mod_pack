# Main code

NeoForge **1.21.1** sources for Modern Mod Pack. This loader is what CurseForge uses for Forge-family mods.

## Build the CurseForge jar

From this folder:

```bash
./gradlew build
```

The installable file is:

`build/libs/modern_mod_pack-1.0.0.jar`

Put that jar in a **Minecraft 1.21.1 NeoForge** profile’s `mods` folder (CurseForge app or a manual install).

## Publish to CurseForge

1. Create a Minecraft mod project at [curseforge.com](https://www.curseforge.com/).
2. Copy the numeric project ID into `gradle.properties` (`curseforge_project_id=`).
3. Create a CurseForge API token and set `CURSEFORGE_TOKEN` in your environment. Do not commit the token.
4. Run:

```bash
./gradlew publishCurseForge
```

Game assets still live in [`../assets`](../assets/). Gradle packs them into the jar automatically.
