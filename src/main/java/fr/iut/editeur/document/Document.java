package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String part = this.texte.substring(start, end);
        part = part.toUpperCase();
        remplacer(start,end,part);
    }

    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    public void clear(){
        this.texte="";
    }




}
