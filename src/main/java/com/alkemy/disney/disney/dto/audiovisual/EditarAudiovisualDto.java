package com.alkemy.disney.disney.dto.audiovisual;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Necesario para editar una película o serie.")
public class EditarAudiovisualDto {

    @ApiModelProperty(value = "Título de la película o serie.", dataType = "String", example = "Avengers", allowableValues = "range[1,150]", required = true, position = 1)
    @NotBlank
    @Size(max = 150)
    private String titulo;

    @ApiModelProperty(value = "Fecha de la película o serie.", dataType = "LocalDate", example = "2020-12-21", required = true, position = 2)
    @NotNull
    private LocalDate fechaDeEstreno;

    @ApiModelProperty(value = "Calificación de la película o serie.", dataType = "double", example = "3.5", allowableValues = "range[0,5]", required = true, position = 3)
    @NotNull
    @Min(0)
    @Max(5)
    private double calificacion;

    @ApiModelProperty(value = "Id del género al que pertenece la película o serie.", dataType = "String", example = "1", allowableValues = "range[1,infinity]", required = true, position = 4)
    @NotNull
    @Min(1)
    private long generoId;
}
