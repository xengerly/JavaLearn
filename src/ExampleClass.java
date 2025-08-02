public class ExampleClass {
    protected String nikitaName = "Nikita"; //6
    public String publicField = "Nikita"; //11



    public void otherFunction(){ //5
        privateFunction();

    }
    private void privateFunction(){//12
        String result = Example.exampleFunction(nikitaName);
        System.out.println(
                result
        );
    }
}
