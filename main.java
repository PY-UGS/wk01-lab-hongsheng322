class Main {
    public static void main(String arg[])   
    {   
      //example 1
      System.out.println("hello world!"); 
      //example 3
      String module = "CSC1009";
      switch(module)   
      {   
          case "CSC1006":   
              System.out.println("Math 2"); 
              break;   
          case "CSC1007":   
              System.out.println("Operating Systems"); 
              break;   
          case "CSC1008":   
              System.out.println("Data Structure"); 
              break;   
          case "CSC1009":   
              System.out.println("Object-Oriented Programming"); 
              break;   
          default:    
              System.out.println("Unknown Module"); 
              break;   
      }   
      System.out.println("After switch");   

      //example 4
      for (int i= 102; i >65; i--)
      {
        if (i%2 == 1)
            System.out.println(i);    
      }
    }

}