
package linkedlisttutorial;

public class LinkedListTutorial {

    public static void main(String[] args) {
       try{
           LinkedList i=new LinkedList();
            
           i.addLast(new Student("Ngolo","Kante", "ngolo@gmail.com"));
           i.addLast(new Student("Eden", "Hazard", "eden@gmail.org"));
           i.addLast(new Student("Antonio", "Rudiger", "rudi@hotmail.com"));
           i.addLast(new Student("Gonzalo", "Hiquain", "higu@gmail.com"));
           i.addLast(new Student("Ross", "Barkley", "rossy@gmail.com"));
           i.write();           
           System.out.println("Elementlərin sayı "+i.length());
           System.out.println("--------------");
           
           
           i.addFirst(new Student("Didier", "Drogba", "drogba@gmail.com"));
           i.write();
           System.out.println("Elementlərin sayı "+i.length());          
           System.out.println("--------------");
           
           
           i.addIndex(new Student("Frank", "Lampard", "superfrankie@gmail.com"), 2);
           i.write();
           System.out.println("Elementlərin sayı "+i.length());
           System.out.println("--------------");
           
           i.deleteFirst();
           i.write();
           System.out.println("--------------");
           
           i.deleteLast();
           i.write();
           System.out.println("--------------");
           
           i.deleteIndex(2);
           i.write();
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
