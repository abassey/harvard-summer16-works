public class Name {
    private String first;
    private char middle;
    private String last;
    
    public Name(String f, char m, String l) {
        
        this.first = f;
        this.middle  = m;
        this.last = l;
    }
    
    public Name(String f, String l) {
        
        this.first = f;
        this.last = l;
    }
    
    public String getNormalOrder() {
        
        String full = "";
        
        if (middle != ' '){
        full += first + " ";
        full += middle + "." + " ";
        full += last;
        return full;
        } else {
        full += first + " ";
        full += last;
        return full;
        }
        
    }
    public String getReverseOrder() {
        
        String reverse = "";
        
        if (middle != ' '){
        reverse += last + "," + " ";
        reverse += first + " ";
        reverse += middle + "." + " ";
        return reverse;
        } else {
        reverse += last + "," + " ";
        reverse += first + " ";
        return reverse;
        }
    }
    public String getInitials() {
        String initials = "";
        initials += first.charAt(0);
        initials += middle;
        initials += last.charAt(0);
        return initials;   
    }
    
}