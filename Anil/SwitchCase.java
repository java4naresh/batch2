class SwitchCase{
  public static void main(String args[]){
     int number = 89;
     String size;

     switch(number){
     case 20:
     size ="low";
      break;
     case 45:
      size = "medium";
      break;
    case 70:
    size ="large" ;
    break;
    case 89:
   size = "extra large";
    break;
   
    default:
     System.out.println(" default case");
    }
   }
  }