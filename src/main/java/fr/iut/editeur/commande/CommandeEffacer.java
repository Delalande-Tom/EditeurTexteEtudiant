package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            error();
            return;
        }
        try {
            int start = Integer.parseInt(parameters[1]);
            int end = Integer.parseInt(parameters[2]);
            this.document.effacer(start,end);
            super.executer();
        }
        catch (NumberFormatException e){
            error();
        }

    }

    private void error(){
        System.err.println("Format attendu : effacer;depart;fin");
    }

}
