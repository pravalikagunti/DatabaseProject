/*
 *Gunti database project
 */
package guntiproject;

public class Validation {
    //check empty
    public static boolean isEmpty(String str){
        return str.isEmpty();
    }
    //chek letter
    public static boolean isLetter(String str){
        char ch[]=str.toCharArray();
        for(char c:ch)
            if(!Character.isLetter(c))
                return false;
        return true;
    }
    //check digit
    public static boolean isDigit(String str){
        char ch[]=str.toCharArray();
        for(char c:ch)
            if(!Character.isDigit(c))
                return false;
        return true;
    //check letter and digit
    }
    public static boolean isADL(String str){
		int cL=0,size=str.length();
		char ch[]=str.toCharArray();
        for(char c:ch){
			if(!Character.isLetter(c)&&!Character.isDigit(c))
				return false;
			else{
				if(Character.isLetter(c))
					cL++;
			}
		}
			if(cL!=size&&cL!=0)
				return true;
			return false;
			
    }
    //check letter or digit 
    public static boolean isRDL(String str){
        char ch[]=str.toCharArray();
        for(char c:ch)
            if(!Character.isLetter(c) && !Character.isDigit(c))
                return false;
        return true;
    }
	//email check
	public static boolean isEmail(String str){
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(str.matches(EMAIL_REGEX))
			return true;
		return false;
	}
	//password at least 6 and have 1 (capital small digit special) expect !\
	public static boolean isPassword(String str){
		int cL=0,cD=0,size=str.length(),sL=0;
		char ch[]=str.toCharArray();
        for(char c:ch){
			if(Character.isLetter(c)){
					if(c>=97)
						cL++;
					else
						sL++;
				}
				if(Character.isDigit(c))
					cD++;
		}
			if(((cL+cD+sL)<size)&&cL!=0&&cD!=0&&sL!=0&&size>=6)
				return true;
			return false;
			
	}
	//for selection
	public static boolean isSelect(String str){
		if(!str.equalsIgnoreCase("select"))
			return false;
		return true;
	}
	//for mobile
	public static boolean isMobile(String str){
		char ch[]=str.toCharArray();
		for(char c:ch)
			if(str.length()!=10||!Character.isDigit(c))
			return false;
		return true;
	}
   
}
