import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mediator.*;

class PacienteTest {

    @Test
    void deveSolicitarConsulta() {
        Paciente paciente = new Paciente();
        assertEquals("A Central de Atendimento recebeu sua solicitação.\n" +
                        "O Hospital respondeu conforme mensagem a seguir.\n" +
                        ">>O Hospital recebeu a solicitação de consulta: Consulta com cardiologista",
                paciente.solicitarConsulta("Consulta com cardiologista"));
    }

    @Test
    void deveSolicitarInformacao() {
        Paciente paciente = new Paciente();
        assertEquals("A Central de Atendimento recebeu sua solicitação.\n" +
                        "O Hospital respondeu conforme mensagem a seguir.\n" +
                        ">>O Hospital recebeu a solicitação de informação: Horário de visitas",
                paciente.solicitarInformacao("Horário de visitas"));
    }

    @Test
    void deveSolicitarAtendimento() {
        Paciente paciente = new Paciente();
        assertEquals("A Central de Atendimento recebeu sua solicitação.\n" +
                        "O Hospital respondeu conforme mensagem a seguir.\n" +
                        ">>O Hospital recebeu a solicitação de atendimento: Atendimento de emergência",
                paciente.solicitarAtendimento("Atendimento de emergência"));
    }

}
