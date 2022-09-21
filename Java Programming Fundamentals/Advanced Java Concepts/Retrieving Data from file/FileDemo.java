import java.io.File;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.io.IOException;
public class FileDemo
{
    public static void main(String[] args)
    {
        try{
            FileReader filereader=new FileReader(new File("log.txt"));
            int n;
            StringBuilder stringBuilder= new StringBuilder();
            while((n=filereader.read())!=-1){
                stringBuilder.append((char)n);
            }
            System.out.println(stringBuilder.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
}