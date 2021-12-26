package br.com.cottapedro.avengers.domain.avenger

data class Avenger(
        val id:          Long? = null,
        val nick:        String,
        val person:      String,
        val description: String?,
        val history:     String?
)
