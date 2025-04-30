package br.com.santander.desafio_santander.principal;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.service.CEPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Scanner;

@RestController
@RequestMapping("/cep")
public class Principal {

    private Scanner leitura = new Scanner(System.in);
//    private ConsumoAPI consumoAPI = new ConsumoAPI();
//
//    private ConversorDados conversor = new ConversorDados();
//
//    private final String ENDERECO = "https://viacep.com.br/ws/";
//
//    private final EnderecoRepository enderecoRepository;

    @Autowired
    private CEPService cepService;


//    @Autowired
//    public Principal(EnderecoRepository enderecoRepository){
//        this.enderecoRepository = enderecoRepository;
//    };

    /*
    public void exibeCEP() throws IOException, InterruptedException {

        var opcao = -1;

        while (opcao != 0){
            var menu = """
                1 - Buscar CEP
                2 - Limpar banco de CEP

                0 - Sair
                """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    cepService.buscarCEP(cep);
                    break;
                case 2:
                    limparBanco();
                    break;
                case 0:
                    System.out.println("Fechando aplicação!");
                    break;
                default:
                    System.out.println("Opção inexistente.");
            }

        }

    }

     */

    @GetMapping("/{cep}")
    public EnderecoDTO obterPorID(@PathVariable String cep){
        return cepService.buscarCEP(cep);
    }

//    private void buscarCEP() {
//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .setLenient()
//                .create();
//        EnderecoDTO enderecoDTO = gson.fromJson(getEndereco(), EnderecoDTO.class);
//        Endereco endereco = new Endereco(enderecoDTO);
//        enderecoRepository.save(endereco);
//        System.out.println(enderecoDTO);
//    }
//
//    private String getEndereco() {
//        System.out.println("Digite o CEP para acrescentar ao banco: ");
//        var cep = leitura.nextLine();
//        var json = consumoAPI.obterDados(ENDERECO + cep.replace("-","") + "/json/");
//        return json;
//    }
//
//    private void limparBanco(){
//        enderecoRepository.deleteAll();
//    }
}
