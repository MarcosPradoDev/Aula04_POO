public class Aluno {
    private String nome;
    private String CPF;
    private int ra;
    private String data_nascimento;
    private String sexo;

    public Aluno (String nome, String CPF, int ra, String data_Nascimento, String sexo){
        this.nome = nome;
        this.CPF = CPF;
        this.ra = ra;
        this.data_nascimento = data_Nascimento;
        this.sexo = sexo; 

    }

    public Aluno(){}
    
    public void setNome (String entrada){
        this.nome = entrada;
    }

    public void setRa(int entrada){
        this.ra = entrada;
    }

    public String getNome(){
        return this.nome;
    }

    public int getRa(){
        return this.ra;
    }

}
