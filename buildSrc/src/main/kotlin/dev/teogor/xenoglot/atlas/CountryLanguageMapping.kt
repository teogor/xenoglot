package dev.teogor.xenoglot.atlas

import kotlinx.serialization.Serializable

@Serializable
public data class CountryLanguageMapping(
  public val countryCode: String,
  public val languageCodes: List<String>
)
