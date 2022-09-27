public class Person {
    
    @Override
    public String toString() {
        return super.toString();
    }

    public String getCpf() {
        return "{Individual}, CPF" + this.getCpf();
    }
    public String getCnpj() {
        return "{Legal}, CNPJ" + this.getCnpj();
    }
}
