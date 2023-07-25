package med.voll.api.getJson;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.AddressData.AddressData;

public record getJson(
    @NotBlank
    String nome,
    @NotBlank
    String idade,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefone,
    @NotNull
    @Valid
    AddressData endereco

) { }





