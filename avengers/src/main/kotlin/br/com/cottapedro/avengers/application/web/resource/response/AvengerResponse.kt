package br.com.cottapedro.avengers.application.web.resource.response

import br.com.cottapedro.avengers.domain.avenger.Avenger
import com.sun.istack.NotNull
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class AvengerResponse(
            val id:          Long?,
            val nick:        String,
            val person:      String,
            val description: String?,
            val history:     String?
) {
    companion object{
        fun from(avenger: Avenger) = AvengerResponse(
                id = avenger.id,
                nick = avenger.nick,
                person = avenger.person,
                description = avenger.description,
                history = avenger.history
        )
    }
}

