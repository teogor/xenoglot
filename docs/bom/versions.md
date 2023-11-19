## Xenoglot BoM (Bill of Materials)

The BoM (Bill of Materials) is the central hub for managing library versions within the Xenoglot project.
It enables you to effortlessly keep track of the latest versions of key components and dependencies.

### Latest Version

Here is how to declare dependencies using the latest version `1.0.0-alpha01`:

```kt
dependencies {
  // Import the BoM for the Xenoglot platform using the latest version
  implementation(platform("dev.teogor.xenoglot:bom:1.0.0-alpha01"))
}
```

## BoM Versions (Bill of Materials)

Below is a list of the latest versions of the BOM:

| Version | Release Notes | Release Date |
| ------- | ------------- | ------------ |
| 1.0.0-alpha01 | [changelog 🔗](/docs/bom/1.0.0-alpha01/bom-version-1.0.0-alpha01.md) | 18 Nov 2023 |

The **Bill of Materials (BoM)** serves as a cornerstone for maintaining synchronization among various libraries and components in your project. By centralizing version management, it significantly reduces compatibility issues and streamlines the entire dependency management process.

### Advantages of Using the BoM

- **Synchronization:** The BoM guarantees that all libraries within your project are aligned, ensuring seamless compatibility.
- **Staying Current:** By adopting the BoM, you effortlessly stay updated with the latest advancements within the ever-evolving Xenoglot ecosystem.

### Explore Further

For in-depth insights, updates, and comprehensive information regarding Xenoglot, please consult the official [Xenoglot documentation](/docs/). There, you'll discover a wealth of resources to enhance your Xenoglot development journey.
