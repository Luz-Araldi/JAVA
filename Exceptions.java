                                                                                 
public class Exceptions {

    public static void main(String[] args){

        in dolár1,dolár2,res;                                                  

        dolár1=60;
        dolár2=20;

        if(dolár1 > 50){
            throw new IlegalArgumentException("Valor de nota invalido");        
        } 

        if(dolár2 > 50){
            throw new IlegalArgumentException("Valor de nota invalido");        
        } 
        res=dolár1*dolár2;
        System.out.println("Resultado:" + res);    
        
       



       
/* 
        try{
            System.out.println(cars.get(1));
        }catch(IndexOutOfBoundsException e){
            System.out.printin("Fim do Try");
        }    
*/
        /* 
        for(String e:cars){
            System.out.println(e);
        }
        */
         
         }        


    }



}
