import java.util.ArrayList;
public class Leitor {
    ArrayList<Livro> livros = new ArrayList<Livro>();
    private String nome;
    private int idade;

    public Leitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emprestarLivro(Livro li){
        if(li.isDisponivel() && livros.size() < 3){
            livros.add(li);
            li.setDisponivel(false);
            System.out.println("Livro emprestado: " + li.getTitulo());
            System.out.println();
        }
        else{
            System.out.println("Livro indisponível ou limite de livros atingido");
            System.out.println();
        }
    }


    public void devolverLivro(Livro li){
        if(!li.isDisponivel()){
            li.setDisponivel(true);
            System.out.println("Livro Devolvido");
        }
    }

    public void listarLivrosEmprestados(){
        System.out.println("Livros emprestados por " + nome + ":");
        System.out.println();
        for(Livro li : livros){
            System.out.println(li.getTitulo());
            System.out.println();
        }
    }


        



    
    
    



}
