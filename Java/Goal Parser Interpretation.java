class Solution {
    public String interpret(String command) {
        
        StringBuilder str = new StringBuilder();
        
        int i=0;
        while(i<command.length()){
            
            if(command.charAt(i) == 'G'){
                str.append("G");
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1)== ')'){
                str.append("o");
            }
             else if(command.charAt(i) == '(' && command.charAt(i+1)!= ')'){
                str.append("al");
            }
            
            i++;
            
        }
        
        return str.toString();
  }
}
