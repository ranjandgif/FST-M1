package Activity8;

public class Activity8 {

    static void exceptionTest(String message) throws CustomException 
    {

        if (message== null)
        {

            throw new CustomException ("having exception ");
        }
        else{System.out.println(message);
        }
    }


    public static void main(String[] args) {

        try {
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("print the word");
            
        } catch (Exception e) {
      
            System.out.println(e.getMessage());

        }
    }




        



        
    }


