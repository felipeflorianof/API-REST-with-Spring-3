package med.voll.api.getJson;

import jakarta.validation.constraints.NotNull;
import med.voll.api.AddressData.AddressData;

public record updateJson(
        @NotNull
        Long id,
        String nome,
        String idade,
        String email,
        String telefone,
        AddressData endereco
) { }
