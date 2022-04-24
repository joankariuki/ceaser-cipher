public class cipher {

        public static  String encode(String plainText, int shift){
            if(shift>26){
                shift = shift%26;
            }
            else if(shift<0){
                shift = (shift%26)+26;
            }
            StringBuilder cipherText = new StringBuilder();
            int length =plainText.length();
            for(int i=0; i<length; i++){
                char ch = plainText.charAt(i);
                if(Character.isLetter(ch)){
                    if(Character.isLowerCase(ch)){
                        char c = (char) (ch+shift);
                        if(c>'z'){
                            cipherText.append((char) (ch - (26 - shift)));
                        }
                        else{
                            cipherText.append(c);
                        }


                    }
                    else if(Character. isUpperCase(ch)){
                        char c = (char) (ch+shift);
                        if(c>'Z'){
                            cipherText.append((char) (ch - (26 - shift)));
                        }
                        else{
                            cipherText.append(c);
                        }


                    }
                    else{
                        cipherText.append(ch);

                    }
                }
            }
            return cipherText.toString();
        }


    private static  String decode(String plainText, int shift){
        if(shift>26){
            shift = shift%26;
        }
        else if(shift<0){
            shift = (shift%26)+26;
        }
        String cipherText = "";
        int length =plainText.length();
        for(int i=0; i<length; i++){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char) (ch-shift);
                    if(c<'a'){
                        cipherText += (char)(ch +(26-shift));
                    }
                    else{
                        cipherText += c;
                    }


                }
                else if(Character. isUpperCase(ch)){
                    char c = (char) (ch-shift);
                    if(c<'A'){
                        cipherText +=(char) (ch +(26-shift));
                    }
                    else{
                        cipherText += c;
                    }


                }
                else{
                    cipherText +=ch;

                }
            }
        }
        return cipherText;
    }


        public static void main(String[] args) {
            String text ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
            String cipher =encode(text, 6);
            System.out.println(cipher);
            String decoded =decode(cipher,6);
            System.out.println(decoded);


        }
    }


