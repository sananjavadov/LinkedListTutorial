package linkedlisttutorial;

public class Student {

    public Student(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.next = null;
    }
    
    public String name;
    
    public String surname;
    
    public String mail;
    
    public Student next;
    
    public void print(){
        System.out.println("Ad : "+name+" Soyad : "+surname+" E-Poçt : "+mail);
    }
    
}
