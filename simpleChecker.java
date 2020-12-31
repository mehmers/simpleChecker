import java.util.List;

public class simpleChecker{
  private Object x; //define first element
  private Object y; //define second element
  private List list; //define a list that will be checked

  public simpleChecker(Object x){
    this.x = x;
  } //one argument constructor

  public simpleChecker(Object x, Object y){
    this.x = x;
    this.y = y;
  } //two argument constructor

  public simpleChecker(List list){
    this.list = list;
  } // list constructor


  public String typeOf(){
    return this.x.getClass().toString(); 
  } //one argument typeOf method that returns a String value.

  public boolean isSame(){
    if(x.getClass() == y.getClass()){
      return true;
    }
    else{
      return false;
    }
  } // non-argument isSame method that returns a boolean

  public Object[] toArray(List list){
    return this.list.toArray();
  } // an internal method that converts a list to array.

  public boolean anyDifferent(){
    Object[] array = toArray(list); //before checking,converts list to an array.
    int length = array.length;
    var firstClass = array[0].getClass();
    var different = false;
    for(int i = 0; i<length;i++){
      if(array[i].getClass() != firstClass){
        different = true;
        System.out.println(i+1 + ".Item has different class.\nClass is : " + array[i].getClass());
      }
    }
    if(different == false){
      System.out.println("There is no item that has different class.");
    }
    return different;
  } // non-argument anyDifferent method that checks any element that has different class from first element and prints them,also returns a boolean.

  
}
