package gigabytegirls.communityalliance;

/**
 * Created by mattiesanseverino on 4/12/17.
 */

public class RContact {
    int id;
    String name, user, pass;
//    public RContact(int id, String name, String user, String pass, String phone){
//
//        this.name = name;
//        this.user = user;
//        this.phone = phone;
//        this.pass = pass;
//     }
    public void setRID(int id){
        this.id = id;
    }
    public void setRName(String name){
        this.name = name;
    }
    public void setRUser(String user){
        this.user = user;
    }
    public void setRPass(String pass){
        this.pass = pass;
    }
    //public void setRPhone(String phone){
      //  this.phone = phone;
   // }
    public int getRID(){
        return id;
    }
    public String getRName(){
        return name;
    }
    public String getRUser(){
        return user;
    }
    public String getRPass(){
        return pass;
    }
    //public String getRPhone(){
    //    return phone;
    //}
    public String toString(){
        return "name:" + this.name + " uname: "+this.user+" pass: "+this.pass;
    }

}
