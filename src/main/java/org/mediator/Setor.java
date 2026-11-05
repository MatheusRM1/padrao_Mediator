package org.mediator;

public interface Setor {
    String receberSolicitacaoConsulta(String mensagem);
    String receberSolicitacaoInformacao(String mensagem);
    String receberSolicitacaoAtendimento(String mensagem);
}