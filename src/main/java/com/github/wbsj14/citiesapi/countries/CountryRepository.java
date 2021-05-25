package com.github.wbsj14.citiesapi.countries;

import org.springframework.data.jpa.repository.JpaRepository;

//Esse "JpaRepository" recebe 2 parâmetros, o tipo da entidade que queremos criar o repositorio, nesse caso, Country(paises)
//e o tipo do identificador desta entidade, no nosso caso, é integer( tipo de dado do "id")

public interface CountryRepository extends JpaRepository<Country, Integer> {
    //disse pro Spring: "Voce representa um repositorio de paises"
    //O Spring já nos dá de bandeja todas as implementações básicas para manipular banco de dados, incluindo o find all
}
