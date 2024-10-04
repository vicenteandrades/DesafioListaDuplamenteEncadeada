package List;

import List.Entities.Studant;

public class TesteLista {
    public static void main(String[] args) {
        ListaDuplamenteLigada<Studant> list = new ListaDuplamenteLigada<>();

        //Adicionar na esquerda
        list.addLeft(new Studant("Vicente"));
        list.addLeft(new Studant("David"));

        //Adicinar na Direita
        list.addRight(new Studant("Joao"));
        list.addRight(new Studant("Maria"));

        System.out.println(list);
    }
}
