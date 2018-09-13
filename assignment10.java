import java.io.*;
class assignment10{
      public static void main(String args[]){
                 File f=new File("C:/Users/rishav chauhan  .LAPTOP-BQC83S14/Desktop/java.txt");
                 File g=new File("C:/Users/rishav chauhan  .LAPTOP-BQC83S14/Desktop/java12.txt");
                 char c[]=new char[10000];
                      int i,k=0;
                 try{
                     FileInputStream fin=new FileInputStream(f);

                     i=fin.read();
                     while(i!=-1){
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }

                 }
                 catch(IOException e){
                   System.out.println(e);
                 }

                 try{
                   FileOutputStream fout=new FileOutputStream(g);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File copied");
                 }
                 catch(IOException e){
                   System.out.println(e);

                 }
                 try{
            FileInputStream fin=new FileInputStream(g);
        int i1;
        i1=fin.read();
        while(i1!=-1){
            c[k++]=(char)i1;
            System.out.println(i1+" : "+(char)i1);
            i1=fin.read();
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
      }
}
