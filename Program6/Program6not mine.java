import java.util.*;
import java.io.*;
public class Program6
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(">");
        while(scan.hasNextLine())
        {
             System.out.print("> ");
             String a = scan.nextLine(); 
             String b = "quit";
             String c = "mem";
             String d = "clear";
             if(a.equals(b))
             { 
                System.exit(0);
             }
             else
             {
                  System.out.println(compute(a));
             }
             System.out.print(">");
          } 
      }



      public static String compute(String input)
      {
          List<String> processedList = new ArrayList<String>();
          if (!input.isEmpty()) 
          {
              StringTokenizer st = new StringTokenizer(input);
              while (st.hasMoreTokens())
              {
                 processedList.add(st.nextToken());
              }
          } 
          else
          {
               return "Error";
          }
         Stack<String> tempList = new Stack<String>();

         Iterator<String> iter = processedList.iterator();

         while (iter.hasNext())
         {
            String temp = iter.next();
            if (temp.matches("[0-9]*"))
            {

                tempList.push(temp);
                }
                else if (temp.matches("[*-/+]")) 
                {

                    if (temp.equals("*")) 
                    {
                        int rs = Integer.parseInt(tempList.pop());
                        int ls = Integer.parseInt(tempList.pop());
                        int result = ls * rs;
                        tempList.push("" + result);
                    } 
                    else if (temp.equals("-")) 
                    {
                        int rs = Integer.parseInt(tempList.pop());
                        int ls = Integer.parseInt(tempList.pop());
                        int result = ls - rs;
                        tempList.push("" + result);
                    } 
                    else if (temp.equals("/")) 
                    {
                        int rs = Integer.parseInt(tempList.pop());
                        int ls = Integer.parseInt(tempList.pop());
                        int result = ls / rs;
                        tempList.push("" + result);
                    } 
                    else if (temp.equals("+")) 
                    {
                        int rs = Integer.parseInt(tempList.pop());
                        int ls = Integer.parseInt(tempList.pop());
                        int result = ls + rs;
                        tempList.push("" + result);
                    }

                }
                else
                {
                    return "Error";
                }
            }

         return tempList.pop();
        }
      }


     private static String HashMap(String q)
     {
         List<String> memory = new ArrayList<String>();
         if(!q.isEmpty())
         {
             StringTokenizer var = new StringTokenizer(q);
             while(q.hasMoreTokens())
             {
                  memory.add(q.nextToken());
             }
         }


           HashMap h = new HashMap();
     }

 }//end of class
