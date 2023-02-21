package med.voll.api.endereco;

public record DadosEnderecos(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero
) {
}
