package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecos(

        @NotBlank
        String logradouro,
        @NotNull
        String bairro,
        @NotNull @Pattern(regexp = "\\d{8}")
        String cep,
        @NotNull
        String cidade,
        @NotNull
        String uf,
        String complemento,
        String numero
) {
}
