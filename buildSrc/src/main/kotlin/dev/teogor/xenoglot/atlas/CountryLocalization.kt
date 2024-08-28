package dev.teogor.xenoglot.atlas

import kotlinx.serialization.Serializable

@Serializable
data class CountryLocalization(
  val code: String,
  val language: String,
  val country: String,
)
