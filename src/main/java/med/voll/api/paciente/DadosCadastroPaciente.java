package med.voll.api.paciente;

import med.voll.api.endereco.DadosEnderecos;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEnderecos endereco
) {
}
