
package work04;

    public class Person {
        private int ID;
    
        public Person(int ID){this.ID=ID;}
    
        public int getID() {return ID;}
    
        public void setID(int ID) {this.ID = ID;}
    
        public String tostring(){
            return "person(" + ID +")";
        }
    }
