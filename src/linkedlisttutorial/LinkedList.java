package linkedlisttutorial;


public class LinkedList {
    private Student s=null; // Başqa classlarda yaradılan obyektlərdə müdaxilə olunmasının qarşısını almaq üçün private olmalıdır
    
    public void write(){ // Bütün elementləri yazdırır
        Student wr=s;
        while(wr!=null){
            wr.print();
            wr=wr.next;
        }
    }
    
    public int length(){ //elementin uzunluğunu təyin edir
        int length=0;
        Student wr=s;
        while(wr!=null){
            length++;
            wr=wr.next;
        }  
        return length;
    }
    
    public void addFirst(Student st){ // elementi 1-ci sıraya və ya 0-cı index-ə əlavə edir.  
        if(s==null){
            s=st;
        }else{
            st.next=s;
            s=st;
        }
    }
    
    public void addLast(Student st){ //elementi axrıncı sıraya əlavə edir
        if(s==null){
            s=st;
        }else{
            get(length()-1).next=st;            
        }
    }
    
    public void deleteFirst(){ //birinci sırada olan elementi silir yerinə ondan sonra gələn elementi keçirdir
        if(s==null){
            System.out.println("Element boşdur");
        }else{
            s=s.next;
        }
    } 
    
    public void deleteLast(){ //axrıncı sırada olan elementi silir
        if(s==null){
            System.out.println("Element boşdur");
        }else{
            if(length()==1){
                s=null;
            }else{
                get(length()-2).next=null;
            }
        }
        
    }
    
    public void addIndex(Student st,int index){ //index-ə uyğun olaraq elementi o sıraya əlavə edir və obirilərini 1 sıra qabağa atır
        if(index>length()-1 || index<0  ){
            throw new ArrayIndexOutOfBoundsException("Bu index-də element yoxdur");
        }else{
            if(index==0){
                addFirst(st);
            }else{
                st.next=get(index);
                get(index-1).next=st;
            }
        }
    }
    
    public void deleteIndex(int index){ //işarə olunan indexdə elementi silir və ondan sonra gələn elementi onun yerinə keçirdir
        if(index>length()-1 || index<0  ){
            throw new ArrayIndexOutOfBoundsException("Bu index-də element yoxdur");
        }else{
            if(index==0){
                deleteFirst();
            }else if(index==length()-1){
                deleteLast();
            }else{
                get(index-1).next=get(index).next;
            }
        }        
                             
    }
    
    public Student get(int index){ // işarə olunan indexdə olan obyekti return edir
        Student wr=s;
        if(index>length()-1 || index<0  ){
            throw new ArrayIndexOutOfBoundsException("Bu index-də element yoxdur");
        }else{
            int b=0;
            while(b<length()){
                if(b==index){
                    break;
                }else{
                    b++;
                    wr=wr.next;
                }      
            }          
        }
        return wr;
    }
    
    
    
    
}
