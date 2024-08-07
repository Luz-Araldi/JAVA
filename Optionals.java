    public class Optionals {
    


    public static void main(String[] args) {

       Cat myCat = findCatByName("Alegria");             

       Object opcionalCat;
    (opcionalCat).map(Cat::getAge)                                  
       .orElse(0);
    }


    private static OpcionalCat findCatByName (String name){                        
      Cat cat = new Cat(name, 3);                                      
      return Optional.ofNullable(cat);                                      

    }
}
