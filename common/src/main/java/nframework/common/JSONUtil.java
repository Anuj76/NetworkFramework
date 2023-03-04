package nframework.common;
import com.google.gson.*;
public class JSONUtil
{
public static String toJson(java.io.Serializable serializable)
{
try
{
Gson gson=new Gson();
return gson.toJson(serializable);
}catch(Exception e)
{
return "{}";
}
}
public static <T> T fromJson(String str,Class<T> c)
{
try
{
Gson gson=new Gson();
return gson.fromJson(str,c);
}catch(Exception e)
{
return null;
}
}
}