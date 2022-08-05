class CTPolymorphism { 
    static int add(int a,int b){
        return a+b;
    }  
    static int add(int a,int b,int c){
        return a+b+c;
    } 
    static int add(int a){
        return a+20;
    }
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(CTPolymorphism.add(11,11));  
    System.out.println(CTPolymorphism.add(11,11,11));
    System.out.println(CTPolymorphism.add(11));
    } 
}
