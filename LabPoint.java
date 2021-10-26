public class LabPoint extends Point{
    
    //no need to define x and y here because we get this from Point

    private String label;
    public LabPoint(int x, int y, String lab){
        super(x, y); //construct the point
        this.label = lab;
    }

    //do not need to implement getX and getY because we get this from Point

    public String getLabel(){return this.label;}
    public void setLabel(String lab){this.label=lab;}

    //if it's a LabPoint call this toString not Point's
    public String toString(){
        return label+": "+ super.toString(); //reuse the prior toString() 
    }
}
