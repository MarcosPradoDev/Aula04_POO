public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Aluno larissa = new Aluno("larissa", "123.456.356-69", 21025, "27/02/96", "Feninino");
        larissa.setNome("Larissa");
        System.out.println(larissa.getNome());
        System.out.println(larissa.getRa());


        Aluno samuel = new Aluno();
        samuel.setNome("Samuel");
        System.out.println(samuel.getNome());


    }
}
