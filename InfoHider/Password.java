package InfoHider;

class Password {
    private String password;
    private int minLength;
    public Password(int minLength) {
        this.minLength = minLength;
        this.password = null;
    }
    public boolean setPassword(String password){
        if (password.length() >= minLength) {
            this.password = password;
            return true;
        }
        return false;
    }
    public String getMaskedPassword() {
        if (password == null) {
            return "";
        }
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            masked.append("*");
        }
        return masked.toString();
    }
    public boolean checkPassword(String attempt){
        if (password == null){
            return false;
        }
        return password.equals(attempt);
    }
    public int getLength(){
        if (password == null){
            return 0;
        }
        return password.length();
    }
}
