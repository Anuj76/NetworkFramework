import nframework.server.*;
import nframework.server.annotations.*;
@Path("/banking")
public class Bank
{
@Path("/branchName")
public String getBranchName(String city) throws BankingException
{
if(city.equals("Ujjain"))
{
return "Freeganj";
}
if(city.equals("Indore"))
{
return "VijayNagar";
}
throw new BankingException("No branch in that city");
}
public static void main(String gg[])
{
NFrameworkServer server=new NFrameworkServer();
server.registerListener(Bank.class);
server.start();
}
}