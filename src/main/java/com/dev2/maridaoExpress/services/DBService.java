package com.dev2.maridaoExpress.services;

import com.dev2.maridaoExpress.domain.Chamado;
import com.dev2.maridaoExpress.domain.Cliente;
import com.dev2.maridaoExpress.domain.Tecnico;
import com.dev2.maridaoExpress.domain.enums.*;
import com.dev2.maridaoExpress.repositories.ChamadoRepository;
import com.dev2.maridaoExpress.repositories.ClienteRepository;
import com.dev2.maridaoExpress.repositories.UsuarioRepository;
import com.dev2.maridaoExpress.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Valdir bolado", "68579018064", "valdir@email.com", "132");
        tec1.addPerfil(Perfil.ADMIN);
        Tecnico tec2 = new Tecnico(null, "Richard Stallman", "903.347.070-56", "stallman@mail.com","123");
        Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "271.068.470-54", "shannon@mail.com", "323");
        Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "162.720.120-39", "lee@mail.com", "153");
        Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "778.556.170-27", "linus@mail.com", "923");

        Cliente cli1 = new Cliente(null, "Linus Torvalds", "85490498587", "linux@email.com", "423");
        Cliente cli2 = new Cliente(null, "Marie Curie", "322.429.140-06", "curie@mail.com", "127");
        Cliente cli3 = new Cliente(null, "Charles Darwin", "792.043.830-62", "darwin@mail.com", "116");
        Cliente cli4 = new Cliente(null, "Stephen Hawking", "177.409.680-30", "hawking@mail.com", "473");
        Cliente cli5 = new Cliente(null, "Max Planck", "081.399.300-83", "planck@mail.com", "199");


        Chamado c1 = new Chamado(null, LocalDate.now(),null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado!", tec1, cli4);
        Chamado c2 = new Chamado(null, LocalDate.now(),null,Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
        Chamado c3 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
        Chamado c4 = new Chamado(null, LocalDate.now(),null,Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
        Chamado c5 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
        Chamado c6 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 6", "Teste chamado 6", tec5, cli3);
        Chamado c7 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 7", "Teste chamado 7", tec1, cli1);
        Chamado c8 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 8", "Teste chamado 8", tec3, cli5);
        Chamado c9 = new Chamado(null, LocalDate.now(),null,Prioridade.ALTA, Status.ABERTO, "Chamado 9", "Teste chamado 9", tec1, cli5);
        Chamado c10 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ENCERRADO, "Chamado 10", "Teste chamado 10", tec1, cli2);
        Chamado c11 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 11", "Teste chamado 11", tec3, cli3);
        Chamado c12 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 12", "Teste chamado 12", tec4, cli5);
        Chamado c13 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 13", "Teste chamado 13", tec5, cli3);
        Chamado c14 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 14", "Teste chamado 14", tec1, cli1);
        Chamado c15 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ENCERRADO, "Chamado 15", "Teste chamado 15", tec3, cli5);
        Chamado c16 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ENCERRADO, "Chamado 16", "Teste chamado 16", tec4, cli5);
        Chamado c17 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 17", "Teste chamado 17", tec1, cli5);
        Chamado c18 = new Chamado(null, LocalDate.now(),null,Prioridade.ALTA, Status.ENCERRADO, "Chamado 18", "Teste chamado 18", tec1, cli5);
        Chamado c19 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 19", "Teste chamado 19", tec3, cli5);
        Chamado c20 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ENCERRADO, "Chamado 20", "Teste chamado 20", tec1, cli4);
        Chamado c21 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 21", "Teste chamado 21", tec4, cli1);
        Chamado c22 = new Chamado(null, LocalDate.now(),null,Prioridade.BAIXA, Status.ENCERRADO, "Chamado 22", "Teste chamado 22", tec3, cli5);
        Chamado c23 = new Chamado(null, LocalDate.now(),null,Prioridade.MEDIA, Status.ENCERRADO, "Chamado 23", "Teste chamado 23", tec1, cli2);


        usuarioRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));

        chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
                c17, c18, c19, c20, c21, c22, c23));
    }

}
