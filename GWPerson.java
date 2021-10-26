public abstract class GWPerson {
    protected String fname;
    protected String lname;
    protected String GWID;
    protected String uname;

    public GWPerson(String fname, String lname, String GWID, String uname){
        this.fname =fname;
        this.lname = lname;
        this.GWID = GWID;
        this.uname = uname;
    }
    
    public boolean before(GWPerson p){
        //last name not the same
        if(! this.lname.equals(p.lname)){ 
            return this.lname.compareTo(p.lname) < 0;
        }
        //first name not the same
        if(! this.fname.equals(p.fname)){
            return this.fname.compareTo(p.fname) < 0;
        }
        //first and last name the same, compare GWID's
        return this.GWID.compareTo(p.GWID)<0;
    }

    public String fullname(){
        return this.fname+ " " + this.lname;

    }

    public String toString(){
        return this.lname+", "+
                this.fname+
                "("+this.GWID+","
                +this.uname+","
                +this.email()+")";
    }


    //this method cannot be defined here and must be implemnted in the subclass
    public abstract String email(); //abstract method
}
