/**
@author Colin McQuinn
@version 11-22-2021
*/
class Sugar extends Cookie {
  String shape;
  boolean decorated;

Sugar(){
  shape = "";
  decorated = false;
}

Sugar(String aShape){
  shape = aShape;
  decorated = false;
}

public String getShape() {
  return shape;
}

void changeShape(String aShape){
  shape = aShape;
}

void cutShape(String aShape, int aNumber){
  shape = aShape;
  setNumber(aNumber);
  System.out.println(count + " Cookies were cut into " + shape);
}
void decorateCookies() {
if(isBaked() == true){
  decorated = true;
  System.out.println("The cookies were decorated");
}
else {
System.out.println("Make sure the cookies are baked first");
}
}
}