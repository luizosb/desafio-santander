package br.com.santander.desafio_santander.service;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.model.Endereco;
import br.com.santander.desafio_santander.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CEPService {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private ConversorDados conversor = new ConversorDados();

    private final String ENDERECO = "https://viacep.com.br/ws/";

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoDTO buscarCEP(String cep) {

        Optional<Endereco> endereco = enderecoRepository.findByCep(cep);

        if(endereco.isPresent()){
            Endereco e = endereco.get();
            return new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),s.getAvaliacao(),s.getGenero(),s.getAtores(),s.getPoster(), s.getSinopse());
        }
        return null;
    }


    /*
    public void buscarCEP() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setLenient()
                .create();
        EnderecoDTO enderecoDTO = gson.fromJson(getEndereco(), EnderecoDTO.class);
        Endereco endereco = new Endereco(enderecoDTO);
        enderecoRepository.save(endereco);
        System.out.println(enderecoDTO);
    }

    public String getEndereco() {
        System.out.println("Digite o CEP para acrescentar ao banco: ");
        var cep = leitura.nextLine();
        var json = consumoAPI.obterDados(ENDERECO + cep.replace("-","") + "/json/");
        return json;
    }

     */
}
