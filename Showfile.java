import java.io.*;
class Showfile
{
    public static void main(String args[]) throws IOException 
    {
        String source = "hello world";
        byte buf[] = source.getBytes();
        FileOutputStream fi = null;
        int i;
        try 
        {
            fi = new FileOutputStream("file.txt");
            for (i = 0; i < buf.length; i++) 
            {
                fi.write(buf[i]);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An I/O error occurred");
        } 
        finally 
        {
            if (fi != null) 
            {
                try 
                {
                    fi.close();
                } catch (IOException e) 
                {
                    System.out.println("Error closing output stream");
                }
            }
        }

        try 
        {
            if (args.length == 0) 
            {
                System.out.println("Please provide a filename as a command-line argument.");
                return;
            }

            fin = new FileInputStream(args[0]); // Open the file passed as argument
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found");
            return;
        }
        try 
        {
            do
            {
                i = fin.read();
                if (i != -1) 
                {
                    System.out.print((char) i);
                }
            } 
            while (i != -1);
        } 
        finally 
        {
            if (fin != null)
            {
                try 
                {
                    fin.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Error closing input stream");
                }
            }
        }
    }
}

