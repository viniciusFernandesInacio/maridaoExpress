package com.dev2.maridaoExpress.services;

import com.dev2.maridaoExpress.domain.Usuario;
import com.dev2.maridaoExpress.domain.Cliente;
import com.dev2.maridaoExpress.domain.dtos.ClienteDTO;
import com.dev2.maridaoExpress.repositories.UsuarioRepository;
import com.dev2.maridaoExpress.repositories.ClienteRepository;
import com.dev2.maridaoExpress.handlers.exceptions.DataIntegrityViolationException;
import com.dev2.maridaoExpress.handlers.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository tecnicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Cliente findById(Integer id) {
        Optional<Cliente> obj = tecnicoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! ID ----> " + id));
    }

    public List<Cliente> findAll() {
        return tecnicoRepository.findAll();
    }

    public Cliente create(ClienteDTO objDTO) {
        objDTO.setId(null);
        validaPorCpfEEmail(objDTO);
        Cliente newObj = new Cliente(objDTO);
        return tecnicoRepository.save(newObj);
    }

    public Cliente update(Integer id, ClienteDTO objDTO) {
        objDTO.setId(id);
        Cliente oldObj = findById(id);
        validaPorCpfEEmail(objDTO);
        oldObj = new Cliente(objDTO);
        return tecnicoRepository.save(oldObj);
    }

    public void delete(Integer id) {
        Cliente obj = findById(id);
        if(obj.getChamados().size() > 0) {
            throw new DataIntegrityViolationException("Cliente possui ordens de servico e nao pode ser excluido!");
        }
        tecnicoRepository.deleteById(id);
    }

    private void validaPorCpfEEmail(ClienteDTO objDTO) {
        Optional<Usuario> obj = usuarioRepository.findByCpf(objDTO.getCpf());
        if(obj.isPresent() && obj.get().getId() != objDTO.getId()) {
            throw new DataIntegrityViolationException("CPF já cadastrado no sistema!"); //Objects
        }
        obj = usuarioRepository.findByEmail(objDTO.getEmail());
        if(obj.isPresent() && obj.get().getId() != objDTO.getId()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
        }
    }

}
