public class VowelsByNextConsonants {
    public static void main(String[] args){
        String input="you are welcome";
        char[] ch=input.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]==i){
              char next=(char)(ch[i]+1);
                System.out.print(next);
            }else{
                System.out.print(ch[i]);
            }


        }




    }
}
