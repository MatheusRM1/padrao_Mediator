package org.mediator;

public class Hospital implements Setor {

    private static Hospital instancia = new Hospital();

    private Hospital() {}

    public static Hospital getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoConsulta(String mensagem) {
        return "O Hospital recebeu a solicitação de consulta: " + mensagem;
    }

    public String receberSolicitacaoInformacao(String mensagem) {
        return "O Hospital recebeu a solicitação de informação: " + mensagem;
    }

    public String receberSolicitacaoAtendimento(String mensagem) {
        return "O Hospital recebeu a solicitação de atendimento: " + mensagem;
    }
}