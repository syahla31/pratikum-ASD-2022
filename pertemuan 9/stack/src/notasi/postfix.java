/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasi;

/**
 *
 * @author acer E5
 */
public class postfix {
    int n, top;
    char[] stack;
    
    public postfix(int total){
        n = total;
        top = -1; // penanda kosong
        stack = new char[n];
        push('(');
    }
    
    public void push(char c){ // memasukkan
        top++;
        stack[top] = c;
    }
    
    public char pop() { // pengambilan 
        char item = stack[top];
        top--;
        return item;
    }
    
    public boolean isOperand(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == ','){   
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isOperator(char c){
        if( c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+'){
            return true;
        } else {
            return false;
        }
    }
    
    public int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }
    
    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++){
            c = Q.charAt(i); // pembacaan karakter
            if(isOperand(c)){ 
                P = P + c;
            }
            if ( c == '('){
                push(c);
            }
            if ( c == ')'){
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if(isOperator(c)){
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
