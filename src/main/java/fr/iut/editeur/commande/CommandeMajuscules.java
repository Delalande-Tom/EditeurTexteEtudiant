package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {


    public CommandeMajuscules(Document document, String[] parameters) {
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
            this.document.majuscules(start,end);
            super.executer();
        }
        catch (NumberFormatException e){
            error();
        }

    }

    private void error(){
        System.err.println("Format attendu : majuscules;depart;fin");
    }

}
