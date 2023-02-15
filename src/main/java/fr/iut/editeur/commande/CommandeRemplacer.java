package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            error();
            return;
        }
        try {
            int start = Integer.parseInt(parameters[1]);
            int end = Integer.parseInt(parameters[2]);
            String replaceText = parameters[3];
            this.document.remplacer(start,end,replaceText);
            super.executer();
        }
        catch (NumberFormatException e){
            error();
        }

    }

    private void error(){
        System.err.println("Format attendu : remplacer;depart;fin;chaine");
    }

}
