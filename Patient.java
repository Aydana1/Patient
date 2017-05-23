
package patientdeque.impl;


public class Patient {
    private String name;
    private boolean senior;
    
    public Patient(String name, boolean senior){
    this.name=name;
    this.senior=senior;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the senior
     */
    public boolean isSenior() {
        return senior;
    }

    /**
     * @param senior
     */
    public void setisSenior(boolean senior) {
        this.senior = senior;
    }
    
    
    @Override
    public String toString(){
        return "Name: " + name + " status: " + senior;
    }
}
