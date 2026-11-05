package org.mediator;

public class Pessoa {

    public String solicitarConsulta(String mensagem) {
        return CentralAtendimento.getInstancia().solicitarConsultaHospital(mensagem);
    }

    public String solicitarInformacao(String mensagem) {
        return CentralAtendimento.getInstancia().solicitarInformacaoHospital(mensagem);
    }

    public String solicitarAtendimento(String mensagem) {
        return CentralAtendimento.getInstancia().solicitarAtendimentoHospital(mensagem);
    }

}
