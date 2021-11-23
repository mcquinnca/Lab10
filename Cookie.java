/**
@author Colin McQuinn
@version 11-22-2021
*/
class Cookie {
 int count;
 int bakeTemp;
 int bakeTime;
 boolean baked;

/**
This method is the default constructor which sets the count, bakeTemp, and bakeTime to zero and the baked to false.
*/
Cookie(){
count = 0;
bakeTemp = 0;
bakeTime = 0;
baked = false;
}

/**
This method is a constructor which sets the count, favorite baketemp, and bakeTime.
@param aNumber is the number of Cookies
@param aBakeTemp is the temperature at which cookies will be baked
@param ABakeTime is the amount of time which cookies will be baked
*/
Cookie(int aNumber, int aBakeTemp, int aBakeTime){
count = aNumber;
bakeTemp = aBakeTemp;
bakeTime= aBakeTime;
baked = false;
}

/**
This method is an accessor method which checks if the cookies are baked
@return baked whether or not the cookies are baked
*/
public boolean isBaked() {
  return baked;
}

/**
This method is an mutator method which set the number of cookies
@param aNumber is the number of cookies
*/
public void setNumber(int aNumber){
  count = aNumber;
}

/**
This method is an mutator method which sets time time, temperature which cookies are baked, sets baked to true, and lets the user know.
@param aTemparature is the temperature at which cookies are baked
@param aTime is the time for which the cookies are baked
*/
public void bake(int aTemparature, int aTime){
  bakeTemp = aTemparature;
  bakeTime = aTime;
  baked = true;
  System.out.println(count + " were baked at " + bakeTemp + " degrees for " + bakeTime + "minutes");
}
}