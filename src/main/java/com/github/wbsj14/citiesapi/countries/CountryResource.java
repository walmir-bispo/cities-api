package com.github.wbsj14.citiesapi.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;


@RestController
@RequestMapping("/countries")     //quando escrever "\countries" algo deve acontecer
public class CountryResource {

    @Autowired //Pede pro Spring injetar esse repositorio de paises
    private CountryRepository repository; //É um banco de dados de paises, um repositório de paises

    @GetMapping  // método GET do HTTP. To falando pro spring fazer um GET e me retornar uma lista de paises ao digitar  "\countries"
    public Page<Country> countries(Pageable page){ //esse Pageable eh uma ferramenta proporcionada pelo Spring
        return repository.findAll(page);           //que nos retorna uma pagina. Eu ganhei uma paginação do meu banco de dados
    }                                              //e com isso podemos realizar algumas operação como por exemplo: nº de elementos por pagina,
                                                   //posso ordenar os elementos etc.





    /*

    @GetMapping("{/id}")                                          //Ao digitar "localhost..../id deve me retornar o pais com aquele id especifico
    public Country getOne(@PathVariable Integer id){
        Optional <Country> optional = repository.findById(id);     //O Optional lança uma exceção caso eu procure por um ID que nao existe
        return optional.get();
    }

    */
}
