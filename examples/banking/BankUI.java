import nframework.client.*;
public class BankUI
{
public static void main(String gg[])
{
try
{
NFrameworkClient client=new NFrameworkClient();
String str=(String)client.execute("/banking/branchName",gg[0]);
System.out.println(str);
}catch(Throwable t)
{
System.out.println(t.getMessage());
}
}
}