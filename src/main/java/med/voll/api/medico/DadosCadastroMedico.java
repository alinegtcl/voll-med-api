package med.voll.api.medico;

import med.voll.api.endereco.DadosEnderecos;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEnderecos endereco
) {
}
