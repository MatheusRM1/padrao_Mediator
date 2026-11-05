package org.mediator;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String solicitarConsultaHospital(String mensagem) {
        return "A Central de Atendimento recebeu sua solicitação.\n" +
                "O Hospital respondeu conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberSolicitacaoConsulta(mensagem);
    }

    public String solicitarInformacaoHospital(String mensagem) {
        return "A Central de Atendimento recebeu sua solicitação.\n" +
                "O Hospital respondeu conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberSolicitacaoInformacao(mensagem);
    }

    public String solicitarAtendimentoHospital(String mensagem) {
        return "A Central de Atendimento recebeu sua solicitação.\n" +
                "O Hospital respondeu conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberSolicitacaoAtendimento(mensagem);
    }

}