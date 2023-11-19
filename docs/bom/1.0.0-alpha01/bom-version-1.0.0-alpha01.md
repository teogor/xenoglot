# Xenoglot BoM v1.0.0-alpha01 (Bill of Materials)

The Xenoglot BoM (Bill of Materials) enables you to manage all your Xenoglot library versions by specifying only one version — the BoM's version.

When you use the Xenoglot BoM in your app, the BoM automatically pulls in the individual library versions mapped to the BoM's version. All the individual library versions will be compatible. When you update the BoM's version in your app, all the Xenoglot libraries that you use in your app will update to the versions mapped to that BoM version.

To learn which Xenoglot library versions are mapped to a specific BoM version, check out the release notes for that BoM version. If you need to compare the library versions mapped to one BoM version compared to another BoM version, use the comparison widget below.

Learn more about [Gradle's support for BoM platforms](https://docs.gradle.org/4.6-rc-1/userguide/managing_transitive_dependencies.html#sec:bom_import).

Here's how to use the Xenoglot BoM to declare dependencies in your module (app-level) Gradle file (usually app/build.gradle.kts). When using the BoM, you don't specify individual library versions in the dependency lines.

```kt
dependencies {
  // Import the BoM for the Xenoglot platform
  implementation(platform("dev.teogor.xenoglot:bom:1.0.0-alpha01"))

  // Declare the dependencies for the desired Xenoglot products
  // without specifying versions. For example, declare:
  // Xenoglot Core
  implementation("dev.teogor.xenoglot:core")
  // Xenoglot Android
  implementation("dev.teogor.xenoglot:android")
}
```

## Latest SDK versions

| Status | Service or Product | Gradle dependency | Latest version |
| ------ | ------------------ | ----------------- | -------------- |
| 🧪 | [android](/android) | dev.teogor.xenoglot:android | 1.0.0-alpha01 |
| 🧪 | [core](/core) | dev.teogor.xenoglot:core | 1.0.0-alpha01 |

### Explore Further

For the latest updates, in-depth documentation, and a comprehensive overview of the Xenoglot ecosystem, visit the official [Xenoglot documentation](/docs/). It's your gateway to a wealth of resources and insights that will elevate your Xenoglot development journey.

Stay informed, stay current, and embrace the full potential of Xenoglot.
