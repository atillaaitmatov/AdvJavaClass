class JustExmple {
    public static void main(String[] args) {
        returnSlogan(()->10);
        String slogan = returnSlogan2(type -> "Steve Jobs says: "+type);
        System.out.println(slogan);
    }
    public static void returnSlogan(ExampleInterface exampleInterface){
        System.out.println(exampleInterface.returnSlogan());
    }
    public static String returnSlogan2(ExampleInterfaceLambda<String,String> exampleInterfaceLambda){
        return exampleInterfaceLambda.returnSlogan2("Be Hungry be foolish");
    }
}
interface ExampleInterface{
    int returnSlogan();
}

interface ExampleInterfaceLambda<T,R>{
    R returnSlogan2(T type);
}
