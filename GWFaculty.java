public class GWFaculty extends GWPerson{

    public GWFaculty(String fname, String lname, String GWID, String uname){
        super(fname,lname,GWID,uname);
    }
    public String email(){
        return this.uname+"@email.gwu.edu";
    }
    
}
