package br.com.booksmy.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum BookCategories {
    FICCAO("Ficção", Arrays.asList(
            "Ficção Geral", "Romance", "Ficção Científica", "Fantasia", "Suspense", "Mistério", "Ficção Histórica", "Distopia"
    )),
    NAO_FICCAO("Não Ficção", Arrays.asList(
            "Biografia", "História", "Ciência", "Autoajuda", "Economia", "Política", "Viagens", "Gastronomia"
    )),
    INFANTIL("Infantil", Arrays.asList(
            "Livros Ilustrados", "Ficção Infantil", "Não Ficção Infantil", "Livros para Pré-Escola", "Livros para Jovens Leitores"
    )),
    JOVEM_ADULTO("Jovem Adulto", Arrays.asList(
            "Romance YA", "Fantasia YA", "Ficção Científica YA", "Thriller YA"
    )),
    CLASSICOS("Clássicos", Arrays.asList(
            "Clássicos da Literatura Brasileira", "Clássicos da Literatura Estrangeira"
    )),
    HQS_MANGAS("HQs/Mangás", Arrays.asList(
            "Super-heróis (Marvel, DC)", "Mangás (Shonen, Shojo, Seinen)", "Quadrinhos Independentes"
    )),
    ARTE_FOTOGRAFIA("Arte e Fotografia", Arrays.asList(
            "Pintura", "Escultura", "Fotografia", "Design"
    )),
    RELIGIAO_ESPIRITUALIDADE("Religião e Espiritualidade", Arrays.asList(
            "Cristianismo", "Budismo", "Hinduísmo", "Espiritualidade", "Esoterismo"
    ));

    private final String description;
    private final List<String> subcategories;

    BookCategories(String description, List<String> subcategories){
        this.description = description;
        this.subcategories = Collections.unmodifiableList(subcategories);
    }

    public String getDescription(){
        return description;
    }

    public List<String> getSubcategories(){
        return subcategories;
    }

}
