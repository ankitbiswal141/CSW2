import java.util.stream.IntStream;
public class Q2{
public static void main(String args[]){
try{
String input="abc123def456";
String numericString=parseString(input);
if(numericString==null){
System.out.println("Nonumericcharacterswereprecededbyavowelandconsonant.");
}else{
System.out.println(numericString);
}
}catch(NullPointerException e){
System.err.println("NullPointerExceptionwasthrown:"+e.getMessage());
}
}
public static String parseString(Stringinput){
if(input==null || input.isEmpty()){
throw new NullPointerException("Inputstringisnullorempty.");
}
StringBuilder numericString=new StringBuilder();
for(int i=0;i<input.length()-1;i++){
char currChar=input.charAt(i);
if(Character.isAlphabetic(currChar)){
if(isVowel(currChar)&&Character.isDigit(input.charAt(i+1))){
numericString.append(input.charAt(i+1));
}
}
}
if(numericString.length()==0){
return null;
}
return numericString.toString();
}
publicstaticbooleanisVowel(charcharacter){
return"aeiou".indexOf(character)>-1;
}
}