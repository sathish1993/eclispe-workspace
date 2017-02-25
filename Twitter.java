package HackerRank;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Twitter {

	/**
	 * @param iscontainPlus 
	 * @param args
	 */
	static String modifyPhoneNumber(String SpaceremPhoneNumber, boolean iscontainPlus){
		
		String StringReplacedPhoneNumber = SpaceremPhoneNumber.replaceAll("\\w(?=\\w{4})","*");
		StringReplacedPhoneNumber=new StringBuilder(StringReplacedPhoneNumber).reverse().toString();
		if(iscontainPlus)
		{
			StringReplacedPhoneNumber=StringReplacedPhoneNumber.substring(0, 4)+"-"+StringReplacedPhoneNumber.substring(4, 7)+"-"+StringReplacedPhoneNumber.substring(7,10)+"-"+StringReplacedPhoneNumber.substring(10, StringReplacedPhoneNumber.length())+"+";
		}
		else
		{
			StringReplacedPhoneNumber=StringReplacedPhoneNumber.substring(0, 4)+"-"+StringReplacedPhoneNumber.substring(4, 7)+"-"+StringReplacedPhoneNumber.substring(7,10);
		}
		 StringReplacedPhoneNumber=new StringBuilder(StringReplacedPhoneNumber).reverse().toString();

		return StringReplacedPhoneNumber;
	}
	
	static String modifyEmail(String Email){
		String email=(String) Email.split("@")[0];
		String NewEmail=email.charAt(0)+"*****"+email.charAt(email.length()-1)+"@"+(String) Email.split("@")[1];
		
		return NewEmail;
	}
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		while(input.hasNext()){
			String Input = input.nextLine();
			Input = Input.replaceAll("[\\s]", "");
			if(Input.startsWith("P:")){
				Input =Input.substring(2, Input.length());
				Pattern phonePtrn = Pattern.compile("^\\+?([_0-9()-]+)*$");
				 Matcher matcher = phonePtrn .matcher(Input);
				        if(matcher.matches())
				        {
				        	if(Input.contains("+"))
				        	{
				        		Input=Input.replaceAll("\\(","").replaceAll("\\)", "").replaceAll("\\+","").replaceAll("\\-", "");
				        			if(Input.length()>10&&Input.length()<14)
				        			{
				        				System.out.println("P:"+ Twitter.modifyPhoneNumber(Input,true));
				        			}
				        	}
				        	else
				        	{
				        		if(Input.length()==10)
				        		{
				        			System.out.println("P:"+ Twitter.modifyPhoneNumber(Input,false));
				        		}
				        	}
				        }
			}
			else if(Input.startsWith("E:")){
				Input =Input.substring(2, Input.length());
				Pattern emailNamePtrn = Pattern.compile(
				 "^[_A-Za-z0-9_!#$%&'*+/=?^_{|}~-]+(\\.[_A-Za-z0-9_!#$%&'*+/=?^_{|}~-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matcher = emailNamePtrn .matcher(Input);
		        if(matcher.matches())
				{
		        	System.out.println("E:"+  Twitter.modifyEmail(Input));
				}
			}
			
		}
		
	}

}