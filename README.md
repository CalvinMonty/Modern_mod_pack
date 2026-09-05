# Modern Mod Pack

This repository is a **Minecraft Forge 1.20.1 mod**

| Path | Role |
| --- | --- |
| [`code/`](code/) | Main mod source and Gradle build |
| [`assets/`](assets/) | Textures, models, language files, and other game assets |

## CurseForge

CurseForge installs **jars**, not this GitHub folder. Build the jar from `code/`:

```bash
cd code
./gradlew build
```

Then either:

- Drop `code/build/libs/modern_mod_pack-1.0.0.jar` into a CurseForge **Minecraft 1.20.1 Forge** instance `mods` folder, or
- Create a CurseForge project, set `curseforge_project_id` in `code/gradle.properties`, export `CURSEFORGE_TOKEN`, and run `./gradlew publishCurseForge`

This is a Forge mod. In the CurseForge app, the profile must use Forge for 1.20.1.

Keep Java/Kotlin (and build files) in `code/`. Keep resource-pack-style files in `assets/` under the `modern_mod_pack` namespace.

It is licensed under the [MIT License](LICENSE).
