package br.com.cottapedro.avengers.application.web.resource.request

import br.com.cottapedro.avengers.domain.avenger.Avenger
import com.sun.istack.NotNull
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class AvengerRequest(
            @field:NotNull
            @field:NotBlank
            @field:NotEmpty
            val nick:        String,
            @field:NotNull
            @field:NotBlank
            @field:NotEmpty
            val person:      String,
            val description: String? = "",
            val history:     String? = ""
)
{
//    companion object{
//        fun to() = Avenger(
//
//        )
//    }

    fun toAvenger() = Avenger(
            nick = nick,
            person = person,
            description = description,
            history = history
    )

    companion object{
        fun to(id: Long?, request: AvengerRequest) = Avenger(
            id = id,
            nick = request.nick,
            person = request.person,
            description = request.description,
            history = request.history

        )
    }
}
