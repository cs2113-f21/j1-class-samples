public class GWStudent extends GWPerson {
    
    public GWStudent(String fname, String lname, String GWID, String uname){
        super(fname,lname,GWID,uname);
    }
    public String email(){
        return this.uname+"@gwmail.gwu.edu";
    }
}
