/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kendall
 */
public class person {
    String fName;
    String lName;
    String Birthday;
    int id;

    public person(String fName, String lName, String Birthday, int id) {
        this.fName = fName;
        this.lName = lName;
        this.Birthday = Birthday;
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public int getId() {
        return id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
    
    
    
    
}
