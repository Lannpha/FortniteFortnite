import java.io.*;

public class ArchiveTwo
{
  public static void main(String [] args) throws IOException
  {
    Reader in = new Reader();

    int animeWatched = in.nextInt();
    int desiredRating = in.nextInt();
    int totalRatings = 0;
    
    for(int i = 0; i < animeWatched; i++)
    {
      totalRatings += in.nextInt();
    }

    double result = ((double)desiredRating*animeWatched - totalRatings)/(10 - desiredRating);
    System.out.println((int)Math.ceil(result));

  }

  static class Reader 
  { 
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
        
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read();

            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');

            return ret; 
        } 

        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
  } 

} 
