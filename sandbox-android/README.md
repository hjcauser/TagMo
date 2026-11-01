# Android Sandbox Functional v1.6

Isolated Android build experiment for the ChatGPT GitHub sandbox project.

- Java source uses a native Activity, a text view and a clickable button.
- Tap updates a counter (real compiled application logic).
- Gradle 8.13, AGP 8.13.2, compileSdk 35, targetSdk 35, minSdk 26.
- The workflow produces a signed debug APK, checks it and uploads it as a CI artifact.
- Existing TagMo application files and master are unchanged.

Build acceptance remains pending until GitHub Actions produces a successful run. No APK should be described as tested on a phone until it has been installed and executed.
