class Roman{
     public static void main(String arg[])
     {
        Solution l=new Solution();
       System.out.println( l.romanToInt("XIV"));
     }

}
class Solution
{
   public int romanToInt(String s)
   {int ans=0;
    int pre=0;
     
    int length=s.length();
    if(length==0)
    {
        return 0;
    }
    for(int i=(length-1);i>=0;i--)
    {
        int cur=charCon(s.charAt(i));
        if(i==(length-1))
        {
            ans=ans+cur;
        }
        else{
            if(pre>cur)
            {
                ans=ans-cur;
            }
            else{
                ans=ans+cur;
            }
        }
        pre=cur;
    }



     return ans;
   }
   public int charCon(char c)
   {   int num=0;
       c=Character.toUpperCase(c);
       switch(c){
           case 'I':
           {
               num=1;
               break;
           }
           case 'V':
           {
               num=5;
               break;
           }
           case 'X':
           {
               num=10;
               break;
           }
           case 'L':
           {
               num=50;
               break;
           }
           case 'C':
           {
               num=100;
               break;
           }
           case 'D':
           {
               num=500;
               break;
           }
           case 'M':
           {
               num=1000;
               break;
           }
           default:
           {
               break;
           }
       }
       return num;
   }

}
