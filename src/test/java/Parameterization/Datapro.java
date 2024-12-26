package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro{
  @Test(dataProvider = "beta")
  public void login(String user,String password) {
	  System.out.print(user);
	  System.out.print(password);
  }
  @DataProvider (name="data")
  public String [][] getdata(){
	  String [][]values= {{"atchuth","A1234"},{"vicky","V1234"},{"devi","D1234"},{"Chinnu","C1234"},{"Simba","S1234"},{"devicky","DV1234"}};
	  return values;
  }
  @DataProvider(name="beta")
  public String[][]getbeta(){
	  String [][]str= {{"chinnu","C123"},{"Devi","D123"}};
	  return str;
  }
}
