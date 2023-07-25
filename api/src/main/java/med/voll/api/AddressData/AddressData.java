package med.voll.api.AddressData;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


public record AddressData(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String estado,
        @NotBlank
                @Pattern(regexp = "\\d{8}")
        String cep
) { }
