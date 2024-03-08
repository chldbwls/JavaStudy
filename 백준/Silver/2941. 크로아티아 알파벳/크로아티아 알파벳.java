public class Main {
	public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int count=0;
        String s = scanner.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='c'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='='){
                        i++;
                    }else if(s.charAt(i+1)=='-'){
                        i++;
                    }
                }
            }else if(s.charAt(i)=='d'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='z'){
                        if(i<s.length()-2){
                            if(s.charAt(i+2)=='='){
                                i++;
                                i++;
                            }
                        }
                    }else if(s.charAt(i+1)=='-'){
                        i++;
                    }
                }
            }else if(s.charAt(i)=='l'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='j'){
                        i++;
                    }
                }
            }else if(s.charAt(i)=='n'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='j'){
                        i++;
                    }
                }
            }else if(s.charAt(i)=='s'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='='){
                        i++;
                    }
                }
            }
            else if(s.charAt(i)=='z'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='='){
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
        scanner.close();
	}
} 
